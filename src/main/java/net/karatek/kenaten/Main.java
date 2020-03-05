package net.karatek.kenaten;

/*
 * Kenaten - an easy to use Gods Of Olympus bot.
 *
 * @author Karatek_HD
 * Copyright (C) 2020 Karatek_HD <kontakt@karatek.net>
 * Copyright (C) 2020 The Kenaten Development Team
 * Tested by the Alliance "Tod oder Lebendig" with great support from our leader Nyx.
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

import net.karatek.kenaten.debug.positionDebug;
import net.karatek.kenaten.exceptions.DeviceNameNotFoundException;
import net.karatek.kenaten.game.offenseSupport;
import net.karatek.kenaten.objects.battleBox;
import net.karatek.kenaten.startup.ingame;
import net.karatek.kenaten.startup.preWork;
import net.karatek.kenaten.utils.DeviceClass;
import net.karatek.kenaten.utils.adb;
import net.karatek.kenaten.utils.screenshot;

import org.apache.logging.log4j.*;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class Main {

    public static final String VERSION = "0.2 pre-alpha";

    // Initialize Logger
    public static final Logger logger = LogManager.getLogger(Main.class);


    public static void main(String[] args) {

        System.out.println("Running Kenaten v" + VERSION);
        System.out.println("Copyright (C) 2020 The Kenaten Development Team");

        System.out.println();
        System.out.println("This program comes with ABSOLUTELY NO WARRANTY; for details use `license'.\n" +
            "This is free software, and you are welcome to redistribute it \n" +
            "under certain conditions; use 'license' for details.");

        // check whether argument is provided
        String arg;
        if(args.length == 0) {
            arg = "";
        }else arg = args[0];

        switch (arg) {

            case "run":
                if(args.length < 2) {
                    logger.fatal("Please provide a device codename.");
                    return;
                }
                data.devicename = args[1];
                // check if game is running
                // TO-DO: Maybe autostart if not?
                preWork.checkCorrectApp();

                // Load list of supported devices and coordinates
                preWork.initializeDevices();

                // set device from data class
                try {
                    DeviceClass.setDevice(data.devicename);
                } catch (DeviceNameNotFoundException e) {
                    e.printStackTrace();
                }

                // print error message and return
                if(!data.correctApp) {
                    logger.info("App is not running, starting...");
                    adb.runShellCommand("monkey -p com.aegisinteractive.goo -c android.intent.category.LAUNCHER 1");
                }

                // prevent screen from turning off
                preWork.keepScreenOn();

                // add shutdown hook
                preWork.addShutdownHook();

                // open alliance tab (Self explaining, isn't it? )
                ingame.openAllianceTab();

                // shoot screenshot
                screenshot.shot();

                // debug positions
                positionDebug.printPositions();

                while (true) {

                    try {
                        TimeUnit.SECONDS.sleep(3);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
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
            case "devices":
                System.out.println("Supported devices are:\n");
                System.out.println("╔═codename═════════╦═common name═════════════════════════╦═maintainer═══════╗");
                System.out.println("║enchilda          ║OnePlus 6 (WIP)                      ║Karatek_HD        ║");
                System.out.println("║z3                ║Sony Xperia Z3                       ║Karatek_HD        ║");
                System.out.println("║serranoltexx      ║Samsung Galaxy S4 Mini LTE (TODO)    ║ttzug             ║");
                System.out.println("╚══════════════════╩═════════════════════════════════════╩══════════════════╝");
                break;
            case "license":
                System.out.println("\nKenaten - an easy to use Gods Of Olympus bot.");
                System.out.println();
                System.out.println("This program is free software: you can redistribute it and/or modify");
                System.out.println("it under the terms of the GNU General Public License as published by");
                System.out.println("the Free Software Foundation, either version 3 of the License, or");
                System.out.println("(at your option) any later version.");
                System.out.println();
                System.out.println("This program is distributed in the hope that it will be useful,");
                System.out.println("but WITHOUT ANY WARRANTY; without even the implied warranty of");
                System.out.println("MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the");
                System.out.println("GNU General Public License for more details.");
                System.out.println();
                System.out.println("You should have received a copy of the GNU General Public License");
                System.out.println("along with this program.  If not, see <http://www.gnu.org/licenses/>.");
                break;
            case "about":
                System.out.println("\nKenaten v" + VERSION);
                System.out.println("List of contributors:");
                System.out.println("\n╔═name═════════╦═role═══════════════════════════════════════╗");
                System.out.println("║Karatek_HD    ║Main developer                              ║");
                System.out.println("║ttzug         ║Assistance                                  ║");
                System.out.println("╚══════════════╩════════════════════════════════════════════╝");
                System.out.println("\nUse 'license' to get copyright notices!");
                break;
            default:
                System.out.println("\nBelow a list of available arguments:\n");
                System.out.println("╔═argument══════╦═description═══════════════════════════════════════╗");
                System.out.println("║run            ║Start the bot. Don't forget to provide a device!   ║");
                System.out.println("║help           ║Print this list.                                   ║");
                System.out.println("║about          ║Get version information.                           ║");
                System.out.println("║license        ║Get license information.                           ║");
                System.out.println("║devices        ║Shows a list of supported devices.                 ║");
                System.out.println("╚═══════════════╩═══════════════════════════════════════════════════╝");
                break;
        }


    }


}
