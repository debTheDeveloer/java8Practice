package Supplier;

import java.util.Date;
import java.util.function.Supplier;

public class FirsrSupplier {
    public static void main(String[] args){
        Supplier<Date> s = ()->new Date();
        System.out.println("Today's date is: "+s.get());
    }
}
