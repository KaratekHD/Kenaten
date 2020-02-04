package net.karatek.kenaten.utils;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class linux {

    public static String runLinuxCommand(String cmd) {

        try {
            Process p = Runtime.getRuntime().exec(cmd);

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
}
