package MethodAndConstructorReference.ConstuctorReference;

public class UsingConstructorReference {
    public static void main(String[] args) {
        Interf i = Supply::new;
        i.get();
    }
}
