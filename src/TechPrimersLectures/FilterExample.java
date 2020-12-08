package TechPrimersLectures;
/*

This is a programme to print the names which are != shyam
 */
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FilterExample {
    public static void main(String[] args){
        List<String> nameList = Arrays.asList("Arka","Debajyoti","Ram","Shyam");

        //CONVENATIOANL WAY
        System.out.println("JAVA 1.7 PROCESS");
        for (String s: nameList) {
            if(!s.equals("Shyam"))
                System.out.println(s);
        }

        //USING ONLY FILTER OF JAVA 1.8
        System.out.println("------------------------------------");
        System.out.println("Java 1.8 verision by using Function");
        List<String> funtionList = nameList.stream().filter(s->!s.equals("Shyam")).collect(Collectors.toList());
        for (String s :funtionList) {
            System.out.println(s);
        }
        System.out.println("Another way to concise the code");
        nameList.stream().filter(s->!s.equals("Shyam")).forEach(s-> System.out.println(s));

        //USING FOREACH AND FUNCTION BOTH
        System.out.println("------------------------------------");
        //USING STREAM,FILTER,METHOD REF, FOREACH
        System.out.println("Using Stream,Method Reference and forEach");
        nameList.stream().filter(FilterExample::isNotShyam).forEach(System.out::println);
    }

    static boolean isNotShyam(String s){
        return !s.equals("Shyam");
    }
}
