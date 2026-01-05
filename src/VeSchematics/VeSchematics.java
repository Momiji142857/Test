package VeSchematics;

import VeSchematics.content.blocks;
import VeSchematics.content.items;
import arc.Core;
import arc.Events;
import arc.util.Time;
import mindustry.game.EventType;
import mindustry.mod.Mod;
import mindustry.ui.dialogs.BaseDialog;

public class VeSchematics extends Mod {

    public VeSchematics(){
        Events.on(EventType.ClientLoadEvent.class, e -> {
            //show dialog upon startup
            Time.runTask(10f, () -> {
                BaseDialog dialog = new BaseDialog("frog");
                dialog.cont.add("behold").row();
                //mod sprites are prefixed with the mod name (this mod is called 've-schematics' in its config)
                dialog.cont.image(Core.atlas.find("ve-schematics-frog")).pad(20f).row();
                dialog.cont.button("I see", dialog::hide).size(100f, 50f);
                dialog.show();
            });
        });
    }

    @Override
    public void loadContent(){
        items.load();
        blocks.load();
    }
}
