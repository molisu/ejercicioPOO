package example;

public class SmartDevice {

    public String brand;
    public String model;
    public String capacity;
    public boolean gps;
    public boolean speaker;
    public boolean microphone;
    public boolean externalMemoryCardSlot;

    public SmartDevice() {
    }

    public SmartDevice(String brand, String model, String capacity, boolean gps, boolean speaker, boolean microphone, boolean externalMemoryCardSlot) {
        this.brand = brand;
        this.model = model;
        this.capacity = capacity;
        this.gps = gps;
        this.speaker = speaker;
        this.microphone = microphone;
        this.externalMemoryCardSlot = externalMemoryCardSlot;
    }
}
