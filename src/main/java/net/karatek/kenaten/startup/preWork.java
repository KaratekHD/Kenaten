package net.karatek.kenaten.startup;

import net.karatek.kenaten.data;
import net.karatek.kenaten.utils.adb;

public class preWork {
    public static void checkCorrectApp() {
        if(!adb.runShellCommand("dumpsys activity activities | grep ResumedActivity").contains("com.aegisinteractive.goo")) {
            data.correctApp = false;
        } else {
            data.correctApp = true;
        }
    }
}
