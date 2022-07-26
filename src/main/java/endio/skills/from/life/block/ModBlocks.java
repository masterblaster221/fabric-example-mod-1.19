package endio.skills.from.life.block;

import endio.skills.from.life.SkillsFromLife;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block TEMP = registerBlock("temp",
            new Block(FabricBlockSettings.of(Material.WOOD).dropsNothing().strength(1f).requiresTool()),
            ItemGroup.SEARCH);

    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(SkillsFromLife.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(SkillsFromLife.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks() {
        SkillsFromLife.LOGGER.info("regestering Mod Blocks for " + SkillsFromLife.MOD_ID);
    }
}