package defaultAndStaticMethods;


//As we are implementing 2 interfaces which are containing same signature default method. So this class will face
//ambiguity problem. To avoid this problem we have to override the method.
public class TestLeftRight implements Left,Right {
    @Override
    public void m1() {
        System.out.println("My own Implementation"); //We can implement our own requirement
        Left.super.m1();//Or we can use the super methd by this
        Right.super.m1();
    }

    public static void main(String[] args){
        TestLeftRight t = new TestLeftRight();
        t.m1();
    }
}
