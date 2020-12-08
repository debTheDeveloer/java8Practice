package MethodAndConstructorReference.BiPredicateAndMethodReference;

import java.util.function.BiFunction;

public class BiFunctionAndMethodRef {
    public int m2(int a, int b){
        return a+b;
    }
    public static void main(String[] args){
        BiFunctionAndMethodRef bpmr = new BiFunctionAndMethodRef();
        BiFunction<Integer,Integer,Integer> bp = bpmr::m2;
        System.out.println("Applying BiFunction and method Ref "+bp.apply(2,3));
    }
}
