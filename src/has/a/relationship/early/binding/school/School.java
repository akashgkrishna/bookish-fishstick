package has.a.relationship.early.binding.school;

public class School {
    Classroom classroom;
    Student student;

    // Constructor performs early binding — objects are created immediately
    public School() {
        this.classroom = new Classroom();
        this.student = new Student();
    }

    // Methods are called on concrete types — no polymorphism involved
    void startClass() {
        classroom.enterClass();
        student.learn();
        classroom.leaveClass();
    }
}
