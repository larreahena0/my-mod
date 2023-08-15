package dev.larreahenao.mymod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class MyModCreativeModeTab {
    public static final CreativeModeTab MY_MOD_TAB = new CreativeModeTab("mymodtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.ZIRCON.get());
        }
    };
}
