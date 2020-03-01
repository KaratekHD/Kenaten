package net.karatek.kenaten.device;

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

import net.karatek.kenaten.objects.Coordinate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Device {

    // Initialize Logger
    public static final Logger logger = LogManager.getLogger(Device.class);


    // Initialize variables
    public static String deviceCodename;
    public static Coordinate battleBox() {
        switch (deviceCodename) {
            case "z3":
                return z3.battleBox;
            case "enchilda":
                return enchilda.battleBox;
            default:
                return null;

        }

    }

    public static Coordinate placeholder() {
        switch (deviceCodename) {
            case "z3":
                return z3.placeholder;
            case "enchilda":
                return enchilda.placeholder;
            default:
                return null;

        }
    }

    public static Coordinate quitButton() {
        switch (deviceCodename) {
            case "z3":
                return z3.quitButton;
            case "enchilda":
                return enchilda.quitButton;
            default:
                return null;

        }
    }

    public static Coordinate skeleton() {
        switch (deviceCodename) {
            case "z3":
                return z3.skeleton;
            case "enchilda":
                return enchilda.skeleton;
            default:
                return null;

        }
    }

    public static Coordinate supportLoadingBar() {
        switch (deviceCodename) {
            case "z3":
                return z3.supportLoadingBar;
            case "enchilda":
                return enchilda.supportLoadingBar;
            default:
                return null;

        }
    }

    public static Coordinate swipea() {
        switch (deviceCodename) {
            case "z3":
                return z3.swipea;
            case "enchilda":
                return enchilda.swipea;
            default:
                return null;

        }
    }

    public static Coordinate swipeb() {
        switch (deviceCodename) {
            case "z3":
                return z3.swipeb;
            case "enchilda":
                return enchilda.swipeb;
            default:
                return null;

        }
    }

    public static Coordinate supportChecker() {
        switch (deviceCodename) {
            case "z3":
                return z3.supportChecker;
            case "enchilda":
                return enchilda.supportChecker;
            default:
                return null;

        }
    }

    public static Coordinate supportTargetLocation() {
        switch (deviceCodename) {
            case "z3":
                return z3.supportTargetLocation;
            case "enchilda":
                return enchilda.supportTargetLocation;
            default:
                return null;

        }
    }

    public static Coordinate sidebar() {
        switch (deviceCodename) {
            case "z3":
                return z3.sidebar;
            case "enchilda":
                return enchilda.sidebar;
            default:
                return null;

        }
    }

    public static Coordinate tab() {
        switch (deviceCodename) {
            case "z3":
                return z3.tab;
            case "enchilda":
                return enchilda.tab;
            default:
                return null;

        }
    }

}
