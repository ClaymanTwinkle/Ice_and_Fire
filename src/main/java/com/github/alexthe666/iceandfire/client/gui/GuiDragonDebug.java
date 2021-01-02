package com.github.alexthe666.iceandfire.client.gui;

import com.github.alexthe666.iceandfire.IceAndFire;
import com.github.alexthe666.iceandfire.entity.DragonType;
import com.github.alexthe666.iceandfire.entity.EntityDragonBase;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ai.EntityAITasks;
import net.minecraft.entity.ai.attributes.IAttributeInstance;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.pathfinding.Path;
import net.minecraft.pathfinding.PathNavigate;
import net.minecraft.pathfinding.PathNavigateGround;
import net.minecraft.pathfinding.PathPoint;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.WorldServer;
import net.minecraftforge.client.GuiIngameForge;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.lwjgl.input.Keyboard;

import java.awt.*;
import java.text.DecimalFormat;
import java.util.Collection;

public class GuiDragonDebug extends Gui {

    private static final int WHITE = 0xFFFFFF;
    private static final int GREY = 0xAAAAAA;
    private static final int YELLOW = 0xFFFF00;
    private static final int RED = 0xFF8888;

    public static Object probe;
    public static boolean enabled = true;

    private final Minecraft mc = Minecraft.getMinecraft();
    private final FontRenderer fr;
    private final GuiTextPrinter text;
    private final DecimalFormat dfShort = new DecimalFormat("0.00");
    private final DecimalFormat dfLong = new DecimalFormat("0.0000");
    private ScaledResolution res;
    private EntityDragonBase dragonClient;
    private EntityDragonBase dragonServer;

    public static final GuiDragonDebug INSTANCE = new GuiDragonDebug();

    public GuiDragonDebug() {
        fr = mc.fontRenderer;
        text = new GuiTextPrinter(fr);
    }

    public void setupDragon(EntityDragonBase dragon) {
        if(!dragon.isServerWorld()) {
            if ((dragonClient != null && (dragon.getEntityId() == dragonClient.getEntityId())) || dragon == null) {
                dragonClient = null;
            } else {
                dragonClient = dragon;
            }
            getServerDragon();
        }
    }

    @SubscribeEvent
    public void onRenderOverlay(RenderGameOverlayEvent event) {
        if (!enabled || event.isCancelable() || event.getType() != RenderGameOverlayEvent.ElementType.TEXT) {
            return;
        }

        if (dragonClient != null) {
            GuiIngameForge ingameGUI = (GuiIngameForge) mc.ingameGUI;
            res = ingameGUI.getResolution();

            renderTitle();

            try {
                if (Keyboard.isKeyDown(Keyboard.KEY_LCONTROL)) {
                    renderNavigation();
                    renderAttributes();
                } else {
                    renderEntityInfo();
                    renderAITasks();
//                    renderWatchedObjects();
                }

                renderProbe();
            } catch (Exception ex) {
                renderException(ex);
            }

            if (dragonClient.isDead) {
                dragonClient = null;
                dragonServer = null;
            }
        }
    }

    private void getServerDragon() {
        if (!mc.isSingleplayer()) {
            // not possible on dedicated
            return;
        }

        if (dragonClient == null) {
            // client dragon required
            dragonServer = null;
            return;
        }

        if (dragonServer != null && dragonServer.getEntityId() == dragonClient.getEntityId()) {
            // done before
            return;
        }

        MinecraftServer mcs = mc.getIntegratedServer();

        if (mcs != null) {
            for (WorldServer ws : mcs.worlds) {
                Entity ent = ws.getEntityByID(dragonClient.getEntityId());
                if (ent instanceof EntityDragonBase) {
                    dragonServer = (EntityDragonBase) ent;
                    return;
                }
            }
        }
    }

