package net.karatek.kenaten.exceptions;

public class DeviceNameNotFoundException extends Exception {

    // Throw this exception whenever an unsupported device causes problems

    public DeviceNameNotFoundException(String errorMessage) {
        super(errorMessage);
    }

}
