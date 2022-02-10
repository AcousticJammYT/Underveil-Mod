// Made with Blockbench 4.0.5
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelWolf2<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "modelwolf2"), "main");
	private final ModelPart WolfHead;
	private final ModelPart Body;
	private final ModelPart Mane;
	private final ModelPart Leg1;
	private final ModelPart Leg2;
	private final ModelPart Leg3;
	private final ModelPart Leg4;
	private final ModelPart Tail;

	public ModelWolf2(ModelPart root) {
		this.WolfHead = root.getChild("WolfHead");
		this.Body = root.getChild("Body");
		this.Mane = root.getChild("Mane");
		this.Leg1 = root.getChild("Leg1");
		this.Leg2 = root.getChild("Leg2");
		this.Leg3 = root.getChild("Leg3");
		this.Leg4 = root.getChild("Leg4");
		this.Tail = root.getChild("Tail");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition WolfHead = partdefinition.addOrReplaceChild("WolfHead",
				CubeListBuilder.create().texOffs(0, 0).mirror()
						.addBox(-3.0F, -3.0F, -2.0F, 6.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-1.0F, 13.5F, -7.0F));

		PartDefinition Nose = WolfHead.addOrReplaceChild("Nose",
				CubeListBuilder.create().texOffs(0, 10).mirror()
						.addBox(-2.0F, -1.0F, -4.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.5F, 1.0F, -2.0F));

		PartDefinition Ear1 = WolfHead.addOrReplaceChild("Ear1",
				CubeListBuilder.create().texOffs(16, 14).mirror()
						.addBox(-3.0F, -5.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Ear2 = WolfHead.addOrReplaceChild("Ear2",
				CubeListBuilder.create().texOffs(16, 14).mirror()
						.addBox(1.0F, -5.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(18, 14).mirror()
						.addBox(-4.0F, -2.0F, -3.0F, 6.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 14.0F, 2.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition Mane = partdefinition.addOrReplaceChild("Mane",
				CubeListBuilder.create().texOffs(21, 0).mirror()
						.addBox(-4.0F, -3.0F, -3.0F, 8.0F, 6.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.0F, 14.0F, -3.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition Leg1 = partdefinition.addOrReplaceChild("Leg1",
				CubeListBuilder.create().texOffs(0, 18).mirror()
						.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-2.5F, 16.0F, 7.0F));

		PartDefinition Leg2 = partdefinition.addOrReplaceChild("Leg2",
				CubeListBuilder.create().texOffs(0, 18).mirror()
						.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.5F, 16.0F, 7.0F));

		PartDefinition Leg3 = partdefinition.addOrReplaceChild("Leg3",
				CubeListBuilder.create().texOffs(0, 18).mirror()
						.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-2.5F, 16.0F, -4.0F));

		PartDefinition Leg4 = partdefinition.addOrReplaceChild("Leg4",
				CubeListBuilder.create().texOffs(0, 18).mirror()
						.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.5F, 16.0F, -4.0F));

		PartDefinition Tail = partdefinition.addOrReplaceChild("Tail",
				CubeListBuilder.create().texOffs(9, 18).mirror()
						.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.0F, 12.0F, 8.0F, 1.1301F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		WolfHead.render(poseStack, buffer, packedLight, packedOverlay);
		Body.render(poseStack, buffer, packedLight, packedOverlay);
		Mane.render(poseStack, buffer, packedLight, packedOverlay);
		Leg1.render(poseStack, buffer, packedLight, packedOverlay);
		Leg2.render(poseStack, buffer, packedLight, packedOverlay);
		Leg3.render(poseStack, buffer, packedLight, packedOverlay);
		Leg4.render(poseStack, buffer, packedLight, packedOverlay);
		Tail.render(poseStack, buffer, packedLight, packedOverlay);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.Leg2.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.Leg3.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.Leg4.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.WolfHead.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.WolfHead.xRot = headPitch / (180F / (float) Math.PI);
		this.Leg1.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.Tail.zRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
	}
}