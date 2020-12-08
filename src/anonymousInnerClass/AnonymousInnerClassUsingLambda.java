package anonymousInnerClass;

public class AnonymousInnerClassUsingLambda {
    int x =899;
    public void m2(){
        Interf i = ()->{
            int x= 999;
            System.out.println(this.x); //899
            System.out.println(x); //999
        };
        i.m1();
        System.out.println("Last line m2 method");
    }
    public static void main(String[] args){
        AnonymousInnerClassUsingLambda an = new AnonymousInnerClassUsingLambda(); //899
        an.m2();
    }
}