    private EntityDragonBase getSelectedDragon() {
        return Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) ? dragonClient : dragonServer;
    }

    private void renderTitle() {
        String title = String.format("%s %s Debug", IceAndFire.NAME, IceAndFire.VERSION);

        text.setOrigin(16, 8);
        text.setColor(GREY);
        text.println(title);
        text.setColor(WHITE);
    }

    private void renderEntityInfo() {
        EntityDragonBase dragon = getSelectedDragon();
        if (dragon == null) {
            return;
        }

        text.setOrigin(16, 32);

        text.setColor(YELLOW);
        text.println("Entity");
        text.setColor(WHITE);

        text.println("Side: " + (dragon.isServerWorld() ? "server" : "client"));

        text.println("ID: " + dragon.getEntityId());
        text.println("UUID: " + StringUtils.abbreviate(dragon.getUniqueID().toString(), 22));
        text.println("Name: " + dragon.getName());

        // position
        String px = dfShort.format(dragon.posX);
        String py = dfShort.format(dragon.posY);
        String pz = dfShort.format(dragon.posZ);
        String mx = dfShort.format(dragon.motionX);
        String my = dfShort.format(dragon.motionY);
        String mz = dfShort.format(dragon.motionZ);
        text.printf("x: %s y: %s z: %s\n", px, py, pz, mx, my, mz);

        // rotation
        String pitch = dfShort.format(dragon.rotationPitch);
        String yaw = dfShort.format(dragon.rotationYaw);
        String yawHead = dfShort.format(dragon.rotationYawHead);
        text.printf("p: %s y: %s yh: %s\n", pitch, yaw, yawHead);

        // health
        String health = dfShort.format(dragon.getHealth());
        String healthMax = dfShort.format(dragon.getMaxHealth());
        String hunger = dfShort.format(dragon.getHunger());
        text.printf("Health: %s/%s (%s%%)\n", health, healthMax, hunger);

        // breed
        text.print("Breed: ");
        DragonType dragonType = dragon.dragonType;
        text.setColor(dragonType.isPiscivore()? Color.blue.getRGB() : Color.RED.getRGB());
        text.println(dragonType.getName());
        text.setColor(WHITE);

        // life stage
        text.printf("Life stage: %d\n", dragon.getDragonStage());

        // size
        String scale = dfShort.format(dragon.lastScale);
        String width = dfShort.format(dragon.width);
        String height = dfShort.format(dragon.height);
        text.printf("Size: %s (w:%s h:%s)\n", scale, width, height);

        // tamed flag/owner name
        //String tamedString = dragon.getOwnerName();
        String tamedString;
        if (dragon.isTamed()) {
            Entity player = dragon.getOwner();
            if (player != null) {
                tamedString = "yes (" + player.getName() + ")";
            } else {
                tamedString = "yes (" + StringUtils.abbreviate(dragon.getOwnerId().toString(), 22) + ")";
            }
        } else {
            tamedString = "no";
        }
        text.println("Tamed: " + tamedString);

        String attackTarget = dragon.getAttackTarget() == null ? "null" : dragon.getAttackTarget().getName();
        text.println("Attack Target: " + attackTarget);

        boolean isInLove = dragon.isInLove();
        text.println("isInLove: " + isInLove);
    }

    private void renderAttributes() {
        EntityDragonBase dragon = getSelectedDragon();
        if (dragon == null) {
            return;
        }

        text.setOrigin(text.getX() + 180, 8);

        text.setColor(YELLOW);
        text.println("Attributes");
        text.setColor(WHITE);

        Collection<IAttributeInstance> attribs = dragon.getAttributeMap().getAllAttributes();

        attribs.forEach(attrib -> {
            String attribName = net.minecraft.util.text.translation.I18n.translateToLocal("attribute.name." + attrib.getAttribute().getName());
            String attribValue = dfShort.format(attrib.getAttributeValue());
            String attribBase = dfShort.format(attrib.getBaseValue());
            text.println(attribName + " = " + attribValue + " (" + attribBase + ")");
        });

        text.println();
    }

    private void renderNavigation() {
        text.setOrigin(16, 32);

        text.setColor(YELLOW);
        text.println("Navigation (Ground)");
        text.setColor(WHITE);

        PathNavigate nav = dragonServer.getNavigator();
        PathNavigateGround pathNavigateGround = null;
        if (nav instanceof PathNavigateGround) {
            pathNavigateGround = (PathNavigateGround) nav;
        }

        text.println("Search range: " + nav.getPathSearchRange());
        text.println("Can swim: " + (pathNavigateGround == null ? "N/A" : pathNavigateGround.getCanSwim()));
        text.println("Break doors: " + (pathNavigateGround == null ? "N/A" : pathNavigateGround.getEnterDoors()));
        text.println("No path: " + nav.noPath());

        Path path = nav.getPath();

        if (path != null) {
            text.println("Length: " + path.getCurrentPathLength());
            text.println("Index: " + path.getCurrentPathIndex());

            PathPoint finalPoint = path.getFinalPathPoint();
            text.println("Final point: " + finalPoint);
        }

        text.println();

        text.setColor(YELLOW);
        text.println("Navigation (Air)");
        text.setColor(WHITE);

        text.println("Flying: " + dragonClient.isFlying());
        text.println("Hovering: " + dragonClient.isHovering());
    }

    private void renderAITasks() {
        if (dragonServer == null) {
            return;
        }

        text.setOrigin(text.getX() + 180, 8);

        text.setColor(YELLOW);
        text.println("AI tasks");
        text.setColor(WHITE);

        for (EntityAITasks.EntityAITaskEntry taskEntry : dragonServer.tasks.taskEntries) {
            if (taskEntry.using) {
                text.println("" + taskEntry.action.getClass().getSimpleName());
            }
        }
    }

    private void renderProbe() {
        if (probe == null) {
            return;
        }

        text.setOrigin(16, res.getScaledHeight() - text.getLineSpace() * 2);

        text.println(probe.getClass().getSimpleName() + ":" + probe);
    }

    private void renderException(Exception ex) {
        text.setOrigin(16, 32);

        text.setColor(RED);
        text.println("GUI exception:");
        text.printf(ExceptionUtils.getStackTrace(ex));
        text.setColor(WHITE);
    }
}