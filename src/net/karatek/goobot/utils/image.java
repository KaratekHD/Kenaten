package net.karatek.goobot.utils;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

public class image {
    public static String getPixel(int x, int y){
        try {
            File file= new File("screen.png");
            BufferedImage image = ImageIO.read(file);
            // Getting pixel color by position x and y
            int clr=  image.getRGB(x,y);
            int  red   = (clr & 0x00ff0000) >> 16;
            int  green = (clr & 0x0000ff00) >> 8;
            int  blue  =  clr & 0x000000ff;
            return "" + red + green + blue;

        } catch (Exception e) {
            return "";
        }

    }
}
