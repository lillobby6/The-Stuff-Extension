package com.tse.entity;

import javax.annotation.Nonnull;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderStoneWalker extends RenderLiving<EntityStoneWalker>{
		
	private ResourceLocation mobTexture = new ResourceLocation("tse:textures/entity/stonewalker.png");

	public static final Factory FACTORY = new Factory();
	
	public RenderStoneWalker(RenderManager rendermanagerIn)
	{
		super(rendermanagerIn, new ModelOreWalker(), 0.05F);
	}

	@Override
	@Nonnull
	protected ResourceLocation getEntityTexture(EntityStoneWalker entity) {
		return mobTexture;
	}
	
	 public static class Factory implements IRenderFactory<EntityStoneWalker> {

	        @Override
	        public Render<? super EntityStoneWalker> createRenderFor(RenderManager manager) {
	            return new RenderStoneWalker(manager);
	        }

	    }


}
