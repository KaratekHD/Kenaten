package net.karatek.goobot.utils;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class adb {

    public static String runShellCommand(String cmd) {

        try {
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

    public static void tap(int x, int y) {
        runShellCommand("input tap " + x + " " + y);
    }
}
