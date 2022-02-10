// Made with Blockbench 3.5.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class Modelcustom_model extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer outer_right_arm;
	private final ModelRenderer left_leg;
	private final ModelRenderer right_leg;
	private final ModelRenderer outer_left_arm;
	private final ModelRenderer inner_right_arm;
	private final ModelRenderer inner_left_arm;
	private final ModelRenderer head;

	public Modelcustom_model() {
		textureWidth = 36;
		textureHeight = 37;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 11.0F, 1.0F);
		body.setTextureOffset(0, 12).addBox(-5.0F, -3.0F, -2.0F, 10.0F, 2.0F, 4.0F, 0.0F, false);
		body.setTextureOffset(0, 18).addBox(-3.0F, -1.0F, -2.0F, 6.0F, 6.0F, 4.0F, 0.0F, false);

		outer_right_arm = new ModelRenderer(this);
		outer_right_arm.setRotationPoint(-5.0F, -2.0F, 0.0F);
		body.addChild(outer_right_arm);
		outer_right_arm.setTextureOffset(0, 28).addBox(-2.0F, -1.0F, -1.0F, 2.0F, 7.0F, 2.0F, 0.0F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(2.0F, 5.0F, 0.0F);
		body.addChild(left_leg);
		left_leg.setTextureOffset(20, 20).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(-2.0F, 5.0F, 0.0F);
		body.addChild(right_leg);
		right_leg.setTextureOffset(24, 0).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);

		outer_left_arm = new ModelRenderer(this);
		outer_left_arm.setRotationPoint(5.0F, -2.0F, 0.0F);
		body.addChild(outer_left_arm);
		outer_left_arm.setTextureOffset(8, 28).addBox(0.0F, -1.0F, -1.0F, 2.0F, 7.0F, 2.0F, 0.0F, false);

		inner_right_arm = new ModelRenderer(this);
		inner_right_arm.setRotationPoint(-4.0F, -1.0F, 0.0F);
		body.addChild(inner_right_arm);
		inner_right_arm.setTextureOffset(28, 10).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);

		inner_left_arm = new ModelRenderer(this);
		inner_left_arm.setRotationPoint(4.0F, -1.0F, 0.0F);
		body.addChild(inner_left_arm);
		inner_left_arm.setTextureOffset(26, 28).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -3.0F, 0.0F);
		body.addChild(head);
		head.setTextureOffset(0, 0).addBox(-3.0F, -6.0F, -3.0F, 6.0F, 6.0F, 6.0F, 0.0F, false);
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
		this.inner_left_arm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.inner_right_arm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.outer_left_arm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.outer_right_arm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
	}
}