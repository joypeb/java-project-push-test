package Java_221005.collection;

import java.util.List;

public class ListPracticeMain {
    public static void main(String[] args) {
        LikeLion2th likeLion2th = new LikeLion2th();
        List<String> students = likeLion2th.getStudentList();
        List<Student> studentObj = likeLion2th.getStudentObjList();

        for(String stu : students) {
            System.out.println(stu);
        }

        for(Student stuObj : studentObj) {
            System.out.println(stuObj.getClassNo() + " " + stuObj.getName() + " " + stuObj.getGitRepositoryAddress());
        }
    }
}
