package TwoArgumentFunctionalInterface.CreateStudentObject;

import java.util.ArrayList;
import java.util.function.BiFunction;

public class CreateStudentObjectBySuingBiFunction {
    public static void main(String[] args){
        BiFunction<String,Integer,Student> bf =Student::new;
        ArrayList<Student> stList = new ArrayList();
        stList.add(bf.apply("Arka",21));
        stList.add(bf.apply("Debajyoti",41));
        stList.add(bf.apply("Debayan",40));
        stList.add(bf.apply("Bhuin",47));

        System.out.println("Employee details is shown below: ");
        System.out.println(stList);
    }
}
