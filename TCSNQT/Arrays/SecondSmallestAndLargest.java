package TCSNQT.Arrays;
// import java.util.*;

class SecondSmallestAndLarget{
    public static void main(String[] args){
        int arr[] = {1, 12, 445, 56, 76, 34, 875, 543, 34, 74, 67, 89, 90, 654, 5, 67, 89};
        //if(arr.length == 0 || arr.length == 1)
        //System.out.println("-1");
             
        //Arrays.sort(arr);
        // System.out.println("Second Smallest Number:" + arr[1]);
        // System.out.println("Second Largest Number:" + arr[arr.length - 2]);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int Smax = Integer.MIN_VALUE;
        int Smin = Integer.MAX_VALUE;
        for(int i = 0;i < arr.length;i++){
            if(arr[i] > max){
                Smax = max;
                max = arr[i];
            }
            else if(arr[i] > Smax && arr[i] < max){
                Smax = arr[i];
            }

            if(arr[i] < min){
                Smin = min;
                min = arr[i];
            }
            else if(arr[i] > min && arr[i] < Smin){
                Smin = arr[i];
            }
        }
        System.out.println("Largest Element:" + max);
        System.out.println("Second Largest Element:" + Smax);
        System.out.println("Smallest Element:" + min);
        System.out.println("Second Smallest Element:" + Smin);
    }
}
