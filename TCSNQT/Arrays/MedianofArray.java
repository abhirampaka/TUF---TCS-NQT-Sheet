package TCSNQT.Arrays;
import java.util.*;

public class MedianofArray {
    public static void main(String[] args) {
        int[] arr = {552, 586, 895, 65, 23, 65, 496, 532, 456};
        int n = arr.length;
        Arrays.sort(arr);

        if(n % 2 == 0)
            System.out.print((double)(arr[n / 2] + arr[n / 2 - 1]) / 2);
        else
            System.out.print(arr[n / 2]);
    }
}
