package example.types;

import example.SmartDevice;

public class SmartWatch extends SmartDevice {

    boolean accelerometer;
    boolean gyroscope;
    boolean heartRateMonitor;

    public SmartWatch() {
    }

    public SmartWatch(String brand, String model, String capacity, boolean gps, boolean speaker, boolean microphone, boolean externalMemoryCardSlot, boolean accelerometer, boolean gyroscope, boolean heartRateMonitor) {
        super(brand, model, capacity, gps, speaker, microphone, externalMemoryCardSlot);
        this.accelerometer = accelerometer;
        this.gyroscope = gyroscope;
        this.heartRateMonitor = heartRateMonitor;
    }
}
