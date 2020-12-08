package defaultAndStaticMethods;

public interface Left {
    default void m1(){
        System.out.println("Left Interface Method");
    }
}
