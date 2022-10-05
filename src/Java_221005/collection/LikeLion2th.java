package Java_221005.collection;

import java.util.ArrayList;
import java.util.List;

public class LikeLion2th {
    Names names = new Names();
    private List<String> student = new ArrayList<>();
    private List<Student> studentObj = new ArrayList<>();

    public LikeLion2th() {
        this.student = names.names();
        this.studentObj = names.getStudentObj();
    }
    public List<String> getStudentList() {
        return this.student;
    }

    public List<Student> getStudentObjList() {
        return this.studentObj;
    }
}
