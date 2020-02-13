package net.karatek.kenaten.utils;

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

import net.karatek.kenaten.Main;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

public class image {
    public static String getPixel(int x, int y){
        try {
            // get screenshot
            File file = new File("screen.png");
            BufferedImage image = ImageIO.read(file);

            // Getting pixel color by position x and y
            int clr = image.getRGB(x,y);
            int red = (clr & 0x00ff0000) >> 16;
            int green = (clr & 0x0000ff00) >> 8;
            int blue =  clr & 0x000000ff;
            return "" + red + green + blue;

        } catch (Exception e) {
            Main.logger.error(e.getStackTrace().toString());
            return "";
        }

    }
}
