package net.karatek.kenaten.utils;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class adb {

    // This function is gonna run a shell command in androids bash.
    public static String runShellCommand(String cmd) {

        try {
            // This is not supposed to stay like it is. It is just stupid and I am to lazy to add this stuff to my $PATH.
            // Same as in net.karatek.kenaten.utils.linux, am not gonna explain it again here cuz i'm lazy.
            Process p = Runtime.getRuntime().exec("/home/jens/Executables/platform-tools/adb shell " + cmd);

            p.waitFor();
            BufferedReader buf = new BufferedReader(new InputStreamReader(
                    p.getInputStream()));
            String line = "";
            String output = "";

            while ((line = buf.readLine()) != null) {
                output += line + "\n";
            }

            return output;
        } catch (Exception ignored) {
            ignored.printStackTrace();
        }
        return "";
    }

    // Tap any point on the phones screen
    public static void tap(int x, int y) {
        runShellCommand("input tap " + x + " " + y);
    }
}
