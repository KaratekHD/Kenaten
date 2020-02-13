package net.karatek.kenaten.experiments;

import net.karatek.kenaten.exceptions.DeviceNameNotFoundException;

public class throwException {

    // This just throws an exception to see if the exception works correctly.
    public static void main(String[] args) {
        try {
            drop();
        } catch (DeviceNameNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void drop() throws DeviceNameNotFoundException {
        throw new DeviceNameNotFoundException("Test");
    }
}
