package net.karatek.kenaten.startup;

import net.karatek.kenaten.data;
import net.karatek.kenaten.utils.adb;

import static net.karatek.kenaten.device.Device.deviceList;

public class preWork {
    public static void checkCorrectApp() {
        // I hope this is self explaining.
        if(!adb.runShellCommand("dumpsys activity activities | grep ResumedActivity").contains("com.aegisinteractive.goo")) {
            data.correctApp = false;
        } else {
            data.correctApp = true;
        }
    }

    // call this inside your main, this will load up devices.
    public static void initializeDevices() {
        deviceList.add("xperiaz3");
        deviceList.add("oneplus6");
    }
}
