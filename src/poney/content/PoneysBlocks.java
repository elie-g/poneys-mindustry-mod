package poney.content;

import mindustry.content.Items;
import mindustry.type.Category;
import mindustry.world.Block;
import mindustry.world.blocks.distribution.StackConveyor;
import mindustry.world.blocks.liquid.Conduit;
import mindustry.world.blocks.liquid.LiquidBridge;
import mindustry.world.blocks.liquid.LiquidRouter;

import static mindustry.type.ItemStack.with;

public class PoneysBlocks {

    public static Block
            poneysConveyor,

            // Liquid
            pressurizedConduit, pressurizedLiquidRouter, pressurizedLiquidJunction, pressurizedBridgeConduit,
            pressurizedPhaseConduit;

    public static void load() {

        poneysConveyor = new StackConveyor("poneys-conveyor") {{
            requirements(Category.distribution, with(Items.copper, 1, Items.lead, 2, Items.titanium, 2, Items.graphite, 1, Items.thorium, 1));
            health = 120;
            speed = 12f / 60f; // 12 stacks/second;
            itemCapacity = 15;
        }};


        // Liquid conduits

        final float PRESSURE = 5f;
        pressurizedConduit = new Conduit("pressurized-conduit") {{
            requirements(Category.liquid, with(Items.titanium, 2, Items.metaglass, 1, Items.plastanium, 1));
            liquidPressure = PRESSURE;
            liquidCapacity = 16f;
            health = 120;
        }};
        pressurizedLiquidRouter = new LiquidRouter("pressurized-liquid-router") {{
            requirements(Category.liquid, with(Items.titanium, 10, Items.metaglass, 15));
            liquidPressure = PRESSURE;
            liquidCapacity = 50f;
            underBullets = true;
            solid = false;
        }};
        pressurizedLiquidJunction = new LiquidRouter("pressurized-liquid-junction") {{
            requirements(Category.liquid, with(Items.graphite, 10, Items.metaglass, 15));
            liquidPressure = PRESSURE;
            solid = false;
        }};
        pressurizedBridgeConduit = new LiquidBridge("pressurized-bridge-conduit") {{
            requirements(Category.liquid, with(Items.graphite, 10, Items.metaglass, 15));
            liquidPressure = PRESSURE;
            fadeIn = moveArrows = false;
            arrowSpacing = 6f;
            range = 7;
            hasPower = false;
        }};
        pressurizedPhaseConduit = new LiquidBridge("pressurized-phase-conduit") {{
            requirements(Category.liquid, with(Items.phaseFabric, 8, Items.silicon, 9, Items.metaglass, 30, Items.titanium, 17));
            liquidPressure = PRESSURE;
            range = 12;
            arrowPeriod = 0.9f;
            arrowTimeScl = 2.75f;
            hasPower = true;
            canOverdrive = false;
            pulse = true;
            consumePower(0.4f);
        }};
    }
}
