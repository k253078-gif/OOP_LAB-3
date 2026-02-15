package OOP_LAB_3;

public class Computer {
    String systemID;
    String processorType;
    int ramSize;
    String operatingSystem;

    // Default constructor
    Computer(){

    }
    // Parameterized Constructor
    Computer(String id, String processor, int ram, String os) {
        this.systemID = id;
        this.processorType = processor;
        this.ramSize = ram;
        this.operatingSystem = os;
    }

    // Display details
    void displayInfo() {
        System.out.println("System ID: " + systemID);
        System.out.println("Processor: " + processorType);
        System.out.println("RAM: " + ramSize + " GB");
        System.out.println("Operating System: " + operatingSystem);
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {
        Computer c1 = new Computer("SYS01", "Intel Core i7", 16, "Windows 11");
        Computer c2 = new Computer("SYS02", "AMD Ryzen 5", 8, "Ubuntu Linux");

        c1.displayInfo();
        c2.displayInfo();
    }
}