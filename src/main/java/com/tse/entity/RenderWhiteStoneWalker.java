package com.tse.entity;

import javax.annotation.Nonnull;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderWhiteStoneWalker extends RenderLiving<EntityWhiteStoneWalker>{
		
	private ResourceLocation mobTexture = new ResourceLocation("tse:textures/entity/whitestonewalker.png");

	public static final Factory FACTORY = new Factory();
	
	public RenderWhiteStoneWalker(RenderManager rendermanagerIn)
	{
		super(rendermanagerIn, new ModelOreWalker(), 0.05F);
	}

	@Override
	@Nonnull
	protected ResourceLocation getEntityTexture(EntityWhiteStoneWalker entity) {
		return mobTexture;
	}
	
	 public static class Factory implements IRenderFactory<EntityWhiteStoneWalker> {

	        @Override
	        public Render<? super EntityWhiteStoneWalker> createRenderFor(RenderManager manager) {
	            return new RenderWhiteStoneWalker(manager);
	        }

	    }


}
