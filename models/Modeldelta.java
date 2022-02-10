// Made with Blockbench 3.5.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class Modeldelta extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer backleftleg;
	private final ModelRenderer backrightleg;
	private final ModelRenderer torso;
	private final ModelRenderer frontleftleg;
	private final ModelRenderer frontrightleg;
	private final ModelRenderer leftarm;
	private final ModelRenderer rightarm;
	private final ModelRenderer head;
	private final ModelRenderer righthorn;
	private final ModelRenderer lefthorn;

	public Modeldelta() {
		textureWidth = 54;
		textureHeight = 51;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 24.0F, 0.0F);

		backleftleg = new ModelRenderer(this);
		backleftleg.setRotationPoint(2.0F, -12.0F, 5.0F);
		body.addChild(backleftleg);
		backleftleg.setTextureOffset(24, 0).addBox(-1.0F, 3.0F, -1.0F, 2.0F, 6.0F, 2.0F, 0.0F, false);
		backleftleg.setTextureOffset(0, 45).addBox(-1.0F, 4.0F, -2.0F, 2.0F, 4.0F, 1.0F, 0.0F, false);
		backleftleg.setTextureOffset(7, 42).addBox(-1.0F, 11.0F, -2.0F, 2.0F, 1.0F, 3.0F, 0.0F, false);
		backleftleg.setTextureOffset(18, 16).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 3.0F, 0.0F, false);
		backleftleg.setTextureOffset(48, 38).addBox(-1.0F, 9.0F, 0.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		backleftleg.setTextureOffset(40, 47).addBox(-1.0F, 1.0F, 0.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);

		backrightleg = new ModelRenderer(this);
		backrightleg.setRotationPoint(-2.0F, -12.0F, 5.0F);
		body.addChild(backrightleg);
		backrightleg.setTextureOffset(0, 0).addBox(-1.0F, 3.0F, -1.0F, 2.0F, 6.0F, 2.0F, 0.0F, false);
		backrightleg.setTextureOffset(34, 45).addBox(-1.0F, 4.0F, -2.0F, 2.0F, 4.0F, 1.0F, 0.0F, false);
		backrightleg.setTextureOffset(0, 41).addBox(-1.0F, 11.0F, -2.0F, 2.0F, 1.0F, 3.0F, 0.0F, false);
		backrightleg.setTextureOffset(36, 29).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 3.0F, 0.0F, false);
		backrightleg.setTextureOffset(48, 29).addBox(-1.0F, 9.0F, 0.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		backrightleg.setTextureOffset(46, 47).addBox(-1.0F, 1.0F, 0.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);

		torso = new ModelRenderer(this);
		torso.setRotationPoint(0.0F, -13.0F, 0.0F);
		body.addChild(torso);
		torso.setTextureOffset(0, 16).addBox(-3.0F, -2.0F, 0.0F, 6.0F, 3.0F, 6.0F, 0.0F, false);
		torso.setTextureOffset(29, 13).addBox(-3.0F, -2.0F, -5.0F, 6.0F, 3.0F, 3.0F, 0.0F, false);
		torso.setTextureOffset(32, 19).addBox(-3.0F, -2.0F, -2.0F, 6.0F, 2.0F, 2.0F, 0.0F, false);
		torso.setTextureOffset(32, 0).addBox(-3.0F, -11.0F, -4.0F, 6.0F, 9.0F, 3.0F, 0.0F, false);
		torso.setTextureOffset(36, 26).addBox(-3.0F, -11.0F, -5.0F, 6.0F, 2.0F, 1.0F, 0.0F, false);
		torso.setTextureOffset(36, 23).addBox(-3.0F, -7.0F, -5.0F, 6.0F, 2.0F, 1.0F, 0.0F, false);
		torso.setTextureOffset(35, 36).addBox(-3.0F, -4.0F, -5.0F, 6.0F, 2.0F, 1.0F, 0.0F, false);

		frontleftleg = new ModelRenderer(this);
		frontleftleg.setRotationPoint(2.0F, -12.0F, -4.0F);
		body.addChild(frontleftleg);
		frontleftleg.setTextureOffset(44, 12).addBox(-1.0F, 10.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		frontleftleg.setTextureOffset(26, 43).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		frontleftleg.setTextureOffset(36, 39).addBox(-1.0F, 4.0F, -1.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);
		frontleftleg.setTextureOffset(6, 46).addBox(-1.0F, 5.0F, 1.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		frontleftleg.setTextureOffset(11, 48).addBox(-1.0F, 8.0F, -1.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		frontleftleg.setTextureOffset(23, 47).addBox(-1.0F, 2.0F, -1.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);

		frontrightleg = new ModelRenderer(this);
		frontrightleg.setRotationPoint(-2.0F, -12.0F, -4.0F);
		body.addChild(frontrightleg);
		frontrightleg.setTextureOffset(42, 43).addBox(-1.0F, 10.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		frontrightleg.setTextureOffset(12, 25).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		frontrightleg.setTextureOffset(28, 37).addBox(-1.0F, 4.0F, -1.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);
		frontrightleg.setTextureOffset(36, 33).addBox(-1.0F, 5.0F, 1.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		frontrightleg.setTextureOffset(47, 0).addBox(-1.0F, 8.0F, -1.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		frontrightleg.setTextureOffset(46, 18).addBox(-1.0F, 2.0F, -1.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);

		leftarm = new ModelRenderer(this);
		leftarm.setRotationPoint(3.0F, -22.0F, -3.0F);
		body.addChild(leftarm);
		leftarm.setTextureOffset(0, 25).addBox(0.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

		rightarm = new ModelRenderer(this);
		rightarm.setRotationPoint(-3.0F, -22.0F, -3.0F);
		body.addChild(rightarm);
		rightarm.setTextureOffset(20, 21).addBox(-4.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -24.0F, -3.0F);
		body.addChild(head);
		head.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);

		righthorn = new ModelRenderer(this);
		righthorn.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.addChild(righthorn);
		righthorn.setTextureOffset(44, 39).addBox(-5.0F, -6.0F, -1.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		righthorn.setTextureOffset(22, 37).addBox(-6.0F, -9.0F, -1.0F, 1.0F, 6.0F, 2.0F, 0.0F, false);
		righthorn.setTextureOffset(17, 43).addBox(-7.0F, -8.0F, -1.0F, 1.0F, 4.0F, 2.0F, 0.0F, false);

		lefthorn = new ModelRenderer(this);
		lefthorn.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.addChild(lefthorn);
		setRotationAngle(lefthorn, 0.0F, 3.1416F, 0.0F);
		lefthorn.setTextureOffset(44, 31).addBox(-5.0F, -6.0F, -1.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		lefthorn.setTextureOffset(16, 35).addBox(-6.0F, -9.0F, -1.0F, 1.0F, 6.0F, 2.0F, 0.0F, false);
		lefthorn.setTextureOffset(0, 16).addBox(-7.0F, -8.0F, -1.0F, 1.0F, 4.0F, 2.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		body.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.backleftleg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.rightarm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.backrightleg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.frontrightleg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.frontleftleg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.leftarm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
	}
}