import java.util.TreeSet;

public class TreeSetSorting {
    public static void main(String[] args) {
        TreeSet<Integer> t = new TreeSet<>((i1,i2)->i1>i2?-1:(i1<i2)?1:0);
        t.add(10);
        t.add(0);
        t.add(15);
        t.add(5);
        t.add(20);
        t.add(7);
        System.out.println("Printing TreeSet: "+t);
    }
}
