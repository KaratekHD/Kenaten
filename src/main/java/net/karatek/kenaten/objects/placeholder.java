package net.karatek.kenaten.objects;

import net.karatek.kenaten.utils.image;

public class placeholder {

    public static int x = 910;
    public static int y = 831;

    public static String getColor() {
        return image.getPixel(x, y);
    }
}
