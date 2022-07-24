package endio.skills.from.life.item.custom.item;

import endio.skills.from.life.item.ModToolMaterials;
import net.minecraft.item.SwordItem;

public class ModSwordHeroItem extends SwordItem {

    public ModSwordHeroItem(ModToolMaterials toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, -2.4f, settings);
    }

}
