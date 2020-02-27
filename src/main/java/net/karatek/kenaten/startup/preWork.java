package net.karatek.kenaten.startup;

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

import net.karatek.kenaten.Main;
import net.karatek.kenaten.data;
import net.karatek.kenaten.utils.adb;

import static net.karatek.kenaten.device.deviceHelper.deviceList;

public class preWork {

    public static void checkCorrectApp() {
        // I hope this is self explaining.
        data.correctApp = adb.runShellCommand("dumpsys activity activities | grep ResumedActivity").contains("com.aegisinteractive.goo");
    }

    // call this inside your main, this will load up devices.
    public static void initializeDevices() {
        deviceList.add("z3");
        deviceList.add("enchilda");
    }

    // prevent screen from turning off
    public static void keepScreenOn() {
        adb.runShellCommand("svc power stayon usb");
    }

    // add a shutdown hook to the runtime
    public static void addShutdownHook() {
        Runtime.getRuntime().addShutdownHook(new Thread()
        {
            @Override
            public void run() {
                Main.logger.info("Ending...");
                // Allow turning off the screen
                adb.runShellCommand("svc power stayon false");
            }
        });
    }

}