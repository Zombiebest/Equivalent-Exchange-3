package com.pahimar.ee3.init;

import com.pahimar.ee3.recipe.RecipesAludel;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class Recipes
{
    public static void init()
    {
        initModRecipes();
        initAludelRecipes();
    }

    private static void initModRecipes()
    {
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.alchemicalFuelBlock, 1, 0), "fff", "fff", "fff", 'f', new ItemStack(ModItems.alchemicalFuel, 1, 0));
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.alchemicalFuelBlock, 1, 1), "fff", "fff", "fff", 'f', new ItemStack(ModItems.alchemicalFuel, 1, 1));
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.alchemicalFuelBlock, 1, 2), "fff", "fff", "fff", 'f', new ItemStack(ModItems.alchemicalFuel, 1, 2));

        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.alchemicalFuel, 9, 0), new ItemStack(ModBlocks.alchemicalFuelBlock, 1, 0));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.alchemicalFuel, 9, 1), new ItemStack(ModBlocks.alchemicalFuelBlock, 1, 1));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.alchemicalFuel, 9, 2), new ItemStack(ModBlocks.alchemicalFuelBlock, 1, 2));

        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.chalkBlock), "bcb", "cbc", "bcb", 'b', new ItemStack(Items.dye, 1, 15), 'c', new ItemStack(Items.clay_ball));
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.chalkBlock), "cc", "cc", 'c', new ItemStack(ModItems.chalk));

        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.glassBell), "ggg", "g g", "g g", 'g', Blocks.glass);
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.calcinator), "i i", "sis", "s s", 'i', "ingotIron", 's', Blocks.stone));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.aludel), "iii", "sis", "iii", 'i', "ingotIron", 's', Blocks.stone));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.researchStation), "ipi", " s ", "sss", 'i', "ingotIron", 's', Blocks.stone, 'p', "slabWood"));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.stoneInert), "sis", "igi", "sis", 's', Blocks.stone, 'i', "ingotIron", 'g', "ingotGold"));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.diviningRod), " s ", " s ", "s s", 's', "stickWood"));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.augmentationTable), "i  ", "sss", "p p", 'i', "ingotIron", 's', "slabWood", 'p', "plankWood"));

        GameRegistry.addShapedRecipe(new ItemStack(ModItems.shovelDarkMatter), "m", "d", "d", 'm', new ItemStack(ModItems.matter, 1, 0), 'd', Items.diamond);
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.pickAxeDarkMatter), "mmm", " d ", " d ", 'm', new ItemStack(ModItems.matter, 1, 0), 'd', Items.diamond);
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.hammerDarkMatter), "mmm", "mdm", " d ", 'm', new ItemStack(ModItems.matter, 1, 0), 'd', Items.diamond);
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.axeDarkMatter), "mm ", "md ", " d ", 'm', new ItemStack(ModItems.matter, 1, 0), 'd', Items.diamond);
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.hoeDarkMatter), "mm ", " d ", " d ", 'm', new ItemStack(ModItems.matter, 1, 0), 'd', Items.diamond);
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.fishingRodDarkMatter), "  w", " ws", "m s", 'm', new ItemStack(ModItems.matter, 1, 0), 'w', "stickWood", 's', new ItemStack(Items.string)));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.shearsDarkMatter), "m ", " m", 'm', new ItemStack(ModItems.matter, 1, 0));

        GameRegistry.addShapedRecipe(new ItemStack(ModItems.bowDarkMatter), "sm ", "s m", "sm ", 'm', new ItemStack(ModItems.matter, 1, 0), 's', new ItemStack(Items.string));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.arrowDarkMatter, 64), "  m", " s ", "f  ", 'm', new ItemStack(ModItems.matter, 1, 0), 's', "stickWood", 'f', new ItemStack(Items.feather)));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.swordDarkMatter), "m", "m", "d", 'm', new ItemStack(ModItems.matter, 1, 0), 'd', Items.diamond);
    }

    private static void initAludelRecipes()
    {
        // Ash + Verdant = Azure
        RecipesAludel.getInstance().addRecipe(new ItemStack(ModItems.alchemicalDust, 1, 2), new ItemStack(ModItems.alchemicalDust, 1, 0), new ItemStack(ModItems.alchemicalDust, 32, 1));

        // Ash + Azure = Minium
        RecipesAludel.getInstance().addRecipe(new ItemStack(ModItems.alchemicalDust, 1, 3), new ItemStack(ModItems.alchemicalDust, 1, 0), new ItemStack(ModItems.alchemicalDust, 4, 2));

        // Alchemical Coal
        RecipesAludel.getInstance().addRecipe(new ItemStack(ModItems.alchemicalFuel, 1, 0), new ItemStack(Items.coal, 1, 0), new ItemStack(ModItems.alchemicalDust, 32, 1));
        RecipesAludel.getInstance().addRecipe(new ItemStack(ModItems.alchemicalFuel, 1, 0), new ItemStack(Items.coal, 1, 0), new ItemStack(ModItems.alchemicalDust, 1, 2));
        RecipesAludel.getInstance().addRecipe(new ItemStack(ModItems.alchemicalFuel, 4, 0), new ItemStack(Items.coal, 4, 0), new ItemStack(ModItems.alchemicalDust, 1, 3));

        // Mobius Fuel
        RecipesAludel.getInstance().addRecipe(new ItemStack(ModItems.alchemicalFuel, 1, 1), new ItemStack(ModItems.alchemicalFuel, 1, 0), new ItemStack(ModItems.alchemicalDust, 7, 2));
        RecipesAludel.getInstance().addRecipe(new ItemStack(ModItems.alchemicalFuel, 1, 1), new ItemStack(ModItems.alchemicalFuel, 1, 0), new ItemStack(ModItems.alchemicalDust, 2, 3));

        // Aeternalis Fuel
        RecipesAludel.getInstance().addRecipe(new ItemStack(ModItems.alchemicalFuel, 1, 2), new ItemStack(ModItems.alchemicalFuel, 1, 1), new ItemStack(ModItems.alchemicalDust, 56, 2));
        RecipesAludel.getInstance().addRecipe(new ItemStack(ModItems.alchemicalFuel, 1, 2), new ItemStack(ModItems.alchemicalFuel, 1, 1), new ItemStack(ModItems.alchemicalDust, 14, 3));

        // Alchemical Chest
        RecipesAludel.getInstance().addRecipe(new ItemStack(ModBlocks.alchemicalChest, 1, 0), new ItemStack(Blocks.chest, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(ModItems.alchemicalDust, 8, 1));
        RecipesAludel.getInstance().addRecipe(new ItemStack(ModBlocks.alchemicalChest, 1, 0), new ItemStack(Blocks.trapped_chest, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(ModItems.alchemicalDust, 8, 1));
        RecipesAludel.getInstance().addRecipe(new ItemStack(ModBlocks.alchemicalChest, 1, 1), new ItemStack(Blocks.chest, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(ModItems.alchemicalDust, 8, 2));
        RecipesAludel.getInstance().addRecipe(new ItemStack(ModBlocks.alchemicalChest, 1, 1), new ItemStack(ModBlocks.alchemicalChest, 1, 0), new ItemStack(ModItems.alchemicalDust, 8, 2));
        RecipesAludel.getInstance().addRecipe(new ItemStack(ModBlocks.alchemicalChest, 1, 2), new ItemStack(Blocks.chest, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(ModItems.alchemicalDust, 8, 3));
        RecipesAludel.getInstance().addRecipe(new ItemStack(ModBlocks.alchemicalChest, 1, 2), new ItemStack(ModBlocks.alchemicalChest, 1, 0), new ItemStack(ModItems.alchemicalDust, 8, 3));
        RecipesAludel.getInstance().addRecipe(new ItemStack(ModBlocks.alchemicalChest, 1, 2), new ItemStack(ModBlocks.alchemicalChest, 1, 1), new ItemStack(ModItems.alchemicalDust, 8, 3));

        // Minium Stone
        RecipesAludel.getInstance().addRecipe(new ItemStack(ModItems.stoneMinium), new ItemStack(ModItems.stoneInert), new ItemStack(ModItems.alchemicalDust, 8, 3));

        // Tome of Alchemical Knowledge
        RecipesAludel.getInstance().addRecipe(new ItemStack(ModItems.alchemicalTome), new ItemStack(Items.book), new ItemStack(ModItems.alchemicalDust, 1, 3));

        // Alchemical bags
        RecipesAludel.getInstance().addRecipe(new ItemStack(ModItems.alchemicalBag, 1, 0), new ItemStack(Blocks.wool, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(ModItems.alchemicalDust, 8, 1));
        RecipesAludel.getInstance().addRecipe(new ItemStack(ModItems.alchemicalBag, 1, 1), new ItemStack(Blocks.wool, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(ModItems.alchemicalDust, 8, 2));
        RecipesAludel.getInstance().addRecipe(new ItemStack(ModItems.alchemicalBag, 1, 2), new ItemStack(Blocks.wool, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(ModItems.alchemicalDust, 8, 3));
    }
}
