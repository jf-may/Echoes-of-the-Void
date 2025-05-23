package may.echoesofthevoid;

import may.echoesofthevoid.block.ModBlocks;
import may.echoesofthevoid.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EchoesOfTheVoid implements ModInitializer {
	public static final String MOD_ID = "echoes-of-the-void";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}