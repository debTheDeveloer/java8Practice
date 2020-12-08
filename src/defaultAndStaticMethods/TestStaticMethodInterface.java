package defaultAndStaticMethods;

public class TestStaticMethodInterface implements StaticMethodInterface {
    public static void m1(){
        System.out.println("It is not OverRided startic method"); //This is not overRiding of inerface m1 method. Even though it is having
                                                        // same signature it is not overRiding as static method insde interface
                                                        // is not availabale inside implemented class.
    }

    public static void main(String[] args){
        TestStaticMethodInterface.m1(); //If we comment the overrided method we can't call the m1 method like this.
                                        //Because static method insde interface is not availabale inside implemented class.
        StaticMethodInterface.m1();
    }
}
