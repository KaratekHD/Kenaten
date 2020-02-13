package net.karatek.kenaten.utils;

import net.karatek.kenaten.Main;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class linux {

    // This will run a linux shell command
    public static String runLinuxCommand(String cmd) {

        try {
            // Create process
            Process p = Runtime.getRuntime().exec(cmd);

            p.waitFor();
            // Get output
            BufferedReader buf = new BufferedReader(new InputStreamReader(
                    p.getInputStream()));
            String line = "";
            String output = "";

            while ((line = buf.readLine()) != null) {
                output += line + "\n";
            }

            // return output
            return output;
        } catch (Exception e) {
            Main.logger.error(e.getStackTrace());
        }

        // return empty string if no output provided
        return "";
    }
}
