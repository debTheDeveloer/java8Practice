package Predicate;

import java.util.function.Predicate;

public class NameStartsWith_K {
    public static void main(String[] args){
        String[] name={"Arka","Debajyoti","Krishna","Kakoli"};
        Predicate<String>p = n->n.charAt(0)=='K';
        System.out.println("Name starts with K are: ");
        for (String s: name) {
            if(p.test(s)){
                System.out.println(s);
                System.out.println("");
            }

            }
        }
    }
