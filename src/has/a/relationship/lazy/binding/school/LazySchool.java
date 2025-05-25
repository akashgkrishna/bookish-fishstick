package has.a.relationship.lazy.binding.school;

import has.a.relationship.early.binding.school.Classroom;
import has.a.relationship.early.binding.school.Student;

public class LazySchool {
    Classroom classroom; // Declared but not immediately initialized
    Student student; // Lazy binding for Student

    // startClass lazily initializes the components only when needed
    void startClass() {
        if (classroom == null) {
            classroom = new Classroom(); // Lazy initialization
        }

        if (student == null) {
            student = new Student(); // Lazy initialization
        }

        classroom.enterClass();
        student.learn();
        classroom.leaveClass();
    }
}
