// Made with Blockbench 3.5.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class Modeldeadwalker_alpha extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer front_left_leg;
	private final ModelRenderer front_right_leg;
	private final ModelRenderer back_left_leg;
	private final ModelRenderer back_right_leg;
	private final ModelRenderer torso;
	private final ModelRenderer head;
	private final ModelRenderer tail;

	public Modeldeadwalker_alpha() {
		textureWidth = 43;
		textureHeight = 32;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 24.0F, 0.0F);

		front_left_leg = new ModelRenderer(this);
		front_left_leg.setRotationPoint(2.0F, -4.8333F, -3.8333F);
		body.addChild(front_left_leg);
		front_left_leg.setTextureOffset(16, 26).addBox(-1.0F, 3.8333F, -1.1667F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		front_left_leg.setTextureOffset(28, 29).addBox(-1.0F, 2.8333F, -0.1667F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		front_left_leg.setTextureOffset(0, 5).addBox(-1.0F, -0.1667F, -1.1667F, 2.0F, 3.0F, 2.0F, 0.0F, false);

		front_right_leg = new ModelRenderer(this);
		front_right_leg.setRotationPoint(-2.0F, -4.8333F, -3.8333F);
		body.addChild(front_right_leg);
		front_right_leg.setTextureOffset(19, 6).addBox(-1.0F, 3.8333F, -1.1667F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		front_right_leg.setTextureOffset(22, 29).addBox(-1.0F, 2.8333F, -0.1667F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		front_right_leg.setTextureOffset(0, 0).addBox(-1.0F, -0.1667F, -1.1667F, 2.0F, 3.0F, 2.0F, 0.0F, false);

		back_left_leg = new ModelRenderer(this);
		back_left_leg.setRotationPoint(2.0F, -5.125F, 2.5F);
		body.addChild(back_left_leg);
		back_left_leg.setTextureOffset(19, 3).addBox(-1.0F, 4.125F, -0.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		back_left_leg.setTextureOffset(16, 29).addBox(-1.0F, 3.125F, 0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		back_left_leg.setTextureOffset(19, 0).addBox(-1.0F, 2.125F, -0.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		back_left_leg.setTextureOffset(28, 21).addBox(-1.0F, 0.125F, -0.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);

		back_right_leg = new ModelRenderer(this);
		back_right_leg.setRotationPoint(-2.0F, -5.125F, 2.5F);
		body.addChild(back_right_leg);
		back_right_leg.setTextureOffset(0, 19).addBox(-1.0F, 4.125F, -0.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		back_right_leg.setTextureOffset(12, 26).addBox(-1.0F, 3.125F, 0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		back_right_leg.setTextureOffset(14, 17).addBox(-1.0F, 2.125F, -0.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		back_right_leg.setTextureOffset(28, 18).addBox(-1.0F, 0.125F, -0.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);

		torso = new ModelRenderer(this);
		torso.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(torso);
		torso.setTextureOffset(14, 14).addBox(-3.0F, -7.0F, -6.0F, 2.0F, 2.0F, 10.0F, 0.0F, false);
		torso.setTextureOffset(0, 12).addBox(1.0F, -7.0F, -6.0F, 2.0F, 2.0F, 10.0F, 0.0F, false);
		torso.setTextureOffset(19, 0).addBox(-1.0F, -7.0F, -6.0F, 2.0F, 1.0F, 10.0F, 0.0F, false);
		torso.setTextureOffset(0, 0).addBox(-2.0F, -8.0F, -6.0F, 4.0F, 1.0F, 11.0F, 0.0F, false);
		torso.setTextureOffset(20, 12).addBox(-1.0F, -9.0F, -5.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		torso.setTextureOffset(14, 20).addBox(-1.0F, -9.0F, -2.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		torso.setTextureOffset(14, 12).addBox(-1.0F, -9.0F, 1.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		torso.setTextureOffset(28, 15).addBox(-1.0F, -10.0F, -4.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		torso.setTextureOffset(28, 12).addBox(-1.0F, -10.0F, -1.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		torso.setTextureOffset(24, 26).addBox(-1.0F, -10.0F, 2.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -6.5F, -6.0F);
		body.addChild(head);
		head.setTextureOffset(0, 24).addBox(-2.0F, -2.5F, -4.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		head.setTextureOffset(6, 5).addBox(-2.0F, -3.5F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(6, 0).addBox(1.0F, -3.5F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 12).addBox(-1.0F, -0.5F, -6.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		tail = new ModelRenderer(this);
		tail.setRotationPoint(0.0F, -7.5F, 5.0F);
		body.addChild(tail);
		setRotationAngle(tail, 0.2618F, 0.0F, 0.0F);
		tail.setTextureOffset(0, 16).addBox(-1.0F, -0.5F, 0.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		tail.setTextureOffset(14, 14).addBox(-1.0F, -1.5F, 1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
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
		this.front_right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.back_right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.back_left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.front_left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}