package net.karatek.kenaten.game;

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
import net.karatek.kenaten.objects.quitButton;
import net.karatek.kenaten.objects.skeleton;
import net.karatek.kenaten.utils.adb;
import net.karatek.kenaten.utils.image;
import net.karatek.kenaten.utils.screenshot;

import java.util.concurrent.TimeUnit;

public class offenseSupport {

    public static void support() {

        // TO-DO
        // check whether is loaded and catch bird
        // Down there: Read out from device file
        while (!image.getPixel(1096, 1029).equals("99194140")) {
            Main.logger.debug("Loading...");
        }

        Main.logger.debug("Loaded.");

        // Swipe to the upper left corner
        adb.runShellCommand("input swipe 539 529 1051 535");

        // Place object
        skeleton.click();

        while (!(image.getPixel(910, 831).equals(107162156))) {
            screenshot.shot();

            // Maybe improve these coordinates?
            adb.tap(331, 856);

            try {
                // Maybe I should just check when I am able to place again?
                TimeUnit.SECONDS.sleep(15);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

        // Exit

        quitButton.click();

    }
}
