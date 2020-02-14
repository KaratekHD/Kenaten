package net.karatek.kenaten.utils;

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

import static net.karatek.kenaten.utils.adb.runShellCommand;
import static net.karatek.kenaten.utils.linux.runLinuxCommand;

public class screenshot {

    public static void shot() {
        runShellCommand("screencap -p /storage/emulated/0/screen.png");
        runLinuxCommand("/home/jens/Executables/platform-tools/adb pull /storage/emulated/0/screen.png");
        runShellCommand("rm /storage/emulated/0/screen.png");
    }
}
