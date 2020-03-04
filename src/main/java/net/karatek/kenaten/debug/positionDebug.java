package net.karatek.kenaten.debug;

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


import net.karatek.kenaten.objects.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class positionDebug {
    // Initialize Logger
    public static final Logger logger = LogManager.getLogger(positionDebug.class);

    public static void printPositions() {
        logger.debug("battleBox has x=" + battleBox.x + " and y=" + battleBox.y);
        logger.debug("placeholder has x=" + placeholder.x + " and y=" + placeholder.y);
        logger.debug("quitButton has x=" + quitButton.x + " and y=" + quitButton.y);
        logger.debug("skelleton has x=" + skeleton.x + " and y=" + skeleton.y);
        logger.debug("sidebar has x=" + sidebar.x + " and y=" + sidebar.y);
        logger.debug("tab has x=" + tab.x + " and y=" + tab.y);
    }

}
