// Made with Blockbench 3.9.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelomega extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer backrightleg;
	private final ModelRenderer backleftleg;
	private final ModelRenderer torso;
	private final ModelRenderer frontrightleg;
	private final ModelRenderer frontleftleg;
	private final ModelRenderer innerrightarm;
	private final ModelRenderer outerrightarm;
	private final ModelRenderer cube_r1;
	private final ModelRenderer innerleftarm;
	private final ModelRenderer outerleftarm;
	private final ModelRenderer cube_r2;
	private final ModelRenderer head;
	private final ModelRenderer righthorn;
	private final ModelRenderer lefthorn;

	public Modelomega() {
		textureWidth = 62;
		textureHeight = 62;

		body = new ModelRenderer(this);
		body.setRotationPoint(-8.0F, 16.0F, 0.0F);

		backrightleg = new ModelRenderer(this);
		backrightleg.setRotationPoint(5.0F, -6.0F, 5.5F);
		body.addChild(backrightleg);
		backrightleg.setTextureOffset(52, 32).addBox(-1.0F, 13.0F, -1.5F, 2.0F, 1.0F, 3.0F, 0.0F, false);
		backrightleg.setTextureOffset(54, 7).addBox(-1.0F, 10.0F, 0.5F, 2.0F, 3.0F, 1.0F, 0.0F, false);
		backrightleg.setTextureOffset(0, 52).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 9.0F, 1.0F, 0.0F, false);
		backrightleg.setTextureOffset(53, 27).addBox(-1.0F, 4.0F, -1.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		backrightleg.setTextureOffset(8, 29).addBox(-1.0F, 9.0F, -0.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		backleftleg = new ModelRenderer(this);
		backleftleg.setRotationPoint(11.0F, -6.0F, 5.5F);
		body.addChild(backleftleg);
		backleftleg.setTextureOffset(32, 52).addBox(-1.0F, 13.0F, -1.5F, 2.0F, 1.0F, 3.0F, 0.0F, false);
		backleftleg.setTextureOffset(28, 45).addBox(-1.0F, 10.0F, 0.5F, 2.0F, 3.0F, 1.0F, 0.0F, false);
		backleftleg.setTextureOffset(48, 45).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 9.0F, 1.0F, 0.0F, false);
		backleftleg.setTextureOffset(29, 52).addBox(-1.0F, 4.0F, -1.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		backleftleg.setTextureOffset(0, 29).addBox(-1.0F, 9.0F, -0.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		torso = new ModelRenderer(this);
		torso.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(torso);
		torso.setTextureOffset(0, 32).addBox(4.0F, -9.0F, -6.0F, 8.0F, 3.0F, 4.0F, 0.0F, false);
		torso.setTextureOffset(18, 23).addBox(4.0F, -9.0F, 0.0F, 8.0F, 3.0F, 6.0F, 0.0F, false);
		torso.setTextureOffset(40, 23).addBox(4.0F, -9.0F, -2.0F, 8.0F, 2.0F, 2.0F, 0.0F, false);
		torso.setTextureOffset(0, 16).addBox(4.0F, -18.0F, -6.0F, 8.0F, 9.0F, 4.0F, 0.0F, false);
		torso.setTextureOffset(32, 45).addBox(0.0F, -18.0F, -6.0F, 4.0F, 3.0F, 4.0F, 0.0F, false);
		torso.setTextureOffset(16, 45).addBox(12.0F, -18.0F, -6.0F, 4.0F, 3.0F, 4.0F, 0.0F, false);
		torso.setTextureOffset(16, 43).addBox(9.0F, -16.0F, -2.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		torso.setTextureOffset(22, 52).addBox(9.0F, -15.0F, -2.0F, 2.0F, 1.0F, 3.0F, 0.0F, false);
		torso.setTextureOffset(12, 39).addBox(9.0F, -12.0F, -2.0F, 2.0F, 1.0F, 3.0F, 0.0F, false);
		torso.setTextureOffset(42, 20).addBox(9.0F, -13.0F, -2.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		torso.setTextureOffset(40, 27).addBox(5.0F, -13.0F, -2.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		torso.setTextureOffset(32, 12).addBox(5.0F, -15.0F, -2.0F, 2.0F, 1.0F, 3.0F, 0.0F, false);
		torso.setTextureOffset(24, 20).addBox(5.0F, -16.0F, -2.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		torso.setTextureOffset(20, 16).addBox(5.0F, -12.0F, -2.0F, 2.0F, 1.0F, 3.0F, 0.0F, false);

		frontrightleg = new ModelRenderer(this);
		frontrightleg.setRotationPoint(5.0F, -6.0F, -5.0F);
		body.addChild(frontrightleg);
		frontrightleg.setTextureOffset(14, 52).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);
		frontrightleg.setTextureOffset(6, 52).addBox(-1.0F, 7.0F, -1.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);
		frontrightleg.setTextureOffset(46, 27).addBox(-1.0F, 12.0F, -2.0F, 2.0F, 2.0F, 3.0F, 0.0F, false);
		frontrightleg.setTextureOffset(48, 20).addBox(-1.0F, 5.0F, -1.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);

		frontleftleg = new ModelRenderer(this);
		frontleftleg.setRotationPoint(11.0F, -6.0F, -5.0F);
		body.addChild(frontleftleg);
		frontleftleg.setTextureOffset(48, 0).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);
		frontleftleg.setTextureOffset(0, 0).addBox(-1.0F, 7.0F, -1.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);
		frontleftleg.setTextureOffset(32, 7).addBox(-1.0F, 12.0F, -2.0F, 2.0F, 2.0F, 3.0F, 0.0F, false);
		frontleftleg.setTextureOffset(39, 7).addBox(-1.0F, 5.0F, -1.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);

		innerrightarm = new ModelRenderer(this);
		innerrightarm.setRotationPoint(2.0F, -15.0F, -4.0F);
		body.addChild(innerrightarm);
		innerrightarm.setTextureOffset(42, 7).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 9.0F, 4.0F, 0.0F, false);

		outerrightarm = new ModelRenderer(this);
		outerrightarm.setRotationPoint(0.0F, -18.0F, -4.0F);
		body.addChild(outerrightarm);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		outerrightarm.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 0.3927F);
		cube_r1.setTextureOffset(54, 45).addBox(0.0F, 10.0F, 2.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(54, 48).addBox(-2.0F, 10.0F, 2.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(48, 55).addBox(-4.0F, 10.0F, 2.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(56, 0).addBox(-5.0F, 10.0F, 1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(56, 3).addBox(-5.0F, 10.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(22, 56).addBox(-5.0F, 10.0F, -3.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(26, 56).addBox(0.0F, 10.0F, -3.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(24, 16).addBox(-5.0F, 9.0F, -3.0F, 6.0F, 1.0F, 6.0F, 0.0F, false);
		cube_r1.setTextureOffset(40, 32).addBox(-4.0F, 0.0F, -2.0F, 4.0F, 9.0F, 4.0F, 0.0F, false);

		innerleftarm = new ModelRenderer(this);
		innerleftarm.setRotationPoint(14.0F, -15.0F, -4.0F);
		body.addChild(innerleftarm);
		innerleftarm.setTextureOffset(0, 39).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 9.0F, 4.0F, 0.0F, false);

		outerleftarm = new ModelRenderer(this);
		outerleftarm.setRotationPoint(16.0F, -18.0F, -4.0F);
		body.addChild(outerleftarm);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		outerleftarm.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -0.3927F);
		cube_r2.setTextureOffset(0, 16).addBox(4.0F, 10.0F, -3.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r2.setTextureOffset(0, 32).addBox(4.0F, 10.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r2.setTextureOffset(0, 39).addBox(4.0F, 10.0F, 1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r2.setTextureOffset(19, 39).addBox(3.0F, 10.0F, 2.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r2.setTextureOffset(16, 45).addBox(1.0F, 10.0F, 2.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r2.setTextureOffset(44, 45).addBox(-1.0F, 10.0F, 2.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r2.setTextureOffset(54, 20).addBox(-1.0F, 10.0F, -3.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r2.setTextureOffset(24, 0).addBox(-1.0F, 9.0F, -3.0F, 6.0F, 1.0F, 6.0F, 0.0F, false);
		cube_r2.setTextureOffset(24, 32).addBox(0.0F, 0.0F, -2.0F, 4.0F, 9.0F, 4.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(8.0F, -18.0F, -4.0F);
		body.addChild(head);
		head.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);

		righthorn = new ModelRenderer(this);
		righthorn.setRotationPoint(0.0F, 26.0F, -4.0F);
		head.addChild(righthorn);
		righthorn.setTextureOffset(36, 32).addBox(-5.0F, -32.0F, 3.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		righthorn.setTextureOffset(52, 53).addBox(-6.0F, -34.0F, 3.0F, 1.0F, 5.0F, 2.0F, 0.0F, false);
		righthorn.setTextureOffset(42, 0).addBox(-7.0F, -33.0F, 3.0F, 1.0F, 3.0F, 2.0F, 0.0F, false);

		lefthorn = new ModelRenderer(this);
		lefthorn.setRotationPoint(0.0F, 26.0F, -4.0F);
		head.addChild(lefthorn);
		lefthorn.setTextureOffset(20, 32).addBox(4.0F, -32.0F, 3.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		lefthorn.setTextureOffset(42, 52).addBox(5.0F, -34.0F, 3.0F, 1.0F, 5.0F, 2.0F, 0.0F, false);
		lefthorn.setTextureOffset(24, 0).addBox(6.0F, -33.0F, 3.0F, 1.0F, 3.0F, 2.0F, 0.0F, false);
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
		this.outerrightarm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.backleftleg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.innerrightarm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.backrightleg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.frontrightleg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.frontleftleg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.innerleftarm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.outerleftarm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
	}
}