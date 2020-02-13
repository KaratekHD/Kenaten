package net.karatek.kenaten.utils;

import net.karatek.kenaten.device.Device;
import net.karatek.kenaten.exceptions.DeviceNameNotFoundException;

public class DeviceClass {

    public static void setDevice(String name) throws DeviceNameNotFoundException {
        if(!Device.deviceList.contains(name)) {
            throw new DeviceNameNotFoundException(name);
        } else {
            // TO-DO
        }
    }

}
