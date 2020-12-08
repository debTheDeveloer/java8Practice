package Predicate.UserPredicate;

import java.util.Scanner;
import java.util.function.Predicate;

public class ValidateUser {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Name");
        String namefromKeyboard=sc.next();
        System.out.println("Enter password");
        String pwd= sc.next();
        User us = new User(namefromKeyboard,pwd);

        Predicate<User> p = user -> user.getName().equals("Arka") && user.getPassword().equals("1234");
        if(p.test(us))
            System.out.println("Successful attempt!!!");
        else
            System.out.println("Try again!!!!");
    }
}
