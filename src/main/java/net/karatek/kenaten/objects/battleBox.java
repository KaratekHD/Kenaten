package net.karatek.kenaten.objects;

import net.karatek.kenaten.utils.adb;
import net.karatek.kenaten.utils.image;

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
