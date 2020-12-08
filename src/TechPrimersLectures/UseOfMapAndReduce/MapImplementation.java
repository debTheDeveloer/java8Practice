package TechPrimersLectures.UseOfMapAndReduce;

import java.util.Arrays;
import java.util.List;

public class MapImplementation {
    public static void main(String[] args){
        List<String> name = Arrays.asList("Arka","Debajyoti","Rahul","Sai","Gandhi");
        List<Integer> numList = Arrays.asList(1,2,3,4,5,6);
        int sum = name.stream().filter(MapImplementation::isNotRahul).map(User::new).mapToInt
                (user -> user.getAge()).sum();
        System.out.println("Calcultating sum using java 8 Stram API is: "+sum);
        System.out.println("Printing Filtret student details are: ");
        name.stream().filter(MapImplementation::isNotRahul).
                map(User::new).forEach(user -> System.out.println(user));



        System.out.println("-----------------------------------------------------");
        System.out.println(numList.stream().mapToInt(integer -> integer).sum());
        System.out.println("MULTIPLYING USING REDUCE METHOD");
        System.out.println(  numList.stream().reduce(1,(c,e)->c*e));

        System.out.println("--------------------------------------------");
        System.out.println("Sum of all the numbers which are divisible by 2");
        System.out.println(numList.stream().filter(i->i%2==0).mapToInt(integer -> integer).sum());
        System.out.println("Doing the same using reduce method");
        System.out.println(numList.stream().filter(i->i%2==0).reduce(0,(c,e)->c+e));


    }
    private static boolean isNotRahul(String s){
        return !s.equals("Rahul");
    }
}
