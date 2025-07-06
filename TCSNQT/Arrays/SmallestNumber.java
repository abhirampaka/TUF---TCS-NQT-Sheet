package TCSNQT.Arrays;
import java.util.*;

public class SmallestNumber {
    public static void main(String[] args) {
        int[] arr = {12, 13, 15, 9, 10, 67, 8, 3, 9, 77, 90, 100, 2};
        // int min = Integer.MAX_VALUE;
        // for(int i = 0;i < arr.length;i++){
        //     if(arr[i] < min)
        //         min = arr[i];
        // }
        // System.out.println(min);


        Arrays.sort(arr);
        System.out.println(arr[0]);


    }
}
