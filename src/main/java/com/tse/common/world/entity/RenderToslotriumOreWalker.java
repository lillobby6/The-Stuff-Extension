package com.tse.common.world.entity;

import javax.annotation.Nonnull;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderToslotriumOreWalker extends RenderLiving<EntityToslotriumOreWalker>{
		
	private ResourceLocation mobTexture = new ResourceLocation("tse:textures/entity/toslotriumorewalker.png");

	public static final Factory FACTORY = new Factory();
	
	public RenderToslotriumOreWalker(RenderManager rendermanagerIn)
	{
		super(rendermanagerIn, new ModelOreWalker(), 0.05F);
	}

	@Override
	@Nonnull
	protected ResourceLocation getEntityTexture(EntityToslotriumOreWalker entity) {
		return mobTexture;
	}
	
	 public static class Factory implements IRenderFactory<EntityToslotriumOreWalker> {

	        @Override
	        public Render<? super EntityToslotriumOreWalker> createRenderFor(RenderManager manager) {
	            return new RenderToslotriumOreWalker(manager);
	        }

	    }


}
