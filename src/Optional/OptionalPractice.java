package Optional;

import java.util.Optional;

public class OptionalPractice {
    public static void main(String args[]){
        Optional<String> optionalString = Optional.empty(); //Creating an empty optional of Strng type.
        System.out.println(optionalString);

        String book = "java";
        optionalString = Optional.ofNullable(book);
        if(optionalString.isPresent()){
            System.out.println(optionalString.get().toUpperCase());
        }
        //Other way to write it
        optionalString.ifPresent(s -> System.out.println(s.toUpperCase()));

        /*//Using Optional.of
        book=null;
        optionalString = Optional.of(book); //Getting NullPointer due to this line.
        if(optionalString.isPresent()){
            System.out.println(optionalString.get().toUpperCase());
        }*/

        //Using Optional.ofNullable and orElse and orElseGet and orElseThrow
        book="JavaTpoint";
//        book=null;
        optionalString = Optional.ofNullable(book);
        System.out.println("------------------------");
        System.out.println(optionalString.orElse(backUp())); //For orElse and not null optional scenario, sysout of backup method also gets executed.
        System.out.println("------------------------");
        System.out.println(optionalString.orElseGet(()->backUp())); //Here orElseGet not invoking the backup() method
        System.out.println(optionalString.orElseThrow(IllegalArgumentException::new));

    }

    private static String backUp(){
        System.out.println("Inside void method");
        return "Returning from backup method";
    }
}
