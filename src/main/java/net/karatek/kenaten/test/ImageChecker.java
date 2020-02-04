package net.karatek.kenaten.test;

import net.karatek.kenaten.utils.image;
import net.karatek.kenaten.utils.screenshot;

public class ImageChecker {
    public static void main(String[] args) {
        while (true) {
            screenshot.shot();
            System.out.println(image.getPixel(1096, 1029));
        }
    }
}
