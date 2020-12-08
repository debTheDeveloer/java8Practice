package defaultAndStaticMethods;

public class OverRidingDefaultMethod implements InterfForDefaultAndStaticMethod {
    @Override
    public void m1() {
        System.out.println("OverRiding m1 method");
    }

    public static void main(String[] args){
        OverRidingDefaultMethod ov = new OverRidingDefaultMethod();
        ov.m1();
    }
}
