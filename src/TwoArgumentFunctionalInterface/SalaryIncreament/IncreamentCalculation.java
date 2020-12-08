package TwoArgumentFunctionalInterface.SalaryIncreament;

import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class IncreamentCalculation {
    public static void main(String[] args){
        ArrayList<Employee> empList = new ArrayList();
        BiFunction<String,Float,Employee> f = (name, salary)->new Employee(name,salary);
        populateEmployee(empList, f);
        BiConsumer<Employee,Float> bc = (employee,increament)->employee.salary=employee.salary+increament;
        System.out.println("Employee details before incremanet");
        System.out.println(empList);
        for (Employee emp: empList) {
            bc.accept(emp,4000f);
        }
        System.out.println("Employee details after increament: ");
        System.out.println(empList);


    }

    private static void populateEmployee(ArrayList<Employee> empList, BiFunction<String, Float, Employee> f) {
        empList.add(f.apply("Arka", (float) 70000));
        empList.add(f.apply("Debajyoti", (float) 80000));
        empList.add(f.apply("Ram", (float) 50000));
    }
}
