package net.karatek.kenaten.test;

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

import net.karatek.kenaten.utils.image;
import net.karatek.kenaten.utils.screenshot;

public class ImageChecker {
    public static void main(String[] args) {
        while (true) {
            // This actually creates a screenshot for testing purposes, e.g. getting a pixel's color.
            screenshot.shot();
            System.out.println(image.getPixel(1096, 1029));
        }
    }
}
