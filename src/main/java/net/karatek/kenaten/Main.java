package net.karatek.kenaten;

import net.karatek.kenaten.device.Device;
import net.karatek.kenaten.exceptions.DeviceNameNotFoundException;
import net.karatek.kenaten.game.offenseSupport;
import net.karatek.kenaten.objects.battleBox;
import net.karatek.kenaten.startup.ingame;
import net.karatek.kenaten.startup.preWork;
import net.karatek.kenaten.utils.DeviceClass;
import net.karatek.kenaten.utils.screenshot;

import org.apache.logging.log4j.*;

public class Main {

    // Initialize Logger
    public static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {

        // check if game is running
        // TO-DO: Maybe autostart if not?
        preWork.checkCorrectApp();

        // Load list of supported devices and coordinates
        Device.initializeDevices();

        // set device from data class
        try {
            DeviceClass.setDevice(data.device);
        } catch (DeviceNameNotFoundException e) {
            e.printStackTrace();
        }

        // print error message and return
        if(!data.correctApp) {
            logger.fatal("App is not running.");
            System.exit(1);
            return;
        }

        // open alliance tab (Self explaining, isn't it? )
        ingame.openAllianceTab();

        // shoot screenshot
        screenshot.shot();

        while (true) {

            // print color of battlebox
            logger.debug("Color of 'battleBox' is " + battleBox.getColor());

            // always check whether app is running and exit if not
            preWork.checkCorrectApp();
            if(!data.correctApp) {
                logger.fatal("App is not running.");
                System.exit(1);
                return;
            }

            // check if offense support is needed
            if(battleBox.getColor().equals("24715858")) {
                // click battlebox
                battleBox.click();
                // start supporting (wip)
                offenseSupport.support();
            }
        }
    }


}
