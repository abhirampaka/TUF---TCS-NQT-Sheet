package TCSNQT.Arrays;

public class ReverseOfArray {
        public static void main(String[] args) {
            int[] arr = {1, 5, 6, 8, 4, 9, 34, 87, 34, 76, 90};
            int n = arr.length - 1;
            int i = 0;
            while(i < n){
                
                    int temp = arr[i];
                    arr[i] = arr[n];
                    arr[n] = temp;
                    i++;
                    n--;
            }

            // System.out.println(Arrays.toString(arr));
            for(int j = 0;j < arr.length;j++)
                System.out.print(arr[j] + " ");
        }
}
