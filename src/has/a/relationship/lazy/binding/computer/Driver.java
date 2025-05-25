package has.a.relationship.lazy.binding.computer;

public class Driver {
    public static void main(String[] args) {

        // Creating a LazyComputer object — components are not initialized yet
        LazyComputer lazyComputer = new LazyComputer();

        // Components are initialized only when startComputer is called (lazy binding)
        lazyComputer.startComputer();
    }
}
