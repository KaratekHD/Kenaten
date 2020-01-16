package net.karatek.goobot.old;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

public class Test1 {

    public static void main(String[] args) {
        while (true) {
            runShellCommand("screencap -p /storage/emulated/0/screen.png");
            runLinuxCommand("/home/jens/Executables/platform-tools/adb pull /storage/emulated/0/screen.png");
            runShellCommand("rm /storage/emulated/0/screen.png");
            System.out.println("Pixel color is: " + getPixel(1012, 1017));
        }

    }

     private static void endBattle() {
        tap(1655, 1016);
        System.out.println("Battled ended.");
    }

    private static void tap(int x, int y) {
        runShellCommand("input tap " + x + " " + y);
    }

    private static String runShellCommand(String cmd) {

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

    public static String getPixel(int x, int y){
        try {
            File file= new File("screen.png");
            BufferedImage image = ImageIO.read(file);
            // Getting pixel color by position x and y
            int clr=  image.getRGB(x,y);
            int  red   = (clr & 0x00ff0000) >> 16;
            int  green = (clr & 0x0000ff00) >> 8;
            int  blue  =  clr & 0x000000ff;
            return "" + red + green + blue;
        } catch (Exception e) {
            return "";
        }

    }
    private static String runLinuxCommand(String cmd) {

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
