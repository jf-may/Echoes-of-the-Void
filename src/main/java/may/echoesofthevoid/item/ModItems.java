package may.echoesofthevoid.item;

import may.echoesofthevoid.EchoesOfTheVoid;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item VOID_ECHOLET = registerItem("void_echolet", new Item(new Item.Settings()));
    public static final Item VOID_ECHO = registerItem("void_echo", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(EchoesOfTheVoid.MOD_ID, name), item);
    }

    public static void registerModItems() {
        EchoesOfTheVoid.LOGGER.info("Registering Mod Items for " + EchoesOfTheVoid.MOD_ID);

        // TODO: Make a new item group for every item in the mod
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> {
            entries.add(VOID_ECHOLET);
            entries.add(VOID_ECHO);
        });
    }
}
