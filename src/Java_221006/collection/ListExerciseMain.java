package Java_221006.collection;

import java.util.List;

public class ListExerciseMain {
    public static void main(String[] args) {
        ListExercise listExercise = new ListExercise();
        List<String> students = listExercise.getStudents();

        for(String stu : students) {
            System.out.println(stu);
        }

        System.out.println("총 인원 : " + students.size());
    }
}
