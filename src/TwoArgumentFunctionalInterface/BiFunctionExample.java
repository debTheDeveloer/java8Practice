package TwoArgumentFunctionalInterface;

import java.util.function.BiFunction;

public class BiFunctionExample {
    public static void main(String[] args){
       BiFunction<Integer,Integer,Integer> bf = (i1, i2)-> i1*i2;
        System.out.println("Product of 2 given integer is: "+bf.apply(10,20));
    }
}
