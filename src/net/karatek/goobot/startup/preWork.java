package net.karatek.goobot.startup;

import net.karatek.goobot.data;
import net.karatek.goobot.utils.adb;

public class preWork {
    public static void checkCorrectApp() {
        if(!adb.runShellCommand("dumpsys activity activities | grep ResumedActivity").contains("com.aegisinteractive.goo")) {
            data.correctApp = false;
        } else {
            data.correctApp = true;
        }
    }
}
