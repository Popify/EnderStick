/*package com.github.popify.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BasicItemCreation extends Item
{
	public BasicItemCreation(String enderStick)
	{
		super();
		this.setUnlocalizedName(enderStick);
		this.setCreativeTab(CreativeTabs.tabCombat);
	}

}
*/

package com.github.popify.enderstick.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BasicItem extends Item
{
	public BasicItem(String enderStick)
	{
		
		
		//EnderStick = new EnderStickItems().setCreativeTab(CreativeTabs.tabTransport);

		
						
					this.setUnlocalizedName(enderStick);
					this.setCreativeTab(CreativeTabs.tabTransport);
	}
}