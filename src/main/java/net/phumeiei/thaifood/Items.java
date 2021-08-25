package net.phumeiei.thaifood;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Items {

    public static final Item KNIFE = new Item(new Item.Settings().group(ItemGroup.MISC));

    public static void regItems() {
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "knife"), KNIFE);
    }

}
