package Supplier;

/*

Logic is:
1.Length og the password is 8
2. Even places must contain numbers
3.Odd places must contain either upper cases characters or #!@
 */

import java.util.function.Supplier;

public class RandomPassword {
    public static void main(String[] args){
        String pwd ="";
        Supplier<Integer> s1 = ()->{
          int num = (int)(Math.random()*10);
          return num;
        };
        Supplier<Character>s2 = ()->{
            String s ="ABCDEFGHIJKLMNOPQRSTUVWXYZ#@!";
            int index = (int)(Math.random()*29);
            char c = s.charAt(index);
            return c;
        };

        for (int i=1;i<=8;i++){
            if(i%2==0)
                pwd=pwd+s1.get();
            else
                pwd=pwd+s2.get();
        }

        System.out.println("Random password is: "+pwd);
    }
}
