package Java_221005.collection;

public class Student {
    private int classNo;
    private String name;
    private String gitRepositoryAddress;

    public Student(int classNo, String name, String gitRepositoryAddress) {
        this.classNo = classNo;
        this.name = name;
        this.gitRepositoryAddress = gitRepositoryAddress;
    }

    public int getClassNo() {
        return classNo;
    }

    public String getName() {
        return name;
    }

    public String getGitRepositoryAddress() {
        return gitRepositoryAddress;
    }
}
