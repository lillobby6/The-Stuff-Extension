package com.tse.common.world.entity;

import javax.annotation.Nonnull;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderBrightsteelBlockWalker extends RenderLiving<EntityBrightsteelBlockWalker>{
		
	private ResourceLocation mobTexture = new ResourceLocation("tse:textures/entity/brightsteelblockwalker.png");

	public static final Factory FACTORY = new Factory();
	
	public RenderBrightsteelBlockWalker(RenderManager rendermanagerIn)
	{
		super(rendermanagerIn, new ModelOreWalker(), 0.05F);
	}

	@Override
	@Nonnull
	protected ResourceLocation getEntityTexture(EntityBrightsteelBlockWalker entity) {
		return mobTexture;
	}
	
	 public static class Factory implements IRenderFactory<EntityBrightsteelBlockWalker> {

	        @Override
	        public Render<? super EntityBrightsteelBlockWalker> createRenderFor(RenderManager manager) {
	            return new RenderBrightsteelBlockWalker(manager);
	        }

	 }


}
