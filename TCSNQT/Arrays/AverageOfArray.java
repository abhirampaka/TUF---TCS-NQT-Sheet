package TCSNQT.Arrays;

public class AverageOfArray {
    public static void main(String[] args) {
        int[] arr = {552, 586, 895, 65, 23, 65, 496, 532, 456, 25};
        int n = arr.length;
        int sum = 0;
        for(int i = 0;i < n;i++)
            sum += arr[i];

        System.out.println("Average of the Array is " + sum / n);
    }
}
