import java.util.Comparator;

public class MyComparator implements Comparator<Integer> {
    public int compare(Integer num1, Integer num2)
    {
        return (num1>num2)?-1:(num1<num2)?1:0;
    }
}
