package com.github.alexthe666.iceandfire.client.model;

import com.github.alexthe666.iceandfire.entity.EntityHippogryph;
import com.github.alexthe666.iceandfire.enums.EnumHippogryphTypes;
import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.minecraft.entity.Entity;

public class ModelHippogryph extends ModelDragonBase {
	public AdvancedModelRenderer Body;
	public AdvancedModelRenderer Neck;
	public AdvancedModelRenderer FrontThighR;
	public AdvancedModelRenderer HindThighR;
	public AdvancedModelRenderer Tail1;
	public AdvancedModelRenderer FrontThighL;
	public AdvancedModelRenderer HindThighL;
	public AdvancedModelRenderer WingL;
	public AdvancedModelRenderer WingR;
	public AdvancedModelRenderer Saddle;
	public AdvancedModelRenderer Neck2;
	public AdvancedModelRenderer Head;
	public AdvancedModelRenderer HeadPivot;
	public AdvancedModelRenderer Jaw;
	public AdvancedModelRenderer Beak;
	public AdvancedModelRenderer Quill_R;
	public AdvancedModelRenderer Quill_L;
	public AdvancedModelRenderer Crest;
	public AdvancedModelRenderer NoseBand;
	public AdvancedModelRenderer BeakTip;
	public AdvancedModelRenderer Beak2;
	public AdvancedModelRenderer ReinL;
	public AdvancedModelRenderer ReinR;
	public AdvancedModelRenderer FrontLegR;
	public AdvancedModelRenderer FrontFootR;
	public AdvancedModelRenderer HindLegR;
	public AdvancedModelRenderer HindFootR;
	public AdvancedModelRenderer Tail2;
	public AdvancedModelRenderer Tail3;
	public AdvancedModelRenderer FrontLegL;
	public AdvancedModelRenderer FrontFootL;
	public AdvancedModelRenderer HindLegL;
	public AdvancedModelRenderer HindFootL;
	public AdvancedModelRenderer WingL2;
	public AdvancedModelRenderer WingL3;
	public AdvancedModelRenderer FingerL1;
	public AdvancedModelRenderer FingerL2;
	public AdvancedModelRenderer FingerL3;
	public AdvancedModelRenderer FingerL4;
	public AdvancedModelRenderer WingR2;
	public AdvancedModelRenderer WingR3;
	public AdvancedModelRenderer FingerR1;
	public AdvancedModelRenderer FingerR2;
	public AdvancedModelRenderer FingerR4;
	public AdvancedModelRenderer FingerR3;
	public AdvancedModelRenderer ChestR;
	public AdvancedModelRenderer ChestL;
	public AdvancedModelRenderer Saddleback;
	public AdvancedModelRenderer SaddleFront;
	public AdvancedModelRenderer StirrupL;
	public AdvancedModelRenderer StirrupR;
	public AdvancedModelRenderer StirrupIronL;
	public AdvancedModelRenderer StirrupIronR;
	private ModelAnimator animator;

