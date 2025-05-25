package has.a.relationship.early.binding.computer;

import has.a.relationship.computer.example.Computer;

public class Driver {
    public static void main(String[] args) {
        /* Creating a Computer object —
           this triggers composition (CPU and Memory are created inside Computer) */
        Computer computer = new Computer();

        /* Calling a method that uses the composed objects
           All method calls are resolved at compile time — this is an example of early binding */
        computer.startComputer(); // Start the computer using its components
    }
}
