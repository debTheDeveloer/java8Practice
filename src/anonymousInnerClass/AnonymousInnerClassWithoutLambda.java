package anonymousInnerClass;

public class AnonymousInnerClassWithoutLambda {
    int x = 899;
    public void m2(){
        int m2Variable = 20;
        Interf i = new Interf() {
            int x=999;
            public void m1() {
                System.out.println(this.x);
            }
        };
        i.m1();
    }
    public static void main(String[] args){
        AnonymousInnerClassWithoutLambda an = new AnonymousInnerClassWithoutLambda();
        an.m2();
    }
}
