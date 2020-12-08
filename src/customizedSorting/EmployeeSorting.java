package customizedSorting;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeSorting {
    public void sortEmployee(ArrayList<Employee> emp){
        Collections.sort(emp,(Employee e1,Employee e2)->(e1.getEmployeeNumber()>e2.getEmployeeNumber()?-1:
        e1.getEmployeeNumber()<e2.getEmployeeNumber()?1:0));

        System.out.println("Descending Order employee: "+emp);
    }

    public static void main(String[] args){
        Employee e1 = new Employee();
        e1.setEmployeeName("Arka");
        e1.setEmployeeNumber(2);

        Employee e2 = new Employee();
        e2.setEmployeeNumber(1);
        e2.setEmployeeName("Debajyoti");

        Employee e3 = new Employee();
        e3.setEmployeeName("Sayan");
        e3.setEmployeeNumber(5);

        ArrayList<Employee> empList = new ArrayList<>();
        empList.add(e1);
        empList.add(e2);
        empList.add(e3);

        EmployeeSorting emp = new EmployeeSorting();
        emp.sortEmployee(empList);
    }
}
