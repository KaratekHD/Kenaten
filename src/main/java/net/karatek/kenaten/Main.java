package net.karatek.kenaten;

/*
 * Kenaten - an easy to use Gods Of Olympus bot.
 *
 * @author Karatek_HD
 * Copyright (C) 2020 Karatek_HD <kontakt@karatek.net>
 * Copyright (C) 2020 The Kenaten Development Team
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 */

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
        preWork.initializeDevices();

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
