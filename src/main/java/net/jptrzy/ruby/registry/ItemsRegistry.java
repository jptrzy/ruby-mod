package net.jptrzy.ruby.registry;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.jptrzy.ruby.Main;
import net.jptrzy.ruby.items.Ruby;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ItemsRegistry {
    public static final Ruby RUBY = new Ruby(new FabricItemSettings().group(ItemGroup.MISC));

    public static void init(){
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "ruby"), RUBY);
    }
}
