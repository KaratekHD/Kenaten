package net.karatek.goobot;

import net.karatek.goobot.game.defenseSupport;
import net.karatek.goobot.objects.battleBox;
import net.karatek.goobot.startup.ingame;
import net.karatek.goobot.startup.preWork;
import net.karatek.goobot.utils.screenshot;

public class Main {

    public static void main(String[] args) {
        preWork.checkCorrectApp();
        ingame.openAllianceTab();
        screenshot.shot();
        while (true) {
            System.out.println("[DEBUG] Color of 'battleBox' is " + battleBox.getColor());
            if(!battleBox.getColor().equals(statics.blankColor)) {
                battleBox.click();
                //TO-DO
                //check type of battle
                defenseSupport.support();
            }
        }
    }


}
