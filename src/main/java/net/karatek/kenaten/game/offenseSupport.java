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

import net.karatek.kenaten.objects.placeholder;
import net.karatek.kenaten.objects.quitButton;
import net.karatek.kenaten.objects.skeleton;
import net.karatek.kenaten.utils.adb;
import net.karatek.kenaten.utils.screenshot;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.concurrent.TimeUnit;

public class offenseSupport {

    // Initialize Logger
    public static final Logger logger = LogManager.getLogger(offenseSupport.class);

    public static void support() {

        logger.info("Running offense support.");

        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Swipe to the upper left corner
        adb.runShellCommand("input swipe 539 529 1051 535");

        // Place object
        skeleton.click();


        boolean run = true;

        while (run) {
            logger.debug("Color of placeholder: " + placeholder.getColor());
            screenshot.shot();

            // Maybe improve these coordinates?
            adb.tap(331, 856);

            try {
                // Maybe I should just check when I am able to place again?
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if(placeholder.getColor().equals("10719458")) {
                run = false;
                quitButton.click();
                logger.debug("I should work...");
            }

        }

        // Exit



    }
}
