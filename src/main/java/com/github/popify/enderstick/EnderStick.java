/*
package com.github.popify.enderstick;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = EnderStick.MODID, version = EnderStick.VERSION, name = EnderStick.NAME)

public class EnderStick
{
    public static final String MODID = "enderstick";
    
    //Use MODID in the give command to issue the item wanted
    //Name of Mod and Version
    
    public static final String NAME = "Ender Stick";
    public static final String VERSION = "1.0";
   
    @SidedProxy(clientSide="com.github.popify.enderstick.ClientProxy", serverSide="com.github.popify.enderstick.ServerProxy")

    public static CommonProxy proxy;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	this.proxy.preInit(event);
    }
    
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
		this.proxy.init(event);
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
    	this.proxy.postInit(event);
    }
    
}


//Fresh start?
*/

//Fresh Start 9/27/16

//Rebuild Basic Mod File
/*
package com.github.popify.enderstick;

//ctr+shift+o for auto imports

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

//specify MODID, MODNAME, and VERSION in class not here
@Mod(modid = EnderStick.MODID, name = EnderStick.MODNAME, version = EnderStick.VERSION)


public class EnderStick 
{
	public static final String MODID = "enderstick";
	public static final String MODNAME = "Ender Stick";
	public static final String VERSION = "1.0.0";
	
	//call for @SidedProxy within the class not outside
	
	@SidedProxy(clientSide="com.github.popify.enderstick.ClientProxy", serverSide="com.github.popify.enderstick.ServerProxy")
	public static CommonProxy proxy;
	
	@Instance
	public static EnderStick instance = new EnderStick();

	@EventHandler
	public void preInit(FMLPreInitializationEvent e) 
	{
		this.proxy.preInit(e);
	}
	
	@EventHandler
	public void init(FMLInitializationEvent e) 
	{
		this.proxy.init(e);
	}
	@EventHandler
	public void postInit(FMLPostInitializationEvent e)
	{
		this.proxy.postInit(e);
	}
	
		
	
	
	
}
*/
//Building 9/28/16

package com.github.popify.enderstick;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = EnderStick.MODID, version = EnderStick.VERSION, name = EnderStick.NAME)

public class EnderStick
{
	//Information about the Mod that's being created
	//MODID and NAME are required, VERSION is a luxury
	public static final String MODID = "enderstick";
	public static final String VERSION = "1.0.1";
	public static final String NAME = "Ender Stick";
	
	@Instance
	public static EnderStick instance = new EnderStick();
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent e)
	{
		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent e)
	{
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent e)
	{
		
	}
}
	




