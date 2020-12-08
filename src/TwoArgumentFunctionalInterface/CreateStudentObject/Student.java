package TwoArgumentFunctionalInterface.CreateStudentObject;

public class Student {
    String name;
    int roll;

    public Student(String name, int roll){
        this.name=name;
        this.roll=roll;
    }

    public String toString(){
        String s = String.format("(%s,%d)",name,roll);
        return s;
    }
}
