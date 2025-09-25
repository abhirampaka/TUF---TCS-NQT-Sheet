import java.util.Arrays;

public class InsertingElementsAtDiffPos {
    public static void main(String[] args) {
        int[] arr = {10,9,14,8,20,48,16,9,0,0,0};
        System.out.println("Original Arrays: " + Arrays.toString(arr));
        int n = arr.length;
        insertAtBegin(arr, n, 110);
        System.out.println("after inserting at Begining:  "+ Arrays.toString(arr));
        insertAtEnd(arr, n, 120);
        System.out.println("after inserting at end: " + Arrays.toString(arr));
        insertAtPos(arr, n, 3, 130);
        System.out.println("after inserting at given position: " + Arrays.toString(arr));
    }

    static void insertAtBegin(int[] arr,int n, int ele){
        for(int i = n - 2;i >= 0;i--){
            arr[i + 1] = arr[i];
        }
        arr[0] = ele;
    }

    static void insertAtEnd(int[] arr, int n, int ele){
        arr[n - 1] = ele;
    }

    static void insertAtPos(int[] arr, int n, int pos, int ele){
        for(int i = n - 1;i >= pos;i--){
            arr[i] = arr[i - 1];
        }
        arr[pos - 1] = ele;
    }
}