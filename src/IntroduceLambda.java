import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;

public class IntroduceLambda {
    public  static void main(String[] args){
//        FunctionalInterfacePractice f1 = ()-> System.out.println("First Java 8 programme");
//        FunctionalInterfacePractice f2 = (s)-> System.out.println(s.length());
        FunctionalInterfacePractice f3 = (a,b)-> System.out.println(a+b);
//        f1.m1();
//        f2.m1("Hi");
        f3.m1(2,3);

    }}
