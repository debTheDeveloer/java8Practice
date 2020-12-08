package MethodAndConstructorReference;


public class TestNonStaticMethod {
    public int m2()
    {
        System.out.println("Using non static method in method reference and different return type");
        return 10;
    }

    public  void m3(){
        System.out.println("Using non static method in method reference and same retrn type");
    }
    public static void main(String[] args){
        TestNonStaticMethod t = new TestNonStaticMethod();
        InterfaceMethodReference i = t::m2;
        i.m1();
    }
}
