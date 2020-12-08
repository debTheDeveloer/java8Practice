package Predicate.IsEqualMethod;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class UseEmployee {
    public static void main(String[] args){
        List<Employee> eList = new ArrayList();
        populateEmployee(eList);
        Predicate<Employee> isArka=Predicate.isEqual(new Employee("Arka","Kolkata",100000,
                "Senior Software Engineer"));
        System.out.println("Chceking implementation of isEqual method");
        System.out.println(isArka.test(eList.get(0)));//true  //WE NEED TO OVERRIDE EQUAL METHOD FOR THIS IMPLEMENTATION
        System.out.println(isArka.test(eList.get(2)));//false
        Employee em = new Employee("Arka1","Kolkata1",100000,
                "Senior Software Engineer1");
        System.out.println(em);
    }

    private static void populateEmployee(List<Employee> eList) {
        eList.add(new Employee("Arka","Kolkata",100000,"Senior Software Engineer"));
        eList.add(new Employee("Debajyoti","Kolkata",120000,"Senior Project Engineer"));
        eList.add(new Employee("Ram","Pune",70000,"Project Engineer"));
        eList.add(new Employee("Shyam","Hyderabad",80000,"Senior Project Expert"));
        System.out.println("Employee list is: ");
        System.out.println(eList);
    }
}
