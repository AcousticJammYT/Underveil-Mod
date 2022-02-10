
package dev.acousticjamm.underveil.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import dev.acousticjamm.underveil.world.inventory.FFGUIMenu;
import dev.acousticjamm.underveil.network.FFGUIButtonMessage;
import dev.acousticjamm.underveil.UnderveilMod;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class FFGUIScreen extends AbstractContainerScreen<FFGUIMenu> {
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public FFGUIScreen(FFGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("underveil:textures/ffgui.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		RenderSystem.setShaderTexture(0, new ResourceLocation("underveil:textures/fire.png"));
		this.blit(ms, this.leftPos + 44, this.topPos + 41, 0, 0, 14, 14, 14, 14);

		RenderSystem.setShaderTexture(0, new ResourceLocation("underveil:textures/arrow.png"));
		this.blit(ms, this.leftPos + 71, this.topPos + 23, 0, 0, 24, 17, 24, 17);

		RenderSystem.setShaderTexture(0, new ResourceLocation("underveil:textures/burnstone_ingot.png"));
		this.blit(ms, this.leftPos + 43, this.topPos + 57, 0, 0, 16, 16, 16, 16);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, "Flash Furnace", 5, 6, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();
		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
		this.addRenderableWidget(new Button(this.leftPos + 75, this.topPos + 49, 50, 20, new TextComponent("Smelt"), e -> {
			if (true) {
				UnderveilMod.PACKET_HANDLER.sendToServer(new FFGUIButtonMessage(0, x, y, z));
				FFGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
	}
}
