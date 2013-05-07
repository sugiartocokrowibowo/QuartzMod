package RedstoneOmar.mod.QuartzMod;

import RedstoneOmar.mod.QuartzMod.Armour.ItemQuartzBoots;
import RedstoneOmar.mod.QuartzMod.Armour.ItemQuartzChestplate;
import RedstoneOmar.mod.QuartzMod.Armour.ItemQuartzHelmet;
import RedstoneOmar.mod.QuartzMod.Armour.ItemQuartzLeggings;
import RedstoneOmar.mod.QuartzMod.item.ItemQuartzChisel;
import RedstoneOmar.mod.QuartzMod.tool.ItemQuartzAxe;
import RedstoneOmar.mod.QuartzMod.tool.ItemQuartzHoe;
import RedstoneOmar.mod.QuartzMod.tool.ItemQuartzPickaxe;
import RedstoneOmar.mod.QuartzMod.tool.ItemQuartzShovel;
import RedstoneOmar.mod.QuartzMod.tool.ItemQuartzSword;
import net.java.games.input.RawInputEnvironmentPlugin;
import net.minecraft.block.Block;
import net.minecraft.block.BlockQuartz;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.src.ModLoader;
import net.minecraftforge.common.EnumHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = "QuartzMod", name = "Quartz Mod", version = "1.0.3")
public class QuartzMod {
	
	//Set Variables
	public static Item QuartzPickaxe;
	public static Item QuartzSword;
	public static Item QuartzShovel;
	public static Item QuartzAxe;
	public static Item QuartzHoe;
	public static Item QuartzChisel;
	public static Item QuartzHelmet;
	public static Item QuartzChestplate;
	public static Item QuartzLeggings;
	public static Item QuartzBoots;
	
	//Armour Efficiency
	public static EnumArmorMaterial armourQuartz = EnumHelper.addArmorMaterial("QUARTZ", 22, new int[]{3, 7, 5, 3}, 9);
	
	//Tool Powers and Effectiveness
	public static EnumToolMaterial toolQuartz = EnumHelper.addToolMaterial("QUARTZ", 2, 800, 8.0F, 3, 15);
	
	public QuartzMod(){
		
		//Set Tools, And their Respective Tabs, And Their IDs
		QuartzPickaxe = new ItemQuartzPickaxe(500, toolQuartz).setUnlocalizedName("QuartzPickaxe").setCreativeTab(CreativeTabs.tabTools);
		QuartzSword = new ItemQuartzSword(501, toolQuartz).setUnlocalizedName("QuartzSword").setCreativeTab(CreativeTabs.tabCombat);
		QuartzShovel = new ItemQuartzShovel(502, toolQuartz).setUnlocalizedName("QuartzShovel").setCreativeTab(CreativeTabs.tabTools);
		QuartzAxe = new ItemQuartzAxe(503, toolQuartz).setUnlocalizedName("QuartzAxe").setCreativeTab(CreativeTabs.tabTools);
		QuartzHoe = new ItemQuartzHoe(504, toolQuartz).setUnlocalizedName("QuartzHoe").setCreativeTab(CreativeTabs.tabTools);
		QuartzChisel = new ItemQuartzChisel(505).setUnlocalizedName("QuartzChizel").setCreativeTab(CreativeTabs.tabMaterials);
		QuartzHelmet = new ItemQuartzHelmet(506,armourQuartz, ModLoader.addArmor("Quartz"), 0).setUnlocalizedName("QuartzHelmet").setCreativeTab(CreativeTabs.tabCombat);
		QuartzChestplate = new ItemQuartzChestplate(507, armourQuartz, ModLoader.addArmor("Quartz"), 1).setUnlocalizedName("QuartzChesstplate").setCreativeTab(CreativeTabs.tabCombat);
		QuartzLeggings = new ItemQuartzLeggings(508, armourQuartz, ModLoader.addArmor("Quartz"), 2).setUnlocalizedName("QuartzLeggings").setCreativeTab(CreativeTabs.tabCombat);
		QuartzBoots = new ItemQuartzBoots(509, armourQuartz, ModLoader.addArmor("Quartz"), 3).setUnlocalizedName("QuartzBoots").setCreativeTab(CreativeTabs.tabCombat);
		
		//Naming Tools for In Game
		LanguageRegistry.addName(QuartzPickaxe, "Quartz Pickaxe");
		LanguageRegistry.addName(QuartzSword, "Quartz Sword");
		LanguageRegistry.addName(QuartzShovel, "Quartz Shovel");
		LanguageRegistry.addName(QuartzAxe, "Quartz Axe");
		LanguageRegistry.addName(QuartzHoe, "Quartz Hoe");
		LanguageRegistry.addName(QuartzChisel, "Quartz Chizel");
		LanguageRegistry.addName(QuartzHelmet, "Quartz Helmet");
		LanguageRegistry.addName(QuartzChestplate, "Quartz Chestplate");
		LanguageRegistry.addName(QuartzLeggings, "Quartz Leggings");
		LanguageRegistry.addName(QuartzBoots, "Quartz Boots");
		
		//Item Recipes
		GameRegistry.addRecipe(new ItemStack(QuartzPickaxe, 1), new Object [] {
			"XXX"," * "," * ",'X',Item.netherQuartz,'*',Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(QuartzSword, 1), new Object [] {
			" X "," X "," * ",'X',Item.netherQuartz,'*',Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(QuartzShovel, 1), new Object [] {
			" X "," * "," * ",'X',Item.netherQuartz,'*',Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(QuartzAxe, 1), new Object [] {
			"XX ","X* "," * ",'X',Item.netherQuartz,'*',Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(QuartzHoe, 1), new Object [] {
			"XX "," * "," * ",'X',Item.netherQuartz,'*',Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(QuartzChisel, 1), new Object [] {
			" X ", " * ",'X',Item.netherQuartz,'*',Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(QuartzHelmet, 1), new Object [] {
			"XXX", "X X", "   ", 'X',Item.netherQuartz
		});
		GameRegistry.addRecipe(new ItemStack(QuartzChestplate, 1), new Object [] {
			"X X", "XXX", "XXX", 'X',Item.netherQuartz
		});
		GameRegistry.addRecipe(new ItemStack(QuartzLeggings, 1), new Object [] {
			"XXX", "X X", "X X", 'X',Item.netherQuartz
		});
		GameRegistry.addRecipe(new ItemStack(QuartzBoots, 1), new Object []{
			"   ", "X X", "X X", 'X',Item.netherQuartz
		});
	}

}
