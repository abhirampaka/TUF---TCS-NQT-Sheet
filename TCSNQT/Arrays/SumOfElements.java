package TCSNQT.Arrays;

import java.util.stream.IntStream;

public class SumOfElements {
    public static void main(String[] args) {
        int[] arr = {1, 54, 58, 65, 89, 52, 456, 159, 56, 83, 54};
        // int sum = 0;
        // for(int i = 0;i < arr.length;i++){
        //     sum += arr[i];
        // }
        int sum = IntStream.of(arr).sum();
        System.out.println("Sum of all Elements in the Array:" + sum);
    }
}
