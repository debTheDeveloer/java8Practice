import java.util.TreeMap;

public class TreeMapSorting {
    public static void main(String[] args) {
        TreeMap t = new TreeMap();
        t.put(1,"Arka");
        t.put(3,"Debajyoti");
        t.put(2,"Rudra");
        t.put(5,"Noel");
        t.put(4,"Bunti");

        System.out.println("Printing TreeMap: "+t);

        TreeMap<Integer,String> t2 = new TreeMap<>((i1,i2)->i1>i2?-1:(i1<i2)?1:0);
        t2.put(1,"Arka");
        t2.put(3,"Pritam");
        t2.put(2,"Sayan");
        t2.put(5,"Sarang");
        t2.put(4,"Asfaq");

        System.out.println("Printing TreeMap using java8: "+t2);
    }
}
