package MethodAndConstructorReference.ConstuctorReference;

public class UsingLambdaExpression {
    public static void main(String[] args){
        Interf i = ()-> {
            Supply s = new Supply();
            return  s;
        };
        i.get();
    }
}
