package example.types;

import example.SmartDevice;

public class SmartPhone extends SmartDevice {

    public String ramCapacity;
    public boolean camera;
    public String mpxCam;

    public SmartPhone() {
    }

    public SmartPhone(String brand, String model, String capacity, boolean gps, boolean speaker, boolean microphone, boolean externalMemoryCardSlot, String ramCapacity, boolean camera, String mpxCam) {
        super(brand, model, capacity, gps, speaker, microphone, externalMemoryCardSlot);
        this.ramCapacity = ramCapacity;
        this.camera = camera;
        this.mpxCam = mpxCam;
    }
}
