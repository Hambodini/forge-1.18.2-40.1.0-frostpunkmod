package net.hambodini.frostpunkmod.items;

import net.hambodini.frostpunkmod.frostpunkmod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, frostpunkmod.Mod_ID);
    //misc items
    public static  final RegistryObject<Item> STEAM_CORE = ITEMS.register("steam_core", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static  final RegistryObject<Item> MUSKET_SHOT = ITEMS.register("musket_shot", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static  final RegistryObject<Item> SULFUR = ITEMS.register("sulfur", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static  final RegistryObject<Item> POTASSIUM = ITEMS.register("potassium", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static  final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static  final RegistryObject<Item> RIVET = ITEMS.register("rivet", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static  final RegistryObject<Item> SUPER_STEEL = ITEMS.register("super_steel", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static  final RegistryObject<Item> ASH = ITEMS.register("ash", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    //fuels

    public static  final RegistryObject<Item> COW_CHIP = ITEMS.register("cow_chip", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static  final RegistryObject<Item> HALF_COAL = ITEMS.register("half_coal", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    //food

    public static  final RegistryObject<Item> EMERGENCY_RATION = ITEMS.register("emergency_ration", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static  final RegistryObject<Item> MONSTER_MEAT_RAW = ITEMS.register("monster_meat_raw", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static  final RegistryObject<Item> MONSTER_MEAT_COOKED = ITEMS.register("monster_meat_cooked", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static  final RegistryObject<Item> MAN_MEAT_RAW = ITEMS.register("man_meat_raw", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static  final RegistryObject<Item> MAN_MEAT_COOKED = ITEMS.register("man_meat_cooked", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static  final RegistryObject<Item> MYSTERY_MEAT_RAW = ITEMS.register("mystery_meat_raw", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static  final RegistryObject<Item> MYSTERY_MEAT_COOKED = ITEMS.register("mystery_meat_cooked", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    //sword

    public static  final RegistryObject<Item> STEEL_SWORD = ITEMS.register("steel_sword", () -> new Item(new SwordItem.Properties()));

    //axe

    public static  final RegistryObject<Item> STEEL_AXE = ITEMS.register("steel_axe", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    //hoe

    public static  final RegistryObject<Item> STEEL_HOE = ITEMS.register("steel_hoe", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    //pickaxe

    public static  final RegistryObject<Item> STEEL_PICKAXE = ITEMS.register("steel_pickaxe", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    //shovel

    public static  final RegistryObject<Item> STEEL_SHOVEL = ITEMS.register("steel_shovel", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    //guns

    public static  final RegistryObject<Item> MUSKET = ITEMS.register("musket", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    //bows

    public static  final RegistryObject<Item> STEEL_BOW = ITEMS.register("steel_bow", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    //armor

    public static  final RegistryObject<Item> STEEL_HELMET = ITEMS.register("steel_helmet", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static  final RegistryObject<Item> STEEL_CHESTPLATE = ITEMS.register("steel_chestplate", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static  final RegistryObject<Item> STEEL_LEGGINGS = ITEMS.register("steel_leggings", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static  final RegistryObject<Item> STEEL_BOOTS = ITEMS.register("steel_boots", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static  final RegistryObject<Item> STEEL_FUR_HELMET = ITEMS.register("steel_fur_helmet", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static  final RegistryObject<Item> STEEL_FUR_CHESTPLATE = ITEMS.register("steel_fur_chestplate", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static  final RegistryObject<Item> STEEL_FUR_LEGGINGS = ITEMS.register("steel_fur_leggings", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static  final RegistryObject<Item> STEEL_FUR_BOOTS = ITEMS.register("steel_fur_boots", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static  final RegistryObject<Item> FUR_HELMET = ITEMS.register("fur_helmet", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static  final RegistryObject<Item> FUR_CHESTPLATE = ITEMS.register("fur_chestplate", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static  final RegistryObject<Item> FUR_LEGGINGS = ITEMS.register("fur_leggings", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static  final RegistryObject<Item> FUR_BOOTS = ITEMS.register("fur_boots", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    //custom sword

    public static  final RegistryObject<Item> MEAT_CLEAVER = ITEMS.register("meat_cleaver", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    //custom item

    public static  final RegistryObject<Item> DOWSING_ROD = ITEMS.register("dowsing_rod", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    //register method
    public static void  register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
