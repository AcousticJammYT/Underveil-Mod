// Made with Blockbench 3.5.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class ModelGamma extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer right_leg;
	private final ModelRenderer left_leg;
	private final ModelRenderer left_arm;
	private final ModelRenderer right_arm;
	private final ModelRenderer torso;
	private final ModelRenderer head;

	public ModelGamma() {
		textureWidth = 48;
		textureHeight = 46;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 24.0F, 0.0F);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(-2.0F, -10.0F, 0.0F);
		body.addChild(right_leg);
		right_leg.setTextureOffset(32, 32).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 10.0F, 4.0F, 0.0F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(2.0F, -10.0F, 0.0F);
		body.addChild(left_leg);
		left_leg.setTextureOffset(0, 26).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 10.0F, 4.0F, 0.0F, false);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(4.0F, -20.0F, 0.0F);
		body.addChild(left_arm);
		left_arm.setTextureOffset(20, 22).addBox(0.0F, 0.0F, -2.0F, 4.0F, 10.0F, 4.0F, 0.0F, false);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(-4.0F, -20.0F, 0.0F);
		body.addChild(right_arm);
		setRotationAngle(right_arm, 0.0F, 3.1416F, 0.0F);
		right_arm.setTextureOffset(32, 16).addBox(0.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
		right_arm.setTextureOffset(18, 8).addBox(-1.0F, 6.0F, -3.0F, 6.0F, 2.0F, 6.0F, 0.0F, false);
		right_arm.setTextureOffset(24, 0).addBox(-1.0F, 8.0F, -3.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		right_arm.setTextureOffset(22, 16).addBox(4.0F, 8.0F, -2.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		right_arm.setTextureOffset(20, 0).addBox(4.0F, 8.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		right_arm.setTextureOffset(18, 16).addBox(4.0F, 8.0F, 2.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		right_arm.setTextureOffset(0, 17).addBox(3.0F, 8.0F, -3.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		right_arm.setTextureOffset(0, 14).addBox(1.0F, 8.0F, -3.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		right_arm.setTextureOffset(0, 0).addBox(-1.0F, 8.0F, 2.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		torso = new ModelRenderer(this);
		torso.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(torso);
		torso.setTextureOffset(0, 0).addBox(-4.0F, -20.0F, -2.0F, 8.0F, 10.0F, 4.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -20.0F, 0.0F);
		body.addChild(head);
		head.setTextureOffset(0, 14).addBox(-3.0F, -6.0F, -3.0F, 6.0F, 6.0F, 6.0F, 0.0F, false);
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
		this.left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.right_arm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.left_arm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
	}
}