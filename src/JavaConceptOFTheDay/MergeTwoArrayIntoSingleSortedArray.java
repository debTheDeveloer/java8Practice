package JavaConceptOFTheDay;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeTwoArrayIntoSingleSortedArray {
    private static int[] mergeTwoArray(int[] array1,int[] array2){
        return IntStream.concat(IntStream.of(array1),IntStream.of(array2)).
                distinct().
                sorted().
                toArray();
    }

    public static void main(String[] args) {
        int[] array1 = new int[]{1,2,3,5,6,7,8,9};
        int[] array2 = new int[]{2,4,7,3,9,11,15,12};
        System.out.println(Arrays.toString(mergeTwoArray(array1,array2)));
    }
}
