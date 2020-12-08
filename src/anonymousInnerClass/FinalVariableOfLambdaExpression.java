package anonymousInnerClass;

public class FinalVariableOfLambdaExpression {
    int x=10; //Instace Variable
    public  void m2(){
        int y=20; //local variable of m2 method which is used in lamda expression. This kind of variables are final by-default.
        Interf i = ()->{
            int z=80;
            x=50;
//            y=60;  //y is a final variablr by default
            z=90;
            System.out.println("value of x is: "+x); //50
            System.out.println("value of y is: "+y); //20
            System.out.println("value of z is: "+z); //90
        };
        i.m1();
    }

    public static void main(String[] args){
        FinalVariableOfLambdaExpression f = new FinalVariableOfLambdaExpression();
        f.m2();
    }
}
