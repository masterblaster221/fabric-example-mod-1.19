package endio.skills.from.life.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

import endio.skills.from.life.SkillsFromLife;
import endio.skills.from.life.item.custom.item.ModSwordHeroItem;
import net.minecraft.item.FoodComponents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

	public static final Item SWORD_OF_A_HERO = regesterItem("sword_of_a_hero",
			new ModSwordHeroItem(ModToolMaterials.HERO_STEEL, 1, 0,
					new FabricItemSettings().group(ItemGroup.COMBAT)));

	public static final Item EYE_OF_SECRETS = regesterItem("eye_of_secrets",
			new Item(new FabricItemSettings().group(ItemGroup.MATERIALS).food(FoodComponents.GOLDEN_APPLE)));

	public static final Item BROKEN_THING = regesterItem("broken_thing",
			new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));

	public static final Item RIBS = regesterItem("ribs",
			new Item(new FabricItemSettings().group(ItemGroup.MATERIALS).food(FoodComponents.GOLDEN_APPLE)));

	public static final String ITEMS = null;

	private static Item regesterItem(String name, Item item) {
		return Registry.register(Registry.ITEM, new Identifier(SkillsFromLife.MOD_ID, name), item);
	}

	public static void regesterModItems() {
		SkillsFromLife.LOGGER.info("regestering Mod Items for " + SkillsFromLife.MOD_ID);
	}
}