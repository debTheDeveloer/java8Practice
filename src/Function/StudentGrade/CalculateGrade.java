package Function.StudentGrade;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class CalculateGrade {
    public static void main(String[] args){
        List<Student> stList = new ArrayList();
        populateStudent(stList);

        Function<Student,String> f = st ->{if(st.getMarks()>=80)
            return "First Class";
        else if(st.getMarks()>=60)
            return "Second Class";
        else if(st.getMarks()>=40)
            return "Third Class";
        else
            return "Fail";
        };

        for (Student student: stList) {
            System.out.println("Name of the studnet: "+student.getNaame());
            System.out.println("Marks of the student: "+student.getMarks());
            System.out.println("Grade of the student: "+f.apply(student));
        }

        Predicate<Student> p = st -> st.getMarks()>=60;
        System.out.println("-------------------------------");
        System.out.println("Studen details who scored more than 60 marks");
        System.out.println("-------------------------------");
        for (Student student: stList) {
            if(p.test(student)) {
                System.out.println("Name of the studnet: " + student.getNaame());
                System.out.println("Marks of the student: " + student.getMarks());
                System.out.println("Grade of the student: " + f.apply(student));
            }
        }
    }

    private static void populateStudent(List<Student> stList) {
        stList.add(new Student("Arka",60));
        stList.add(new Student("Debajyoti",90));
        stList.add(new Student("Ram",40));
    }
}
