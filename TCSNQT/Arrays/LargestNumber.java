package TCSNQT.Arrays;
import java.util.*;

public class LargestNumber {
    public static void main(String[] args) {
        int[] arr = {12, 13, 15, 9, 10, 67, 8, 3, 9, 77, 90, 100, 2, 121};
        // int max = Integer.MIN_VALUE;
        // for(int i = 0;i < arr.length;i++){
        //     if(arr[i] > max)
        //         max = arr[i];
        // }
        // System.out.println(max);


        Arrays.sort(arr);
        System.out.println(arr[arr.length - 1]);

        
    }
    
}
