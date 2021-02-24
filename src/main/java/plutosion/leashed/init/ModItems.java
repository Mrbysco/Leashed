package plutosion.leashed.init;

import plutosion.leashed.Leashed;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

/**
 * This class has the register event handler for all custom items.
 * This class uses @Mod.EventBusSubscriber so the event handler has to be static
 * This class uses @ObjectHolder to get a reference to the items
 */
@Mod.EventBusSubscriber(modid = Leashed.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(Leashed.MOD_ID)
public class ModItems {

    public static final Item diamond_lead = null;

    /**
     * The actual event handler that registers the custom items.
     *
     * @param event The event this event handler handles
     */
    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        //In here you pass in all item instances you want to register.
        //Make sure you always set the registry name.
        event.getRegistry().registerAll(

                new Item(new Item.Properties().group(ItemGroup.MISC)).setRegistryName(Leashed.MOD_ID, "diamond_lead")

        );
    }

}