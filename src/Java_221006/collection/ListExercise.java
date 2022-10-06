package Java_221006.collection;

import java.util.ArrayList;
import java.util.List;

public class ListExercise {
    private List<String> students;

    public ListExercise() {
        this.students = new ArrayList<>();
        this.students.add("박은빈");
        this.students.add("박은빈2");
        this.students.add("박은빈3");
    }

    public List<String> getStudents() {
        return this.students;
    }
}
