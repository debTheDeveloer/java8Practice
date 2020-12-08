package Function.StudentGrade;

public class Student {
    private String naame;
    private int marks;

    public Student(String naame, int marks) {
        this.naame = naame;
        this.marks = marks;
    }

    public String getNaame() {
        return naame;
    }

    public int getMarks() {
        return marks;
    }
}
