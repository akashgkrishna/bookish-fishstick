package has.a.relationship.lazy.binding.computer;

import has.a.relationship.computer.example.CPU;
import has.a.relationship.computer.example.Memory;

public class LazyComputer {
    Memory memory; // Declared but not initialized
    CPU cpu; // Declared but not initialized

    // Method to lazily initialize components when needed
    void startComputer() {
        if (memory == null) {
            memory = new Memory(); // Lazy initialization
        }
        if (cpu == null) {
            cpu = new CPU(); // Lazy initialization
        }

        memory.loadMemory();
        cpu.startProcess();
        System.out.println("Computer is on");
    }
}
