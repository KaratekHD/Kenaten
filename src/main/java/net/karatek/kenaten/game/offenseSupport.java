package net.karatek.kenaten.game;

import net.karatek.kenaten.objects.quitButton;
import net.karatek.kenaten.objects.skeleton;
import net.karatek.kenaten.utils.adb;
import net.karatek.kenaten.utils.image;
import net.karatek.kenaten.utils.screenshot;

import java.util.concurrent.TimeUnit;

public class offenseSupport {

    public static void support() {
        // TO-DO
        // check whether is loaded and catch bird
        // Down there: Read out from device file
        while (!image.getPixel(1096, 1029).equals("99194140")) {
            System.out.println("[DEBUG] Loading...");
        }
        System.out.println("Loaded.");

        // Swipe to the upper left corner
        adb.runShellCommand("input swipe 539 529 1051 535");

        // Place object
        skeleton.click();

        while (!(image.getPixel(910, 831).equals(107162156))) {
            screenshot.shot();
            // Maybe improve these coordinates?
            adb.tap(331, 856);
            try {
                // Maybe I should just check when I am able to place again?
                TimeUnit.SECONDS.sleep(15);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // Exit
        quitButton.click();
    }
}
