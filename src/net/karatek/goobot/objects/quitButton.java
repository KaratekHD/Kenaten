package net.karatek.goobot.objects;

import net.karatek.goobot.utils.adb;
import net.karatek.goobot.utils.image;

public class quitButton {

    public static int x = 1743;
    public static int y = 1018;

    public static void click() {
        adb.tap(x, y);
    }

    public static String getColor() {
        return image.getPixel(x, y);
    }

}
