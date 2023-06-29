package poney;

import arc.*;
import arc.util.*;
import mindustry.content.Items;
import mindustry.game.EventType.*;
import mindustry.mod.*;
import mindustry.type.Category;
import mindustry.type.Item;
import mindustry.type.ItemStack;
import mindustry.ui.dialogs.*;
import mindustry.world.blocks.liquid.Conduit;
import poney.content.PoneysBlocks;
import poney.content.PoneysTechTree;

import static mindustry.type.ItemStack.with;

public class PoneysMod extends Mod{

    public PoneysMod(){
        Log.info("Loaded ExampleJavaMod constructor.");

//        //listen for game load event
//        Events.on(ClientLoadEvent.class, e -> {
//            //show dialog upon startup
//            Time.runTask(10f, () -> {
//                //Vars.state.rules.defaultTeam.core().acceptItem();
//                ///Vars.state.rules.defaultTeam.core().handleStack(Vars.content.items().find(item -> item.name.equalsIgnoreCase("lead")), 10_000, null);
//                BaseDialog dialog = new BaseDialog("frog");
//                dialog.cont.add("behold").row();
//                //mod sprites are prefixed with the mod name (this mod is called 'example-java-mod' in its config)
//                dialog.cont.image(Core.atlas.find("example-java-mod-frog")).pad(20f).row();
//                dialog.cont.button("I see", dialog::hide).size(100f, 50f);
//                dialog.show();
//            });
//        });
    }

    @Override
    public void loadContent(){
        PoneysBlocks.load();
        PoneysTechTree.load();
    }

}
