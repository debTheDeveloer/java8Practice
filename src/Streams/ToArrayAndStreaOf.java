package Streams;

import java.util.stream.Stream;

public class ToArrayAndStreaOf {
    public static void main(String[] args){
        Integer[] intArray = new Integer[]{1,2,3,4,5};
        //Making an array of stream
        Stream<Integer> st = Stream.of(intArray);
        System.out.println("Calculating min value");
        System.out.println(st.min((i1,i2)->i1.compareTo(i2)).get());

        //Convering this stream to array

//        Integer[] intArray2 = s.toArray(Integer[]::new); //We can't use same stream instance twice. WE will get error for the same.
                                                            //We have to use new instance of Stream.
        /*for (int i:intArray2) {
            System.out.println(i);
        }*/

        Stream<Integer> st2 = Stream.of(intArray); //Here we have created new instace of Stream.
        Integer[] intArray3 = st2.toArray(Integer[]::new);
        System.out.println("Printing the array which is converted from collection");
        for (int i:intArray3) {
            System.out.println(i);
        }
    }
}
