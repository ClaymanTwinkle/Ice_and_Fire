package com.github.alexthe666.iceandfire.client.gui;

import net.minecraft.client.gui.FontRenderer;

public class GuiTextPrinter {

    private final FontRenderer fr;
    private int xOrigin;
    private int yOrigin;
    private int x;
    private int y;
    private int yLineSpace = 12;
    private int color;

    public GuiTextPrinter(FontRenderer fr) {
        this.fr = fr;
    }

    private void newLine() {
        x = xOrigin;
        y += yLineSpace;
    }

    public void print(String text) {
        if (fr == null) return;  //  just in case...
        String[] lines = text.split("\n", -1);
        if (lines.length > 1) {
            for (int i = 0; i < lines.length; i++) {
                if (!lines[i].isEmpty()) {
                    String line = lines[i];
                    // replace common special chars
                    line = line.replace("\r", "");
                    line = line.replace("\t", "    ");
                    fr.drawStringWithShadow(line, x, y, color);
                }
                if (i != lines.length - 1) {
                    newLine();
                } else {
                    x += fr.getStringWidth(lines[i]);
                }
            }
        } else {
            fr.drawStringWithShadow(text, x, y, color);
            x += fr.getStringWidth(text);
        }
    }

    public void println(String text) {
        print(text);
        newLine();
    }

    public void println() {
        newLine();
    }

    public void printf(String format, Object... args) {
        print(String.format(format, args));
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public void setOrigin(int x, int y) {
        this.x = x;
        this.y = y;

        xOrigin = x;
        yOrigin = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getLineSpace() {
        return yLineSpace;
    }

    public void setLineSpace(int yLineSpace) {
        this.yLineSpace = yLineSpace;
    }
}