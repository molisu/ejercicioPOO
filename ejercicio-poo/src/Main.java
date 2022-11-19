import example.SmartDevice;
import example.types.SmartPhone;
import example.types.SmartWatch;

public class Main {

    public static void main(String[] args) {

        SmartDevice smartTvSamsung = new SmartDevice("Samsung", "Au7090", "32Gb", false, true, false, false);
        System.out.println("SmartTV");
        System.out.println("Marca: " + smartTvSamsung.brand);
        System.out.println("Modelo: " + smartTvSamsung.model);
        System.out.println("Capacidad: " + smartTvSamsung.capacity);
        System.out.println("Parlantes: " + smartTvSamsung.speaker);

        System.out.println("\n");

        SmartPhone iPhone11 = new SmartPhone("Apple", "iPhone 11", "128Gb", true, true, true, false, "4Gb", true, "12MP");
        System.out.println("Smart Phone");
        System.out.println("Marca: " + iPhone11.brand);
        System.out.println("Modelo: " + iPhone11.model);
        System.out.println("Capacidad: " + iPhone11.capacity);
        System.out.println("Ranura para memoria externa: " + iPhone11.externalMemoryCardSlot);
        System.out.println("Mpx Camara principal: " + iPhone11.mpxCam);

        System.out.println("\n");

        SmartWatch xiaomiKieslect = new SmartWatch("Xiaomi", "Kieslect L11", "2Gb", false, false, false, false, true, true, true);
        System.out.println("Smart Watch");
        System.out.println("Marca: " + xiaomiKieslect.brand);
        System.out.println("Modelo: " + xiaomiKieslect.model);
        System.out.println("GPS: " + xiaomiKieslect.gps);
        System.out.println("Microfono: " + xiaomiKieslect.microphone);

    }
}
