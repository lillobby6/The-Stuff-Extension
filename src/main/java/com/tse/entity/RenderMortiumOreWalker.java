package com.tse.entity;

import javax.annotation.Nonnull;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderMortiumOreWalker extends RenderLiving<EntityMortiumOreWalker>{
		
	private ResourceLocation mobTexture = new ResourceLocation("tse:textures/entity/mortium_ore_walker.png");

	public static final Factory FACTORY = new Factory();
	
	public RenderMortiumOreWalker(RenderManager rendermanagerIn)
	{
		super(rendermanagerIn, new ModelOreWalker(), 0.05F);
	}

	@Override
	@Nonnull
	protected ResourceLocation getEntityTexture(EntityMortiumOreWalker entity) {
		// TODO Auto-generated method stub
		return mobTexture;
	}
	
	 public static class Factory implements IRenderFactory<EntityMortiumOreWalker> {

	        @Override
	        public Render<? super EntityMortiumOreWalker> createRenderFor(RenderManager manager) {
	            return new RenderMortiumOreWalker(manager);
	        }

	    }


}
