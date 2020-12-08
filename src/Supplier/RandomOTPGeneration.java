package Supplier;

import java.util.Date;
import java.util.function.Supplier;

public class RandomOTPGeneration {
    public static void main(String[] args){
        String otp ="";
        Supplier<Integer> s = ()->{
          int num = (int)(Math.random()*10);
          return num;
        };
        for(int i=0;i<6;i++){
            otp=otp+s.get();
        }
        System.out.println("OTP is: "+otp);
        System.out.println("Another OTP: "+randomAlphaNumeric(5));
    }

    private static final String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    public static String randomAlphaNumeric(int count) {
        StringBuilder builder = new StringBuilder();
        while (count-- != 0) {
            int character = (int)(Math.random()*ALPHA_NUMERIC_STRING.length());
            builder.append(ALPHA_NUMERIC_STRING.charAt(character));
        }
        return builder.toString();
    }
}
