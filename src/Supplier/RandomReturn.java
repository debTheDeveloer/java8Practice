package Supplier;

import java.util.function.Supplier;

public class RandomReturn {
    public static void main(String[] args){
        Supplier<String> s = ()->{
          String[] name ={"Arka","Debajyoti","Ram","Shyam"};
          int x = (int)(Math.random()*4);
            System.out.println(x);
          return name[x];
        };

        System.out.println(s.get());
        System.out.println(s.get());
        System.out.println(s.get());
        System.out.println(s.get());
        System.out.println(s.get());

    }
}
