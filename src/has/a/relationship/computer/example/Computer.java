package has.a.relationship.computer.example;

/**
 * Container class - uses composition to include CPU and Memory
 */

public class Computer {
    Memory memory; // "has-a" relationship: Computer has Memory
    CPU cpu; // "has-a" relationship: Computer has CPU

    // Constructor - creates instances of Memory and CPU (Composition)
    public Computer() {
        this.memory = new Memory();
        this.cpu = new CPU();
    }

    // Method to start the computer using its components
    public void startComputer() {
        memory.loadMemory(); // Delegating to Memory class
        cpu.startProcess(); // Delegating to CPU class
        System.out.println("Computer is on!");
    }
}
