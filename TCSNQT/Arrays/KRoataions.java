package TCSNQT.Arrays;
import java.util.*;

public class KRoataions {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int k = 2;

        if(k == 1 || k == 0)
            System.out.println(-1);
        
        reverse(arr, 0, arr.length - 1);
        reverse(arr, k, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] reverse(int[] arr, int low, int high){
        while(low < high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
        return arr;
    } 
}
