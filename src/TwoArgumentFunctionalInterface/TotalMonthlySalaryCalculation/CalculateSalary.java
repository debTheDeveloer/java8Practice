package TwoArgumentFunctionalInterface.TotalMonthlySalaryCalculation;

import java.util.function.BiFunction;

public class CalculateSalary {
    public static void main(String[] args){
        BiFunction<Employee,TimeSheet,Double> bf = ((employee, timeSheet) -> employee.dailyWage*timeSheet.monthlyAttandence);
        Employee emp = new Employee("Debajyoti","20076590",25000);
        TimeSheet tm = new TimeSheet("20076590",30);

        System.out.println("Total monthly salary o fthe employee is: "+bf.apply(emp,tm));
    }
}
