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

import net.karatek.kenaten.exceptions.DeviceNameNotFoundException;
import net.karatek.kenaten.objects.Coordinate;

public class Device {

    // Initialize variables
    public static String deviceCodename;
    public static Coordinate battleBox;
    public static Coordinate placeholder;
    public static Coordinate quitButton;
    public static Coordinate skeleton;
    public static Coordinate supportLoadingBar;
    public static Coordinate swipea;
    public static Coordinate swipeb;
    public static Coordinate supportChecker;
    public static Coordinate supportTargetLocation;

    // constructor; set variables
    public Device(String codename) throws DeviceNameNotFoundException {
        deviceCodename = codename;
        if(!deviceHelper.deviceList.contains(deviceCodename)) {
            throw new DeviceNameNotFoundException(deviceCodename);
        }
        switch (deviceCodename) {
            case "z3":
                battleBox = new Coordinate(1365, 428);
                placeholder = new Coordinate(910, 831);
                quitButton = new Coordinate(1743, 1018);
                skeleton = new Coordinate(108, 432); 
                supportLoadingBar = new Coordinate(1096, 1029);
                swipea = new Coordinate(539, 529);
                swipeb = new Coordinate(1051, 535);
                supportChecker = new Coordinate(910, 831);
                supportTargetLocation = new Coordinate(331, 856);
                break;
            case "serranoltex":
                break;
            default:
                battleBox = new Coordinate(0, 0);
                placeholder = new Coordinate(0, 0);
                quitButton = new Coordinate(0, 0);
                skeleton = new Coordinate(0, 0);
                supportLoadingBar = new Coordinate(0, 0);
                swipea = new Coordinate(0, 0);
                swipeb = new Coordinate(0, 0);
                supportChecker = new Coordinate(0, 0);
                supportTargetLocation = new Coordinate(0, 0);
        }
    }
}