	public ModelHippogryph() {
		this.textureWidth = 128;
		this.textureHeight = 128;
		this.HeadPivot = new AdvancedModelRenderer(this, 0, 0);
		this.HeadPivot.setRotationPoint(0.0F, -4.6F, 2.2F);
		this.HeadPivot.addBox(0, 0, 0, 0, 0, 0, 0.0F);
		this.setRotateAngle(HeadPivot, -0.136659280431156F, 0.0F, 0.0F);
		this.Head = new AdvancedModelRenderer(this, 0, 68);
		this.Head.addBox(-2.5F, -3.7F, -5.7F, 5, 6, 7, 0.0F);
		this.HindThighL = new AdvancedModelRenderer(this, 96, 29);
		this.HindThighL.mirror = true;
		this.HindThighL.setRotationPoint(4.0F, -2.0F, 2.0F);
		this.HindThighL.addBox(-2.5F, -2.0F, -2.5F, 4, 9, 5, 0.0F);
		this.WingR3 = new AdvancedModelRenderer(this, 60, 100);
		this.WingR3.mirror = true;
		this.WingR3.setRotationPoint(-0.1F, 11.1F, 0.1F);
		this.WingR3.addBox(-0.3F, -0.1F, -5.0F, 1, 14, 11, 0.0F);
		this.FingerR4 = new AdvancedModelRenderer(this, 50, 80);
		this.FingerR4.mirror = true;
		this.FingerR4.setRotationPoint(0.1F, 4.6F, 1.9F);
		this.FingerR4.addBox(0.0F, -0.1F, -2.0F, 1, 15, 4, 0.0F);
		this.setRotateAngle(FingerR4, 0.12217304763960307F, 0.0F, 0.0F);
		this.Neck2 = new AdvancedModelRenderer(this, 1, 13);
		this.Neck2.setRotationPoint(0.0F, -8.7F, 0.0F);
		this.Neck2.addBox(-2.0F, -7.0F, -2F, 4, 8, 7, 0.0F);
		this.setRotateAngle(Neck2, -0.40980330836826856F, 0.0F, 0.0F);
		this.Crest = new AdvancedModelRenderer(this, 29, 76);
		this.Crest.setRotationPoint(0.0F, -3.3F, 1.1F);
		this.Crest.addBox(0.0F, -5.0F, 0.1F, 1, 8, 6, 0.0F);
		this.setRotateAngle(Crest, -1.6845917940249266F, 0.0F, 0.0F);
		this.ReinR = new AdvancedModelRenderer(this, 46, 55);
		this.ReinR.mirror = true;
		this.ReinR.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ReinR.addBox(-3.1F, -6.0F, -3.4F, 0, 3, 19, 0.0F);
		this.setRotateAngle(ReinR, -0.04363323129985824F, 0.0F, 0.0F);
		this.WingR2 = new AdvancedModelRenderer(this, 30, 100);
		this.WingR2.mirror = true;
		this.WingR2.setRotationPoint(0.2F, 11.2F, 0.2F);
		this.WingR2.addBox(-0.3F, -0.1F, -5.0F, 1, 15, 11, 0.0F);
		this.setRotateAngle(WingR2, 1.9896753472735356F, -0.10471975511965977F, -0.03490658503988659F);
		this.StirrupL = new AdvancedModelRenderer(this, 70, 0);
		this.StirrupL.setRotationPoint(5.0F, 1.0F, 0.0F);
		this.StirrupL.addBox(-0.5F, 0.0F, -0.5F, 1, 6, 1, 0.0F);
		this.FingerR3 = new AdvancedModelRenderer(this, 50, 80);
		this.FingerR3.mirror = true;
		this.FingerR3.setRotationPoint(0.1F, 8.5F, 1.6F);
		this.FingerR3.addBox(-0.1F, -0.1F, -2.0F, 1, 15, 4, 0.0F);
		this.setRotateAngle(FingerR3, 0.03490658503988659F, 0.0F, 0.0F);
		this.HindLegR = new AdvancedModelRenderer(this, 96, 43);
		this.HindLegR.setRotationPoint(0.0F, 7.0F, 0.0F);
		this.HindLegR.addBox(-1.0F, 0.0F, -1.5F, 3, 5, 3, 0.0F);
		this.HindLegL = new AdvancedModelRenderer(this, 96, 43);
		this.HindLegL.mirror = true;
		this.HindLegL.setRotationPoint(0.0F, 7.0F, 0.0F);
		this.HindLegL.addBox(-2.0F, 0.0F, -1.5F, 3, 5, 3, 0.0F);
		this.StirrupR = new AdvancedModelRenderer(this, 80, 0);
		this.StirrupR.setRotationPoint(-5.0F, 1.0F, 0.0F);
		this.StirrupR.addBox(-0.5F, 0.0F, -0.5F, 1, 6, 1, 0.0F);
		this.ChestR = new AdvancedModelRenderer(this, 0, 34);
		this.ChestR.setRotationPoint(-4.5F, 1.0F, 8.0F);
		this.ChestR.addBox(-3.0F, 0.0F, -3.0F, 8, 8, 3, 0.0F);
		this.setRotateAngle(ChestR, 0.0F, 1.5707963267948966F, 0.0F);
		this.StirrupIronR = new AdvancedModelRenderer(this, 74, 4);
		this.StirrupIronR.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.StirrupIronR.addBox(-0.5F, 6.0F, -1.0F, 1, 2, 2, 0.0F);
		this.Jaw = new AdvancedModelRenderer(this, 24, 67);
		this.Jaw.setRotationPoint(0.0F, 2.2F, -0.8F);
		this.Jaw.addBox(-2.0F, -0.3F, -8.4F, 4, 1, 7, 0.0F);
		this.FingerL1 = new AdvancedModelRenderer(this, 50, 80);
		this.FingerL1.setRotationPoint(-0.1F, 11.1F, 0.1F);
		this.FingerL1.addBox(-0.3F, -0.1F, -5.0F, 1, 15, 4, 0.0F);
		this.Neck = new AdvancedModelRenderer(this, 1, 19);
		this.Neck.setRotationPoint(0.0F, -2F, -16.2F);
		this.Neck.addBox(-2.0F, -8.8F, -2.0F, 4, 9, 7, 0.0F);
		this.setRotateAngle(Neck, 0.7285004297824331F, 0.0F, 0.0F);
		this.FingerL2 = new AdvancedModelRenderer(this, 50, 80);
		this.FingerL2.setRotationPoint(-0.1F, 11.1F, 0.1F);
		this.FingerL2.addBox(-0.4F, -0.1F, -2.9F, 1, 15, 4, 0.0F);
		this.setRotateAngle(FingerL2, 0.03490658503988659F, 0.0F, 0.0F);
		this.Quill_R = new AdvancedModelRenderer(this, 22, 81);
		this.Quill_R.setRotationPoint(-2.0F, -3.3F, 0.9F);
		this.Quill_R.addBox(-0.5F, -4.5F, -0.6F, 1, 5, 2, 0.0F);
		this.setRotateAngle(Quill_R, -1.1838568316277536F, -0.17453292519943295F, 0.0F);
		this.Tail1 = new AdvancedModelRenderer(this, 44, 0);
		this.Tail1.setRotationPoint(0.0F, -8.1F, 5.0F);
		this.Tail1.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 3, 0.0F);
		this.setRotateAngle(Tail1, -1.1344640137963142F, 0.0F, 0.0F);
		this.WingR = new AdvancedModelRenderer(this, 0, 100);
		this.WingR.mirror = true;
		this.WingR.setRotationPoint(-4.5F, -7.0F, -13.5F);
		this.WingR.addBox(-0.4F, 0.0F, -5.0F, 1, 13, 12, 0.0F);
		this.setRotateAngle(WingR, -0.22689280275926282F, -0.13962634015954636F, 0.45378560551852565F);
		this.Beak = new AdvancedModelRenderer(this, 0, 84);
		this.Beak.setRotationPoint(0.0F, 1.0F, -6.1F);
		this.Beak.addBox(-2.01F, -3.2F, -4.0F, 4, 4, 5, 0.0F);
		this.HindFootR = new AdvancedModelRenderer(this, 96, 51);
		this.HindFootR.setRotationPoint(0.0F, 5.0F, 0.0F);
		this.HindFootR.addBox(-1.5F, 0.0F, -2.0F, 4, 3, 4, 0.0F);
		this.Body = new AdvancedModelRenderer(this, 0, 34);
		this.Body.setRotationPoint(0.0F, 12.0F, 4.0F);
		this.Body.addBox(-5.0F, -8.0F, -19.0F, 10, 10, 24, 0.0F);
		this.BeakTip = new AdvancedModelRenderer(this, 14, 81);
		this.BeakTip.setRotationPoint(0.0F, 0.6F, -2.7F);
		this.BeakTip.addBox(-1.0F, -2.8F, -1.7F, 2, 5, 1, 0.0F);
		this.Quill_L = new AdvancedModelRenderer(this, 22, 81);
		this.Quill_L.mirror = true;
		this.Quill_L.setRotationPoint(2.0F, -3.3F, 0.9F);
		this.Quill_L.addBox(-0.5F, -4.5F, -0.6F, 1, 5, 2, 0.0F);
		this.setRotateAngle(Quill_L, -1.1838568316277536F, 0.17453292519943295F, 0.0F);
		this.Beak2 = new AdvancedModelRenderer(this, 0, 84);
		this.Beak2.setRotationPoint(0.0F, 0.1F, 0.0F);
		this.Beak2.addBox(-2F, -3.2F, -4.0F, 4, 4, 5, 0.0F);
		this.FrontFootL = new AdvancedModelRenderer(this, 59, 51);
		this.FrontFootL.mirror = true;
		this.FrontFootL.setRotationPoint(0.0F, 5.4F, -0.5F);
		this.FrontFootL.addBox(-2.5F, 0.0F, -4.4F, 4, 2, 5, 0.0F);
		this.ReinL = new AdvancedModelRenderer(this, 46, 55);
		this.ReinL.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ReinL.addBox(3.1F, -6.3F, -3.4F, 0, 3, 19, 0.0F);
		this.setRotateAngle(ReinL, -0.04363323129985824F, 0.0F, 0.0F);
		this.FrontFootR = new AdvancedModelRenderer(this, 59, 51);
		this.FrontFootR.setRotationPoint(0.0F, 5.4F, -0.5F);
		this.FrontFootR.addBox(-1.5F, 0.0F, -4.4F, 4, 2, 5, 0.0F);
		this.Saddle = new AdvancedModelRenderer(this, 80, 0);
		this.Saddle.setRotationPoint(0.0F, -8.9F, -7.0F);
		this.Saddle.addBox(-5.0F, 0.0F, -3.0F, 10, 1, 8, 0.0F);
		this.FrontLegR = new AdvancedModelRenderer(this, 60, 41);
		this.FrontLegR.setRotationPoint(0.0F, 6.7F, 0.0F);
		this.FrontLegR.addBox(-0.5F, 0.0F, -1.6F, 2, 7, 3, 0.0F);
		this.FrontThighR = new AdvancedModelRenderer(this, 60, 27);
		this.FrontThighR.mirror = true;
		this.FrontThighR.setRotationPoint(-4.5F, -1.0F, -16.7F);
		this.FrontThighR.addBox(-1.1F, -1.0F, -2.1F, 3, 8, 4, 0.0F);
		this.FingerL4 = new AdvancedModelRenderer(this, 50, 80);
		this.FingerL4.setRotationPoint(-0.1F, 4.6F, 1.9F);
		this.FingerL4.addBox(-0.6F, -0.1F, -2.0F, 1, 15, 4, 0.0F);
		this.setRotateAngle(FingerL4, 0.12217304763960307F, 0.0F, 0.0F);
		this.HindFootL = new AdvancedModelRenderer(this, 96, 51);
		this.HindFootL.mirror = true;
		this.HindFootL.setRotationPoint(0.0F, 5.0F, 0.0F);
		this.HindFootL.addBox(-2.5F, 0.0F, -2.0F, 4, 3, 4, 0.0F);
		this.FingerR1 = new AdvancedModelRenderer(this, 50, 80);
		this.FingerR1.mirror = true;
		this.FingerR1.setRotationPoint(0.1F, 11.1F, 0.1F);
		this.FingerR1.addBox(-0.3F, -0.1F, -5.0F, 1, 15, 4, 0.0F);
		this.setRotateAngle(FingerR1, 0.13962634015954636F, 0.0F, 0.0F);
		this.ChestL = new AdvancedModelRenderer(this, 0, 47);
		this.ChestL.setRotationPoint(4.5F, 1.0F, 8.0F);
		this.ChestL.addBox(-3.0F, 0.0F, 0.0F, 8, 8, 3, 0.0F);
		this.setRotateAngle(ChestL, 0.0F, 1.5707963267948966F, 0.0F);
		this.NoseBand = new AdvancedModelRenderer(this, 85, 60);
		this.NoseBand.setRotationPoint(0.0F, 7.4F, -2.1F);
		this.NoseBand.addBox(-3.0F, -11.1F, -7.0F, 6, 6, 12, 0.0F);
		this.setRotateAngle(NoseBand, 0.22689280275926282F, 0.0F, 0.0F);
		this.FingerL3 = new AdvancedModelRenderer(this, 50, 80);
		this.FingerL3.setRotationPoint(-0.1F, 8.5F, 1.6F);
		this.FingerL3.addBox(-0.5F, -0.1F, -2.0F, 1, 15, 4, 0.0F);
		this.setRotateAngle(FingerL3, 0.03490658503988659F, 0.0F, 0.0F);
		this.Tail3 = new AdvancedModelRenderer(this, 24, 3);
		this.Tail3.setRotationPoint(0.0F, -0.2F, 6.3F);
		this.Tail3.addBox(-1.5F, -2.0F, 0.0F, 3, 4, 7, 0.0F);
		this.setRotateAngle(Tail3, -0.3490658503988659F, 0.0F, 0.0F);
		this.Tail2 = new AdvancedModelRenderer(this, 38, 7);
		this.Tail2.setRotationPoint(0.0F, 0.0F, 2.6F);
		this.Tail2.addBox(-1.5F, -2.0F, 0.0F, 3, 4, 7, 0.0F);
		this.HindThighR = new AdvancedModelRenderer(this, 96, 29);
		this.HindThighR.setRotationPoint(-4.0F, -2.0F, 2.0F);
		this.HindThighR.addBox(-1.5F, -2.0F, -2.5F, 4, 9, 5, 0.0F);
		this.Saddleback = new AdvancedModelRenderer(this, 80, 9);
		this.Saddleback.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Saddleback.addBox(-4.0F, -1.0F, 3.0F, 8, 1, 2, 0.0F);
		this.SaddleFront = new AdvancedModelRenderer(this, 106, 9);
		this.SaddleFront.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.SaddleFront.addBox(-1.5F, -1.0F, -3.0F, 3, 1, 2, 0.0F);
		this.WingL3 = new AdvancedModelRenderer(this, 60, 100);
		this.WingL3.setRotationPoint(-0.1F, 11.1F, 0.1F);
		this.WingL3.addBox(-0.3F, -0.1F, -5.0F, 1, 14, 11, 0.0F);
		this.FrontThighL = new AdvancedModelRenderer(this, 60, 27);
		this.FrontThighL.setRotationPoint(4.5F, -1.0F, -16.7F);
		this.FrontThighL.addBox(-2.0F, -1.0F, -2.1F, 3, 8, 4, 0.0F);
		this.WingL2 = new AdvancedModelRenderer(this, 30, 100);
		this.WingL2.setRotationPoint(-0.2F, 11.2F, 0.2F);
		this.WingL2.addBox(-0.3F, -0.1F, -5.0F, 1, 15, 11, 0.0F);
		this.setRotateAngle(WingL2, 1.9896753472735356F, 0.10471975511965977F, 0.03490658503988659F);
		this.StirrupIronL = new AdvancedModelRenderer(this, 74, 0);
		this.StirrupIronL.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.StirrupIronL.addBox(-0.5F, 6.0F, -1.0F, 1, 2, 2, 0.0F);
		this.FrontLegL = new AdvancedModelRenderer(this, 60, 41);
		this.FrontLegL.mirror = true;
		this.FrontLegL.setRotationPoint(0.0F, 6.7F, 0.0F);
		this.FrontLegL.addBox(-1.5F, 0.0F, -1.6F, 2, 7, 3, 0.0F);
		this.WingL = new AdvancedModelRenderer(this, 0, 100);
		this.WingL.setRotationPoint(4.5F, -7.0F, -13.5F);
		this.WingL.addBox(-0.4F, 0.0F, -5.0F, 1, 13, 12, 0.0F);
		this.setRotateAngle(WingL, -0.22689280275926282F, 0.13962634015954636F, -0.45378560551852565F);
		this.FingerR2 = new AdvancedModelRenderer(this, 50, 80);
		this.FingerR2.mirror = true;
		this.FingerR2.setRotationPoint(0.1F, 11.1F, 0.1F);
		this.FingerR2.addBox(-0.2F, -0.1F, -2.9F, 1, 15, 4, 0.0F);
		this.setRotateAngle(FingerR2, 0.13962634015954636F, 0.0F, 0.0F);
		this.Neck2.addChild(this.HeadPivot);
		this.HeadPivot.addChild(this.Head);
		this.Body.addChild(this.HindThighL);
		this.WingR2.addChild(this.WingR3);
		this.WingR3.addChild(this.FingerR4);
		this.Neck.addChild(this.Neck2);
		this.Head.addChild(this.Crest);
		this.NoseBand.addChild(this.ReinR);
		this.WingR.addChild(this.WingR2);
		this.Saddle.addChild(this.StirrupL);
		this.WingR3.addChild(this.FingerR3);
		this.HindThighR.addChild(this.HindLegR);
		this.HindThighL.addChild(this.HindLegL);
		this.Saddle.addChild(this.StirrupR);
		this.Saddle.addChild(this.ChestR);
		this.StirrupR.addChild(this.StirrupIronR);
		this.Head.addChild(this.Jaw);
		this.WingL3.addChild(this.FingerL1);
		this.Body.addChild(this.Neck);
		this.WingL3.addChild(this.FingerL2);
		this.Head.addChild(this.Quill_R);
		this.Body.addChild(this.Tail1);
		this.Body.addChild(this.WingR);
		this.Head.addChild(this.Beak);
		this.HindLegR.addChild(this.HindFootR);
		this.Beak.addChild(this.BeakTip);
		this.Head.addChild(this.Quill_L);
		this.Beak.addChild(this.Beak2);
		this.FrontLegL.addChild(this.FrontFootL);
		this.NoseBand.addChild(this.ReinL);
		this.FrontLegR.addChild(this.FrontFootR);
		this.Body.addChild(this.Saddle);
		this.FrontThighR.addChild(this.FrontLegR);
		this.Body.addChild(this.FrontThighR);
		this.WingL3.addChild(this.FingerL4);
		this.HindLegL.addChild(this.HindFootL);
		this.WingR3.addChild(this.FingerR1);
		this.Saddle.addChild(this.ChestL);
		this.Head.addChild(this.NoseBand);
		this.WingL3.addChild(this.FingerL3);
		this.Tail2.addChild(this.Tail3);
		this.Tail1.addChild(this.Tail2);
		this.Body.addChild(this.HindThighR);
		this.Saddle.addChild(this.Saddleback);
		this.Saddle.addChild(this.SaddleFront);
		this.WingL2.addChild(this.WingL3);
		this.Body.addChild(this.FrontThighL);
		this.WingL.addChild(this.WingL2);
		this.StirrupL.addChild(this.StirrupIronL);
		this.FrontThighL.addChild(this.FrontLegL);
		this.Body.addChild(this.WingL);
		this.WingR3.addChild(this.FingerR2);
		animator = ModelAnimator.create();
		this.Beak2.setScale(0.99F, 0.99F, 0.99F);
		this.Neck2.setScale(1.01F, 1.01F, 1.01F);
		this.updateDefaultPose();
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
		if (this.isChild) {
			this.Body.setShouldScaleChildren(true);
			this.Body.setScale(0.5F, 0.5F, 0.5F);
			this.Head.setScale(1.5F, 1.5F, 1.5F);
			this.Beak.setRotationPoint(0.0F, 1.0F, -8.1F);
			this.Jaw.setRotationPoint(0.0F, 2.2F, -2.8F);
			this.Body.setRotationPoint(0.0F, 17.0F, 4.0F);
		} else {
			this.Body.setScale(1, 1, 1);
			this.Head.setScale(1, 1, 1);
		}
		setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);
		this.Body.render(f5);
	}

	public void renderStatue() {
		this.resetToDefaultPose();
		if (this.isChild) {
			this.Body.setShouldScaleChildren(true);
			this.Body.setScale(0.5F, 0.5F, 0.5F);
			this.Head.setScale(1.5F, 1.5F, 1.5F);
			this.Beak.setRotationPoint(0.0F, 1.0F, -8.1F);
			this.Jaw.setRotationPoint(0.0F, 2.2F, -2.8F);
			this.Body.setRotationPoint(0.0F, 17.0F, 4.0F);
		} else {
			this.Body.setScale(1, 1, 1);
			this.Head.setScale(1, 1, 1);
		}
		this.Body.render(0.0625F);
		this.NoseBand.isHidden = true;
		this.ReinL.isHidden = true;
		this.ReinR.isHidden = true;
		this.ChestL.isHidden = true;
		this.ChestR.isHidden = true;
		this.Saddle.isHidden = true;
		this.Saddleback.isHidden = true;
		this.StirrupIronL.isHidden = true;
		this.StirrupIronR.isHidden = true;
		this.SaddleFront.isHidden = true;
		this.StirrupL.isHidden = true;
		this.StirrupR.isHidden = true;
	}

	public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		this.resetToDefaultPose();
		animator.update(entity);
		animator.setAnimation(EntityHippogryph.ANIMATION_SPEAK);
		animator.startKeyframe(10);
		this.rotate(animator, HeadPivot, -10, 0, 0);
		this.rotate(animator, Jaw, 20, 0, 0);
		animator.endKeyframe();
		animator.resetKeyframe(5);

		animator.setAnimation(EntityHippogryph.ANIMATION_EAT);
		animator.startKeyframe(10);
		this.rotate(animator, Body, 10, 0, 0);
		this.rotate(animator, Neck, 45, 0, 0);
		this.rotate(animator, Neck2, 35, 0, 0);
		this.rotate(animator, HeadPivot, -50, 0, 0);
		this.rotate(animator, HindThighR, -10, 0, 0);
		this.rotate(animator, HindThighL, -10, 0, 0);
		this.rotate(animator, FrontThighR, -10, 0, 0);
		this.rotate(animator, FrontThighL, -10, 0, 0);
		this.rotate(animator, Jaw, 20, 0, 0);
		animator.move(FrontThighR, 0, -2F, 0.5F);
		animator.move(FrontThighL, 0, -2F, 0.5F);
		animator.endKeyframe();
		animator.startKeyframe(5);
		this.rotate(animator, Body, 10, 0, 0);
		this.rotate(animator, Neck, 45, 0, 0);
		this.rotate(animator, Neck2, 35, 0, 0);
		this.rotate(animator, HeadPivot, -50, 0, 0);
		this.rotate(animator, HindThighR, -10, 0, 0);
		this.rotate(animator, HindThighL, -10, 0, 0);
		this.rotate(animator, FrontThighR, -10, 0, 0);
		this.rotate(animator, FrontThighL, -10, 0, 0);
		this.rotate(animator, Jaw, 0, 0, 0);
		animator.move(FrontThighR, 0, -2F, 0.5F);
		animator.move(FrontThighL, 0, -2F, 0.5F);
		animator.endKeyframe();
		animator.startKeyframe(5);
		this.rotate(animator, Body, 10, 0, 0);
		this.rotate(animator, Neck, 45, 0, 0);
		this.rotate(animator, Neck2, 35, 0, 0);
		this.rotate(animator, HeadPivot, -50, 0, 0);
		this.rotate(animator, HindThighR, -10, 0, 0);
		this.rotate(animator, HindThighL, -10, 0, 0);
		this.rotate(animator, FrontThighR, -10, 0, 0);
		this.rotate(animator, FrontThighL, -10, 0, 0);
		this.rotate(animator, Jaw, 20, 0, 0);
		animator.move(FrontThighR, 0, -2F, 0.5F);
		animator.move(FrontThighL, 0, -2F, 0.5F);
		animator.endKeyframe();
		animator.resetKeyframe(5);
		animator.setAnimation(EntityHippogryph.ANIMATION_BITE);
		animator.startKeyframe(5);
		this.rotate(animator, Neck, -15, 0, 0);
		this.rotate(animator, Neck2, -15, 0, 0);
		this.rotate(animator, HeadPivot, 23, 0, 0);
		animator.move(HeadPivot, 0, -3F, -0.5F);
		this.rotate(animator, Jaw, 20, 0, 0);
		animator.endKeyframe();
		animator.startKeyframe(5);
		this.rotate(animator, Neck, 35, 0, 0);
		this.rotate(animator, Neck2, 10, 0, 0);
		this.rotate(animator, HeadPivot, -55, 0, 0);
		this.rotate(animator, Jaw, 45, 0, 0);
		animator.endKeyframe();
		animator.startKeyframe(5);
		this.rotate(animator, Neck, 35, 0, 0);
		this.rotate(animator, Neck2, 10, 0, 0);
		this.rotate(animator, HeadPivot, -75, 0, 0);
		this.rotate(animator, Jaw, 5, 0, 0);
		animator.endKeyframe();
		animator.resetKeyframe(5);
		animator.setAnimation(EntityHippogryph.ANIMATION_SCRATCH);
		animator.startKeyframe(5);
		this.rotate(animator, Body, -35, 0, 0);
		this.rotate(animator, HindThighR, 35, 0, 0);
		this.rotate(animator, HindThighL, 35, 0, 0);
		this.rotate(animator, Neck, 10, 0, 0);
		this.rotate(animator, Neck2, 20, 0, 0);
		this.rotate(animator, HeadPivot, 5, 0, 0);
		this.rotate(animator, FrontThighR, -50, 0, 0);
		this.rotate(animator, FrontThighL, 50, 0, 0);
		this.rotate(animator, FrontFootR, 110, 0, 0);
		this.rotate(animator, FrontFootL, 110, 0, 0);
		animator.move(FrontFootR, 0, 1F, -0.5F);
		animator.move(FrontFootL, 0, 1F, -0.5F);
		animator.endKeyframe();
		animator.startKeyframe(5);
		this.rotate(animator, Body, -35, 0, 0);
		this.rotate(animator, HindThighR, 35, 0, 0);
		this.rotate(animator, HindThighL, 35, 0, 0);
		this.rotate(animator, Neck, 10, 0, 0);
		this.rotate(animator, Neck2, 20, 0, 0);
		this.rotate(animator, HeadPivot, 5, 0, 0);
		this.rotate(animator, FrontThighR, 50, 0, 0);
		this.rotate(animator, FrontThighL, -50, 0, 0);
		this.rotate(animator, FrontFootR, 110, 0, 0);
		this.rotate(animator, FrontFootL, 110, 0, 0);
		animator.move(FrontFootR, 0, 1F, -0.5F);
		animator.move(FrontFootL, 0, 1F, -0.5F);
		animator.endKeyframe();
		animator.startKeyframe(5);
		this.rotate(animator, Body, -35, 0, 0);
		this.rotate(animator, HindThighR, 35, 0, 0);
		this.rotate(animator, HindThighL, 35, 0, 0);
		this.rotate(animator, Neck, 10, 0, 0);
		this.rotate(animator, Neck2, 20, 0, 0);
		this.rotate(animator, HeadPivot, 5, 0, 0);
		this.rotate(animator, FrontThighR, -50, 0, 0);
		this.rotate(animator, FrontThighL, 50, 0, 0);
		this.rotate(animator, FrontFootR, 110, 0, 0);
		this.rotate(animator, FrontFootL, 110, 0, 0);
		animator.move(FrontFootR, 0, 1F, -0.5F);
		animator.move(FrontFootL, 0, 1F, -0.5F);
		animator.endKeyframe();
		animator.startKeyframe(5);
		this.rotate(animator, Body, -35, 0, 0);
		this.rotate(animator, HindThighR, 35, 0, 0);
		this.rotate(animator, HindThighL, 35, 0, 0);
		this.rotate(animator, Neck, 10, 0, 0);
		this.rotate(animator, Neck2, 20, 0, 0);
		this.rotate(animator, HeadPivot, 5, 0, 0);
		this.rotate(animator, FrontThighR, 50, 0, 0);
		this.rotate(animator, FrontThighL, -50, 0, 0);
		this.rotate(animator, FrontFootR, 110, 0, 0);
		this.rotate(animator, FrontFootL, 110, 0, 0);
		animator.move(FrontFootR, 0, 1F, -0.5F);
		animator.move(FrontFootL, 0, 1F, -0.5F);
		animator.endKeyframe();
		animator.resetKeyframe(5);
	}

	@Override
	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
		EntityHippogryph hippo = (EntityHippogryph) entity;

		if (this.isChild) {
			this.progressPosition(Body, hippo.sitProgress, 0, 16, 0);
		} else {
			this.progressPosition(Body, hippo.sitProgress, 0, 18, 0);
		}
		this.progressRotation(Body, hippo.sitProgress, -0.045553093477052F, 0.0F, 0.0F);
		this.progressRotation(FingerR1, hippo.sitProgress, 0.13962634015954636F, 0.0F, 0.0F);
		this.progressRotation(WingL, hippo.sitProgress, -0.22689280275926282F, 0.13962634015954636F, -0.45378560551852565F);
		this.progressRotation(NoseBand, hippo.sitProgress, 0.22689280275926282F, 0.0F, 0.0F);
		this.progressRotation(FingerL2, hippo.sitProgress, 0.03490658503988659F, 0.0F, 0.0F);
		this.progressRotation(HindLegR, hippo.sitProgress, 1.5707963267948966F, 0.0F, 0.0F);
		this.progressRotation(WingL2, hippo.sitProgress, 1.9896753472735356F, 0.10471975511965977F, 0.03490658503988659F);
		this.progressRotation(FingerL4, hippo.sitProgress, 0.12217304763960307F, 0.0F, 0.0F);
		this.progressRotation(HindLegL, hippo.sitProgress, 1.5707963267948966F, 0.0F, 0.0F);
		this.progressRotation(ReinL, hippo.sitProgress, -0.04363323129985824F, 0.0F, 0.0F);
		this.progressRotation(Tail3, hippo.sitProgress, -0.3490658503988659F, 0.0F, 0.0F);
		this.progressRotation(HeadPivot, hippo.sitProgress, -0.136659280431156F, 0.0F, 0.0F);
		this.progressRotation(ReinR, hippo.sitProgress, -0.04363323129985824F, 0.0F, 0.0F);
		this.progressRotation(FingerL3, hippo.sitProgress, 0.03490658503988659F, 0.0F, 0.0F);
		this.progressRotation(FingerR3, hippo.sitProgress, 0.03490658503988659F, 0.0F, 0.0F);
		this.progressRotation(Quill_L, hippo.sitProgress, -1.1838568316277536F, 0.17453292519943295F, 0.0F);
		this.progressRotation(FrontLegL, hippo.sitProgress, -1.48352986419518F, 0.0F, 0.0F);
		this.progressRotation(Neck2, hippo.sitProgress, -0.40980330836826856F, 0.0F, 0.0F);
		this.progressRotation(FingerR4, hippo.sitProgress, 0.12217304763960307F, 0.0F, 0.0F);
		this.progressRotation(ChestR, hippo.sitProgress, 0.0F, 1.5707963267948966F, 0.0F);
		this.progressRotation(WingR2, hippo.sitProgress, 1.9896753472735356F, -0.10471975511965977F, -0.03490658503988659F);
		this.progressRotation(Tail1, hippo.sitProgress, -1.1344640137963142F, 0.0F, 0.0F);
		this.progressRotation(Neck, hippo.sitProgress, 0.7285004297824331F, 0.0F, 0.0F);
		this.progressRotation(FrontLegR, hippo.sitProgress, -1.48352986419518F, 0.0F, 0.0F);
		this.progressRotation(FrontFootL, hippo.sitProgress, 1.5707963267948966F, 0.0F, 0.0F);
		this.progressRotation(FingerR2, hippo.sitProgress, 0.13962634015954636F, 0.0F, 0.0F);
		this.progressRotation(ChestL, hippo.sitProgress, 0.0F, 1.5707963267948966F, 0.0F);
		this.progressRotation(FrontFootR, hippo.sitProgress, 1.5707963267948966F, 0.0F, 0.0F);
		this.progressRotation(Crest, hippo.sitProgress, -1.6845917940249266F, 0.0F, 0.0F);
		this.progressRotation(WingR, hippo.sitProgress, -0.22689280275926282F, -0.13962634015954636F, 0.45378560551852565F);
		this.progressRotation(Quill_R, hippo.sitProgress, -1.1838568316277536F, -0.17453292519943295F, 0.0F);

		this.progressPosition(Body, hippo.flyProgress, 0.0F, 12.0F, 4.0F);
		this.progressRotation(HindThighR, hippo.flyProgress, 0.7853981633974483F, 0.0F, 0.0F);
		this.progressRotation(FrontLegL, hippo.flyProgress, -1.4102260356114182F, 0.0F, 0.0F);
		this.progressRotation(HindLegL, hippo.flyProgress, -0.17453292519943295F, 0.0F, 0.0F);
		this.progressRotation(FingerR2, hippo.flyProgress, 0.40980330836826856F, 0.0F, 0.0F);
		this.progressRotation(Crest, hippo.flyProgress, -1.6845917940249266F, 0.0F, 0.0F);
		this.progressRotation(FrontThighL, hippo.flyProgress, 0.6981317007977318F, 0.0F, 0.0F);
		this.progressRotation(Tail3, hippo.flyProgress, 0.40980330836826856F, 0.0F, 0.0F);
		this.progressRotation(FingerR3, hippo.flyProgress, 0.6829473363053812F, 0.0F, 0.0F);
		this.progressRotation(WingL2, hippo.flyProgress, -0.22759093446006054F, 0.0F, 0.08726646259971647F);
		this.progressRotation(WingR, hippo.flyProgress, 0.0F, 0.0F, 1.5707963267948966F);
		this.progressRotation(WingL3, hippo.flyProgress, 0.31869712141416456F, 0.0F, 0.0F);
		this.progressRotation(Quill_R, hippo.flyProgress, -1.1838568316277536F, -0.17453292519943295F, 0.0F);
		this.progressRotation(FrontLegR, hippo.flyProgress, -1.3962634015954636F, 0.0F, 0.0F);
		this.progressRotation(Tail1, hippo.flyProgress, -0.7740535232594852F, 0.0F, 0.0F);
		this.progressRotation(FrontFootL, hippo.flyProgress, 2.408554367752175F, 0.0F, 0.0F);
		this.progressRotation(WingL, hippo.flyProgress, 0.0F, 0.0F, -1.5707963267948966F);
		this.progressRotation(FingerR4, hippo.flyProgress, 0.8651597102135892F, 0.0F, 0.0F);
		this.progressRotation(ReinR, hippo.flyProgress, -0.04363323129985824F, 0.0F, 0.0F);
		this.progressRotation(NoseBand, hippo.flyProgress, 0.22689280275926282F, 0.0F, 0.0F);
		this.progressRotation(Tail2, hippo.flyProgress, 0.136659280431156F, 0.0F, 0.0F);
		this.progressRotation(WingR2, hippo.flyProgress, -0.22759093446006054F, 0.0F, -0.08726646259971647F);
		this.progressRotation(WingR3, hippo.flyProgress, 0.31869712141416456F, 0.0F, 0.0F);
		this.progressRotation(HindThighL, hippo.flyProgress, 0.7853981633974483F, 0.0F, 0.0F);
		this.progressRotation(Neck, hippo.flyProgress, 1.2747884856566583F, 0.0F, 0.0F);
		this.progressRotation(ReinL, hippo.flyProgress, -0.04363323129985824F, 0.0F, 0.0F);
		this.progressRotation(FingerR1, hippo.flyProgress, 0.136659280431156F, 0.0F, 0.0F);
		this.progressRotation(HindLegR, hippo.flyProgress, -0.17453292519943295F, 0.0F, 0.0F);
		this.progressRotation(ChestL, hippo.flyProgress, 0.0F, 1.5707963267948966F, 0.0F);
		this.progressRotation(HeadPivot, hippo.flyProgress, -0.4553564018453205F, 0.0F, 0.0F);
		this.progressRotation(FrontFootR, hippo.flyProgress, 2.408554367752175F, 0.0F, 0.0F);
		this.progressRotation(FingerL3, hippo.flyProgress, 0.6829473363053812F, 0.0F, 0.0F);
		this.progressRotation(FingerL4, hippo.flyProgress, 0.8651597102135892F, 0.0F, 0.0F);
		this.progressRotation(ChestR, hippo.flyProgress, 0.0F, 1.5707963267948966F, 0.0F);
		this.progressRotation(FrontThighR, hippo.flyProgress, 0.6981317007977318F, 0.0F, 0.0F);
		this.progressRotation(Quill_L, hippo.flyProgress, -1.1838568316277536F, 0.17453292519943295F, 0.0F);
		this.progressRotation(Neck2, hippo.flyProgress, -0.40980330836826856F, 0.0F, 0.0F);
		this.progressRotation(FingerL1, hippo.flyProgress, 0.136659280431156F, 0.0F, 0.0F);
		this.progressRotation(FingerL2, hippo.flyProgress, 0.40980330836826856F, 0.0F, 0.0F);

		this.progressPosition(Body, hippo.hoverProgress, 0.0F, 8.0F, 0.0F);
		this.progressRotation(HindThighR, hippo.hoverProgress, 0.7853981633974483F, 0.0F, 0.0F);
		this.progressRotation(FrontLegL, hippo.hoverProgress, -1.4102260356114182F, 0.0F, 0.0F);
		this.progressRotation(HindLegL, hippo.hoverProgress, -0.17453292519943295F, 0.0F, 0.0F);
		this.progressRotation(Crest, hippo.hoverProgress, -1.6845917940249266F, 0.0F, 0.0F);
		this.progressRotation(FrontThighL, hippo.hoverProgress, 0.6981317007977318F, 0.0F, 0.0F);
		this.progressRotation(Tail3, hippo.hoverProgress, 0.40980330836826856F, 0.0F, 0.0F);
		this.progressRotation(Quill_R, hippo.hoverProgress, -1.1838568316277536F, -0.17453292519943295F, 0.0F);
		this.progressRotation(FrontLegR, hippo.hoverProgress, -1.3962634015954636F, 0.0F, 0.0F);
		this.progressRotation(Tail1, hippo.hoverProgress, -0.7740535232594852F, 0.0F, 0.0F);
		this.progressRotation(FrontFootL, hippo.hoverProgress, 2.408554367752175F, 0.0F, 0.0F);
		this.progressRotation(ReinR, hippo.hoverProgress, -0.04363323129985824F, 0.0F, 0.0F);
		this.progressRotation(NoseBand, hippo.hoverProgress, 0.22689280275926282F, 0.0F, 0.0F);
		this.progressRotation(Tail2, hippo.hoverProgress, 0.136659280431156F, 0.0F, 0.0F);
		this.progressRotation(HindThighL, hippo.hoverProgress, 0.7853981633974483F, 0.0F, 0.0F);
		this.progressRotation(Neck, hippo.hoverProgress, 1.5481070465189704F, 0.0F, 0.0F);
		this.progressRotation(ReinL, hippo.hoverProgress, -0.04363323129985824F, 0.0F, 0.0F);
		this.progressRotation(HindLegR, hippo.hoverProgress, -0.17453292519943295F, 0.0F, 0.0F);
		this.progressRotation(ChestL, hippo.hoverProgress, 0.0F, 1.5707963267948966F, 0.0F);
		this.progressRotation(HeadPivot, hippo.hoverProgress, -0.4553564018453205F, 0.0F, 0.0F);
		this.progressRotation(FrontFootR, hippo.hoverProgress, 2.408554367752175F, 0.0F, 0.0F);
		this.progressRotation(ChestR, hippo.hoverProgress, 0.0F, 1.5707963267948966F, 0.0F);
		this.progressRotation(FrontThighR, hippo.hoverProgress, 0.6981317007977318F, 0.0F, 0.0F);
		this.progressRotation(Quill_L, hippo.hoverProgress, -1.1838568316277536F, 0.17453292519943295F, 0.0F);
		this.progressRotation(Neck2, hippo.hoverProgress, -0.24088609097414795F, 0.0F, 0.0F);
		this.progressRotation(Body, hippo.hoverProgress, -0.5067516521823614F, 0.0F, 0.0F);
		this.progressRotation(WingR2, hippo.hoverProgress, -0.22759093446006054F, 0.0F, -0.08726646259971647F);
		this.progressRotation(WingR3, hippo.hoverProgress, 0.31869712141416456F, 0.0F, 0.0F);
		this.progressRotation(WingL, hippo.hoverProgress, 0.0F, 0.0F, -1.5707963267948966F);
		this.progressRotation(WingL2, hippo.hoverProgress, -0.22759093446006054F, 0.0F, 0.08726646259971647F);
		this.progressRotation(WingR, hippo.hoverProgress, 0.0F, 0.0F, 1.5707963267948966F);
		this.progressRotation(WingL3, hippo.hoverProgress, 0.31869712141416456F, 0.0F, 0.0F);

		this.progressRotation(FingerL1, hippo.hoverProgress, 0.136659280431156F, 0.0F, 0.0F);
		this.progressRotation(FingerL2, hippo.hoverProgress, 0.40980330836826856F, 0.0F, 0.0F);
		this.progressRotation(FingerL3, hippo.hoverProgress, 0.6829473363053812F, 0.0F, 0.0F);
		this.progressRotation(FingerL4, hippo.hoverProgress, 0.8651597102135892F, 0.0F, 0.0F);
		this.progressRotation(FingerR4, hippo.hoverProgress, 0.8651597102135892F, 0.0F, 0.0F);
		this.progressRotation(FingerR3, hippo.hoverProgress, 0.6829473363053812F, 0.0F, 0.0F);
		this.progressRotation(FingerR2, hippo.hoverProgress, 0.40980330836826856F, 0.0F, 0.0F);
		this.progressRotation(FingerR1, hippo.hoverProgress, 0.136659280431156F, 0.0F, 0.0F);

		float speed_walk = 0.4F;
		float speed_idle = 0.05F;
		float speed_fly = 0.35F + (hippo.getEnumVariant() == EnumHippogryphTypes.DODO ? 0.2f : 0);
		float degree_walk = 0.5F;
		float degree_idle = 0.5F;
		float degree_fly = 0.5F + (hippo.getEnumVariant() == EnumHippogryphTypes.DODO ? 1f : 0);
		this.bob(Body, speed_idle, degree_idle, false, entity.ticksExisted, 1);
		this.bob(FrontThighR, -speed_idle, degree_idle, false, entity.ticksExisted, 1);
		this.bob(FrontThighL, -speed_idle, degree_idle, false, entity.ticksExisted, 1);
		this.bob(HindThighR, -speed_idle, degree_idle, false, entity.ticksExisted, 1);
		this.bob(HindThighL, -speed_idle, degree_idle, false, entity.ticksExisted, 1);
		AdvancedModelRenderer[] NECK = new AdvancedModelRenderer[]{Neck, Neck2, Head};
		this.chainWave(NECK, speed_idle, degree_idle * 0.15F, -2, entity.ticksExisted, 1);

		if (hippo.isFlying() || hippo.airBorneCounter > 50 || hippo.isHovering()) {
			//hippo.roll_buffer.applyChainFlapBuffer(Body);
			this.flap(WingL, speed_fly, degree_fly, false, 0, 0, entity.ticksExisted, 1);
			this.flap(WingR, speed_fly, -degree_fly, false, 0, 0, entity.ticksExisted, 1);
			this.flap(WingL2, speed_fly, degree_fly, false, 0, 0, entity.ticksExisted, 1);
			this.flap(WingR2, speed_fly, -degree_fly, false, 0, 0, entity.ticksExisted, 1);
		} else {
			this.faceTarget(f3, f4, 3, NECK);
			this.bob(Body, speed_walk, degree_walk, false, f, f1);
			this.bob(FrontThighR, -speed_walk, degree_walk, false, f, f1);
			this.bob(FrontThighL, -speed_walk, degree_walk, false, f, f1);
			this.bob(HindThighR, -speed_walk, degree_walk, false, f, f1);
			this.bob(HindThighL, -speed_walk, degree_walk, false, f, f1);
			this.chainWave(NECK, speed_walk, degree_walk * 0.15F, -2, f, f1);
			this.walk(FrontThighR, speed_walk, degree_walk * -0.75F, true, 0, 0F, f, f1);
			this.walk(FrontThighL, speed_walk, degree_walk * -0.75F, false, 0, 0F, f, f1);
			this.walk(FrontLegR, speed_walk, degree_walk * 0.5F, false, 0, 0F, f, f1);
			this.walk(FrontLegL, speed_walk, degree_walk * 0.5F, true, 0, 0F, f, f1);
			this.walk(FrontFootR, -speed_walk, degree_walk, false, 2.75F, 0F, f, f1);
			this.walk(FrontFootL, -speed_walk, degree_walk, true, 2.75F, 0F, f, f1);
			this.walk(HindThighR, speed_walk, degree_walk * -0.75F, false, 0, 0F, f, f1);
			this.walk(HindThighL, speed_walk, degree_walk * -0.75F, true, 0, 0F, f, f1);
			this.walk(HindLegR, speed_walk, degree_walk * 0.5F, true, 0, 0F, f, f1);
			this.walk(HindLegL, speed_walk, degree_walk * 0.5F, false, 0, 0F, f, f1);
			this.walk(HindFootR, -speed_walk, degree_walk, true, 2.75F, 0F, f, f1);
			this.walk(HindFootL, -speed_walk, degree_walk, false, 2.75F, 0F, f, f1);
		}

		float f12 = -1.1344640137963142F + f1;
		if (f12 > 0.0F) {
			f12 = 0.0F;
		}

		if (f12 < Math.toRadians(-80)) {
			f12 = (float) Math.toRadians(-80);
		}
		this.Tail1.rotateAngleX = f12;
		f12 = 0.0F;
	}
}
