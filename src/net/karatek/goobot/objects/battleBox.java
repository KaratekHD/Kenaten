package net.karatek.goobot.objects;

import net.karatek.goobot.utils.adb;
import net.karatek.goobot.utils.image;

public class battleBox {

    public static int x = 1365;
    public static int y = 428;

    public static void click() {
        adb.tap(x, y);
    }

    public static String getColor() {
        return image.getPixel(x, y);
    }
}
