import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSorting {
    public  static void  main(String[] args) {
        ArrayList<Integer> al = new ArrayList();
        al.add(10);
        al.add((0));
        al.add(15);
        al.add(5);
        al.add(20);
        al.add(7);
        ArrayList<Integer> al2=al;
        System.out.println(al2);
        Collections.sort(al2,(i1,i2)->(i1>i2)?-1:(i1<i2)?1:0);
        System.out.println("Sorting done in java8 method "+al2);
        System.out.println("Before sorting..."+al);
        Collections.sort(al,new MyComparator());//Without Lambda
        System.out.println("After sorting..."+al);
        Collections.sort(al);
        System.out.println("Defalut sorting: "+al);
    }
}
