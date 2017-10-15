package net.insane96mcp.galaxite;

import net.insane96mcp.galaxite.init.ModBlocks;
import net.insane96mcp.galaxite.init.ModItems;
import net.insane96mcp.galaxite.lib.CustomEventHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import scala.reflect.internal.Trees.New;

public class CommonProxy {
	public void PreInit(FMLPreInitializationEvent event) {
		ModItems.Init();
		ModBlocks.Init();
	}
	
	public void Init(FMLInitializationEvent event) {
		ModItems.PostInit();
		ModBlocks.PostInit();
		MinecraftForge.EVENT_BUS.register(CustomEventHandler.class);
	}
	
	public void PostInit(FMLPostInitializationEvent event) {
		
	}
}