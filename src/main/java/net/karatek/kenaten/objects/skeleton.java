package net.karatek.kenaten.objects;

import net.karatek.kenaten.utils.adb;
import net.karatek.kenaten.utils.image;

public class skeleton {

    // This is basically just a class for making pressing buttons and getting colors easy.

    public static int x = 108;
    public static int y = 432;

    public static void click() {
        adb.tap(x, y);
    }

    public static String getColor() {
        return image.getPixel(x, y);
    }

}
