package MethodAndConstructorReference;

public class TestMethodReferecne {

    public static int m2(){
        System.out.println("First Method reference implementation");
        return 0;
    }

    public static void main(String[] args){
        InterfaceMethodReference i = TestMethodReferecne::m2;
        i.m1();
        TestMethodReferecne.m2();
    }
}
