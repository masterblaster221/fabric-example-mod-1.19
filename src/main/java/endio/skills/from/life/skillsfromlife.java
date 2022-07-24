package endio.skills.from.life;

import net.fabricmc.api.ModInitializer;
import endio.skills.from.life.block.ModBlocks;
import endio.skills.from.life.item.ModItems;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class skillsfromlife implements ModInitializer {
	public static final String MOD_ID = "life";
	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.regesterModItems();
		ModBlocks.registerModBlocks();
	}
}