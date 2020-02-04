package net.karatek.kenaten;

import net.karatek.kenaten.game.offenseSupport;
import net.karatek.kenaten.objects.battleBox;
import net.karatek.kenaten.startup.ingame;
import net.karatek.kenaten.startup.preWork;
import net.karatek.kenaten.utils.screenshot;

import org.apache.logging.log4j.*;

public class Main {


    public static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {


        preWork.checkCorrectApp();
        if(!data.correctApp) {
            logger.fatal("App is not running.");
            System.exit(1);
            return;
        }
        ingame.openAllianceTab();
        screenshot.shot();
        while (true) {
            logger.debug("Color of 'battleBox' is " + battleBox.getColor());
            preWork.checkCorrectApp();
            if(!data.correctApp) {
                logger.fatal("App is not running.");
                System.exit(1);
                return;
            }
            if(battleBox.getColor().equals("24715858")) {
                battleBox.click();
                offenseSupport.support();
            }
        }
    }


}
