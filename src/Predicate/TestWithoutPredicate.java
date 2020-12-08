package Predicate;

public class TestWithoutPredicate{
    /*public static void main(String[] args){
        Interf ief = I->{if(I>10)
                        return true;
        else
            return false;
        };
        System.out.println(ief.test(100));
    }*/

    public static void main(String[] args){  //Shorter way to implement lambda expression.
        Interf ief = I->I>10;
        System.out.println(ief.test(50));
    }


   //Using annonymous innre class
   /*public static void main(String[] args){
       Interf i = new Interf() {
           @Override
           public boolean test(Integer i) {
               if(i>10)
               return true;
               else
                   return false;
           }
       };
       System.out.println(i.test(50));
   }*/



}
