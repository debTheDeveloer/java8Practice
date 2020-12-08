package anonymousInnerClass;

public class AnonymousInnerClassOfRunUsingLambda {
    public static void main(String[] args) {
//        int m=20;
        Runnable r = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Child Method of thread t1");
            }
//            m=40;   //w can not change the value of m as it acts like final variable here.
        };
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(() -> {     //Using more concise code
            for (int i = 0; i < 10; i++) {
                System.out.println("Child Method of thread t2");
            }
        });
        t1.run();
        t2.run();
        for(int i=0;i<10;i++){
            System.out.println("Parent Method");
        }
    }
}

