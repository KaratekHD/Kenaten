package net.karatek.goobot.objects;

import net.karatek.goobot.utils.adb;
import net.karatek.goobot.utils.image;

public class skelleton {

    public static int x = 108;
    public static int y = 432;

    public static void click() {
        adb.tap(x, y);
    }

    public static String getColor() {
        return image.getPixel(x, y);
    }
}
