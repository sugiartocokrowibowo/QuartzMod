package RedstoneOmar.mod.QuartzMod.tool;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemHoe;

public class ItemQuartzHoe extends ItemHoe{

	public ItemQuartzHoe(int par1, EnumToolMaterial par2EnumToolMaterial) {
		super(par1, par2EnumToolMaterial);
		
	}
	public void registerIcons(IconRegister iconRegister){
		itemIcon = iconRegister.registerIcon("QuartzMod:QuartzHoe");
	}
}
