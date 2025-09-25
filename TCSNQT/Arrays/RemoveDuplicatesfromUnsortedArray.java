// import java.util.*;
public class RemoveDuplicatesfromUnsortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 4, 2, 5, 1, 6, 85, 5, 1, 2};
        int n = arr.length;

        // Approach 1 using marking array
        // int[] mark = new int[n];

        // for(int i = 0;i < n;i++){
        //     if(mark[i] == 0){
        //         for(int j = i + 1;j < n;j++){
        //             if(arr[i] == arr[j])
        //                 mark[j] = 1;
        //         }
        //     }
        // }

        // for(int i = 0;i < n;i++){
        //     if(mark[i] == 0)
        //         System.out.print(arr[i] + " ");
        // }

        // Approach 2 using HashSet and ArrayList
        // HashSet<Integer> set = new  HashSet<>();

        // for(int x : arr){
        //     if(!set.contains(x)){
        //         set.add(x);
        //         System.out.print(x + " ");
        //     }
        // }

        //Approch 3
        // LinkedHashSet<Integer> set = new LinkedHashSet<>(); //if you want in sorted order use treeset,order as given use LinkedHashset.
        // for(int x : arr)
        //     set.add(x);

        // for(int x : set)
        //     System.out.print(x + " ");

        //Approach 4 Not using any new datastructure
        int index = 0;
        for(int i = 0;i < n; i++){
            boolean isDup = false;

            for(int j = 0;j < index;j++){
                if(arr[i] == arr[j]){
                    isDup = true;
                    break;
                }
            }

            if(!isDup){
                arr[index] = arr[i];
                index++;
            }
        }

        for(int i = 0;i < index;i++)
            System.out.print(arr[i] + " ");
    }
    
}
