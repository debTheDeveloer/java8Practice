package Function;

import java.util.function.Function;

public class FindNumberOfSpaces {
    private static final String stringName ="MY NAME IS DEBAJYOTI GHATAK.";
    public static void main(String[] args){
        Function<String,Integer>f = s -> s.length()-s.replaceAll(" ","").length();
        System.out.println("Number of spaces availble in the string is: "+f.apply(stringName));

    }
}
