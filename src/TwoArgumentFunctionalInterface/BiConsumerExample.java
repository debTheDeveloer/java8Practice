package TwoArgumentFunctionalInterface;

import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void main(String[] args){
        BiConsumer<String,String> bc = (s1,s2)-> System.out.println(s1.concat(s2));
       bc.accept("Debajyoti ","Ghatak");

    }
}
