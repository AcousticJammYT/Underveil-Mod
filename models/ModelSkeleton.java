
/**
 * ModelSkeleton - Either Mojang or a mod author Created using Tabula 7.0.0
 */
public static class ModelSkeleton extends ModelBase {
	public ModelRenderer rightarm;
	public ModelRenderer rightleg;
	public ModelRenderer head;
	public ModelRenderer torso;
	public ModelRenderer leftarm;
	public ModelRenderer leftleg;

	public ModelSkeleton() {
		this.textureWidth = 64;
		this.textureHeight = 32;
		this.head = new ModelRenderer(this, 0, 0);
		this.head.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.head.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F);
		this.rightarm = new ModelRenderer(this, 40, 16);
		this.rightarm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		this.rightarm.addBox(-1.0F, -2.0F, -1.0F, 2, 12, 2, 0.0F);
		this.leftarm = new ModelRenderer(this, 40, 16);
		this.leftarm.mirror = true;
		this.leftarm.setRotationPoint(5.0F, 2.0F, 0.0F);
		this.leftarm.addBox(-1.0F, -2.0F, -1.0F, 2, 12, 2, 0.0F);
		this.rightleg = new ModelRenderer(this, 0, 16);
		this.rightleg.setRotationPoint(-2.0F, 12.0F, 0.1F);
		this.rightleg.addBox(-1.0F, 0.0F, -1.0F, 2, 12, 2, 0.0F);
		this.torso = new ModelRenderer(this, 16, 16);
		this.torso.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.torso.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F);
		this.leftleg = new ModelRenderer(this, 0, 16);
		this.leftleg.mirror = true;
		this.leftleg.setRotationPoint(2.0F, 12.0F, 0.1F);
		this.leftleg.addBox(-1.0F, 0.0F, -1.0F, 2, 12, 2, 0.0F);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		this.head.render(f5);
		this.rightarm.render(f5);
		this.leftarm.render(f5);
		this.rightleg.render(f5);
		this.torso.render(f5);
		this.leftleg.render(f5);
	}

	/**
	 * This is a helper function from Tabula to set the rotation of model parts
	 */
	public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.rightleg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.rightarm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.leftleg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.leftarm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
	}

}
