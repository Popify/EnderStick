/*
package com.github.popify.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class EnderStickItem 
{
	public static Item enderStick;
	
	public static final void knit() 
	{
		enderStick = new Item().setUnlocalizedName("enderStick").setCreativeTab(CreativeTabs.tabCombat);
		GameRegistry.registerItem(enderStick, "enderStick");
	}
	public static Item enderStick;
	
	//Create item for use in game
	
	 * GameRegistry registers the item in the BIC
	 * 2nd name is the same so it works
	 *
	
	public static void createItems()
			{
				GameRegistry.registerItem(enderStick = new BasicItemCreation("ender_stick"), "ender_stick");
			}

}
*/

//Fresh Start 9/27/16

package com.github.popify.enderstick.items;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public final class EnderStickItems 
{
	public static Item enderStick;
	
	public static void createItems() 
	{
		//.regsiterItem is call for a new BasicItem named "ender_stick"
		GameRegistry.registerItem(enderStick = new BasicItem("ender_stick"), "ender_stick");
	}
	//This is the tooltip
	//Declare Side?
	@SideOnly(Side.CLIENT)
	public static void addInformation(ItemStack itemStack, EntityPlayer player, List dataList, boolean bool)
	{
		dataList.add("This is a test");
		dataList.add("This is a" + EnumChatFormatting.GOLD + " miracle!");
	}
}

