package defaultAndStaticMethods;

public interface Right {
    default void m1(){
        System.out.println("Right Interface Method");
    }
}
