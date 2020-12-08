package Practice;

public class PrivatePacticeTest {
    public static void main(String[] args){
        PrivateElementPractice p = new PrivateElementPractice();
//        System.out.println(p.name); //Can not name element as it is private
        System.out.println(p.getPin()); //Can access pin element by using only getter method. Otherwise we cant use that.
//        System.out.println(p.pin);  //Can not access pin w/o getter method as it is a private element.
    }
}
