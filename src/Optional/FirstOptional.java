package Optional;

import Streams.UseOfFilterAndMapAndCount;

import java.util.Arrays;
import java.util.List;

public class FirstOptional {
    public static void main(String[] args){
        List<Integer> intList = Arrays.asList(2,3,4,5,6);
        System.out.println("Printing the sum of those int which are divisible by 2");
        System.out.println("Sum is: ");
        System.out.println(intList.stream().filter(i->i%2==0).mapToInt(integer -> integer).sum());
        System.out.println("Printing the first element which is divisible by 6");
        System.out.println(intList.stream().filter(i->i%6==0).findFirst().orElse(0)); //With orElse -->Ans 6
        System.out.println(intList.stream().filter(i->i%6==0).findFirst()); //Without orElse  --> Ans --> Optional.
        System.out.println(intList.stream().filter(i->i%2==0).reduce(0,Integer::sum));
        //Using orElseGet
        System.out.println(intList.stream().filter(i->i%17==0).findFirst().orElseGet(FirstOptional::executeOrelseGet));
    }
    private static int executeOrelseGet(){
        return 0;
    }
}
