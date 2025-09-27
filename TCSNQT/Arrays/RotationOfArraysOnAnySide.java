public class RotationOfArraysOnAnySide {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int n = arr.length;
        int k = 2;
        String direction = "left";
        if(direction.equals("right"))
            rotateright(arr, n, k);
        else
            rotateleft(arr, n, k);
    }

    public static void rotateright(int[] arr, int n, int k){
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
        reverse(arr, 0 , n - 1);

        for(int i = 0;i < n;i++)
            System.out.print(arr[i] + " ");

    }

    public static void rotateleft(int[] arr, int n, int k){
        reverse(arr, n - k, n - 1);
        reverse(arr, 0, n - k - 1);
        reverse(arr, 0, n - 1);

        for(int i = 0;i < n;i++)
            System.out.print(arr[i] + " ");
    }

    public static int[] reverse(int arr[], int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        return arr;
    }
}
