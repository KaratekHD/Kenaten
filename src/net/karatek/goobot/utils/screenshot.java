package net.karatek.goobot.utils;

import static net.karatek.goobot.utils.adb.runShellCommand;
import static net.karatek.goobot.utils.linux.runLinuxCommand;

public class screenshot {

    public static void shot() {
        runShellCommand("screencap -p /storage/emulated/0/screen.png");
        runLinuxCommand("/home/jens/Executables/platform-tools/adb pull /storage/emulated/0/screen.png");
        runShellCommand("rm /storage/emulated/0/screen.png");
    }
}
