package net.karatek.goobot.game;

import net.karatek.goobot.objects.quitButton;
import net.karatek.goobot.objects.skelleton;
import net.karatek.goobot.utils.adb;
import net.karatek.goobot.utils.image;

import java.util.concurrent.TimeUnit;

public class offenseSupport {

    public static void support() {
        //TO-DO
        //check whether is loaded and catch bird
        adb.runShellCommand("input swipe 539 529 1051 535");
        skelleton.click();
        //Place object
        while (!(image.getPixel(910, 831).equals(107162156))) {
            //Maybe improve these coordinates?
            adb.tap(331, 856);
            try {
                //Maybe I should just check when I am able to place again?
                TimeUnit.SECONDS.sleep(15);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        quitButton.click();

    }
}
