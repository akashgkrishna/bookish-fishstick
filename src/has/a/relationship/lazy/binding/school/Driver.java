package has.a.relationship.lazy.binding.school;

public class Driver {
    public static void main(String[] args) {
        // Creating LazySchool — no classroom or student yet
        LazySchool lazySchool = new LazySchool();

        // Objects are created only when startClass is called (lazy binding)
        lazySchool.startClass();
    }
}
