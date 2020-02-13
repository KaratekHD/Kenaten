package net.karatek.kenaten.experiments;

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

public class throwException {

    // This just throws an exception to see if the exception works correctly.
    public static void main(String[] args) {
        try {
            drop();
        } catch (DeviceNameNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void drop() throws DeviceNameNotFoundException {
        throw new DeviceNameNotFoundException("Test");
    }
}
