package has.a.relationship.computer.example;

/**
 * Component class representing the CPU
 */

public class CPU {
    void startCPU() {
        System.out.println("Starting up CPU");
    }

    void startProcess() {
        startCPU(); // Reuse method inside class
        System.out.println("CPU started");
    }
}
