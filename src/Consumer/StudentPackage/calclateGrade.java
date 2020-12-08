package Consumer.StudentPackage;


import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class calclateGrade {
    public static void main(String[] args){
        ArrayList<Student> stList = new ArrayList();
        poulateStudent(stList);
        Predicate<Student> p = st->st.marks>=60;
        Function<Student,String> f = st->{if(st.marks>=80)
            return "First Class";
        else if(st.marks>=70)
            return "Second Class";
        else if(st.marks>=50)
            return "Third Class";
        else
            return "Fail";

        };
        Consumer<Student> c = st->{
            System.out.println("Name of the Student: "+st.name);
            System.out.println("Score obtained by the studebt: "+st.marks);
            System.out.println("Grade of the stident is: "+f.apply(st));
        };
        ArrayList<Student> stListNew = new ArrayList();
        System.out.println("Details of the student who scores more than 60 are shownn below: ");
        for (Student st: stList) {
            if(p.test(st)) {
                stListNew.add(st);
                c.accept(st);
                System.out.println("-----------------------------");
            }
        }
        Collections.sort(stListNew,(Student st1,Student st2)->st1.marks<st2.marks?-1:((st1.marks>st2.marks)?1:0));
        System.out.println("After Sorting the result is: ");
        for (Student st:stListNew) {
            c.accept(st);
        }
    }

    private static void poulateStudent(ArrayList<Student> stList) {
        stList.add(new Student(69,"Subho"));
        stList.add(new Student(22,"Ram"));
        stList.add(new Student(92,"Debajyoti"));
        stList.add(new Student(52,"Shyam"));
        stList.add(new Student(62,"Arka"));
    }
}
