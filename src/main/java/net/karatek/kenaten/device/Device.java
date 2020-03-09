package net.karatek.kenaten.device;

/*
 * Kenaten - an easy to use Gods Of Olympus bot.
 *
 * @author Karatek_HD
 * Copyright (C) 2020 Karatek_HD x
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
        if(deviceCodename.equals("z3")) return new Coordinate(1365, 428);
        if(deviceCodename.equals("enchilda")) return new Coordinate(1728, 428);
        return null;

    }

    public static Coordinate wifiindicator() {
        if(deviceCodename.equals("z3")) return new Coordinate(1365, 428); // TODO
        if(deviceCodename.equals("enchilda")) return new Coordinate(1118, 537);
        return null;
    }

    public static Coordinate placeholder() {
        if(deviceCodename.equals("z3")) return new Coordinate(910, 831);
        if(deviceCodename.equals("enchilda")) return new Coordinate(1028, 368);
        return null;
    }

    public static Coordinate quitButton() {
        if(deviceCodename.equals("z3")) return new Coordinate(1743, 1018);
        if(deviceCodename.equals("enchilda")) return new Coordinate(1930, 1010);
        return null;
    }

    public static Coordinate skeleton() {
        if(deviceCodename.equals("z3")) return new Coordinate(108, 432);
        if(deviceCodename.equals("enchilda")) return new Coordinate(108, 432);
        return null;
    }

    public static Coordinate supportLoadingBar() {
        if(deviceCodename.equals("z3")) return new Coordinate(1096, 1029);
        if(deviceCodename.equals("enchilda")) return new Coordinate(1252, 1033);
        return null;
    }

    public static Coordinate swipea() {
        if(deviceCodename.equals("z3")) return new Coordinate(539, 529);
        if(deviceCodename.equals("enchilda")) return new Coordinate(539, 529);
        return null;
    }

    public static Coordinate swipeb() {
        if(deviceCodename.equals("z3")) return new Coordinate(1051, 535);
        if(deviceCodename.equals("enchilda")) return new Coordinate(1051, 535);
        return null;
    }

    public static Coordinate supportChecker() {
        if(deviceCodename.equals("z3")) return new Coordinate(910, 831);
        if(deviceCodename.equals("enchilda")) return new Coordinate(910, 831);
        return null;
    }

    public static Coordinate supportTargetLocation() {
        if(deviceCodename.equals("z3")) return new Coordinate(331, 856);
        if(deviceCodename.equals("enchilda")) return new Coordinate(331, 856);
        return null;
    }

    public static Coordinate sidebar() {
        if(deviceCodename.equals("z3")) return new Coordinate(1900, 560);
        if(deviceCodename.equals("enchilda")) return new Coordinate(2093, 540);
        return null;
    }

    public static Coordinate tab() {
        if(deviceCodename.equals("z3")) return new Coordinate(1167, 148);
        if(deviceCodename.equals("enchilda")) return new Coordinate(1409, 140);
        return null;
    }

}
