package mindustry.client.ui;

import arc.graphics.*;
import arc.scene.ui.*;
import arc.scene.ui.layout.*;
import mindustry.ui.dialogs.*;

public class FeaturesDialog extends FloatingDialog{

    public FeaturesDialog(){
        super("Features");
        shown(this::setup);
        onResize(this::setup);
    }

    private void setup(){
        cont.clear();
        buttons.clear();

        Table t = new Table();

        Color titleColor = Color.gold;
        Color color1 = Color.lightGray;
        Color color2 = Color.gray;

        label(t, "Misc", titleColor);
        label(t, "Zoom effectively uncapped", color1);
        label(t, "Health bar", color2);
        label(t, "Basic name/command autocompletion", color1);
        label(t, "View enemy turret range when hovered", color2);
        label(t, "Core item display, displays core item counts and net gain/loss", color1);
        label(t, "Turret target indicator (sometimes it can be a little slow to update)", color2);
        label(t, "Autopickup/dump (buttons on bottom right next to schematic menu)", color1);

        label(t, "\nAdditional Game Settings", titleColor);
        label(t, "Toggle Ambient Lighting (Graphics)", color1);
        label(t, "Flying unit transparency/invisibility (Graphics)", color2);
        label(t, "Toggle !here for other users, allows others to post their coordinates easily (Game)", color1);
        label(t, "Various other settings that I can't be bothered to list", color2);
        
        label(t, "\nTab Menu Additions (use on self to stop)", titleColor);
        label(t, "Build assist (copy button)", color1);
        label(t, "Build blocking (shield button)", color2);
        label(t, "Watch player (magnifier button)", color1);
        label(t, "Mass undo (undo/share button)", color2);
        label(t, "Encrypted chat (chat icon),", color1);
        label(t, "only works if there is a message block with the correct text (button in message block dialog)", color1);
        label(t, "\nTop GUI (left to right)", titleColor);
        label(t, "Create new path (records item pickups)", color1);
        label(t, "Add waypoint to path", color2);
        label(t, "Follow path (follows set waypoints)", color1);
        label(t, "Stop placing/following path", color2);
        label(t, "Delete path", color1);
        label(t, "Fixpower (doesnt connect through plast walls, [#dd5656]EMERGENCY ONLY[#"+color2.toString()+"])", color2);
        label(t, "Start pathfinding path (no waypoints)", color1);
        label(t, "End pathfinding path (AI will avoid enemy turrets if possible)", color2);
        
        label(t, "\nHotkeys and Commands", titleColor);
        label(t, "ARROW KEYS - Freecam ", color1);
        label(t, "R - Stop freecam (locks camera to player)", color2);
        label(t, "N - Move to camera (only works with freecam)", color1);
        label(t, "Z - Path to camera (^ but uses AI to avoid turrets)", color2);
        label(t, "B - Automatically go to unbuilt buildings", color1);
        label(t, "L - Phantom mode", color1);
        label(t, "G - toggle X-ray mode", color2);
        label(t, "/alpha, /delta, /tau, etc commands - goes to the nearest mech/ship pad", color1);
        label(t, "O - hold to hide units", color2);
        label(t, "/c <nickname set in tab menu> [message...] - send an encrypted message to that player", color1);
        label(t, "(must have been initialized in tab menu)", color1);
        label(t, "O - hold to hide units", color1);
        label(t, "` (BACKTICK) - Toggle showing enemy turret ranges", color2);
        label(t, "; (SEMICOLON) - Automine/draug, mines and stores needed resources", color1);
        label(t, "CTRL + F - Find block by ID, ENTER to select, /go to go", color2);
        label(t, "CTRL + Z - Undo / Redo last block place/break", color1);
        label(t, "SHIFT + CLICK/RIGHTCLICK - Prioritize building/breaking specified block", color2);
        label(t, "CTRL + CLICK - Block history (records places, breaks and configures)", color1);
        label(t, "CTRL + SHIFT + CLICK - Set coordinate as default for transfer creation", color2);
        label(t, "RCTRL/RSHIFT - Zoom in/out", color1);
        label(t, "/go - input coordinates or player name", color2);
        label(t, "/here - posts your coordinates in chat", color1);

        label(t, "Discord + Changelog: discord.gg/yp9ZW7j", titleColor);

        cont.add(new ScrollPane(t)).growX();

        addCloseButton();
    }

    private void label(Table t, String text){
        label(t, text, Color.white);
    }

    private void label(Table t, String text, Color color){
        Label label = new Label(text);
        label.setColor(color);
        t.add(label);
        t.row();
    }
}
