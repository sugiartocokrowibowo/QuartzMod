package RedstoneOmar.mod.QuartzMod.item;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class ItemQuartzChisel extends Item{

	public ItemQuartzChisel(int par1) {
		super(par1);
		
	}
	
	public void registerIcons(IconRegister iconRegister){
		itemIcon = iconRegister.registerIcon("QuartzMod:QuartzChisel");
	}
}
