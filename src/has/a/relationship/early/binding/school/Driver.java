package has.a.relationship.early.binding.school;

public class Driver {
    public static void main(String[] args) {
        // Creating a School instance — this triggers composition with Classroom and Student
        School school = new School();

        // All method calls are resolved at compile time (early binding)
        school.startClass();
    }
}
