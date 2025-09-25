import java.util.Arrays;
import java.util.HashMap;
// import java.util.HashSet;
import java.util.Map;
// import java.util.Set;

public class ReplaceElesByItsRank {
    public static void main(String[] args) {

        //Approach 1
        // int[] arr = {20, 15, 26, 2, 98, 6};
        // int n = arr.length;
        // int[] sorted = Arrays.copyOf(arr, n);
        // Arrays.sort(sorted);
        // int[] rank = new int[n];
        // for(int i = 0;i < n;i++){
        //     int index = 0;
        //     for(int j = 0;j < n;j++){
        //         if(arr[j] == sorted[i])
        //             index = j;
        //     }
        //     rank[index] = i + 1;
        // }

        // for(int i = 0;i < n;i++){
        //     System.out.print(rank[i] + " ");
        // }


        //Approach 2
        // int n = 6;
        // int arr[] = {20,15,26,2,98,6};
        // for (int i = 0; i < n; i++) {
        //     Set < Integer > s = new HashSet < Integer > ();
        //     for (int j = 0; j < n; j++) {
        //         if (arr[j] < arr[i]) {
        //             s.add(arr[j]);
        //         }
        //     }
        // int rank = s.size() + 1;
        // System.out.print(rank + " ");

        int[] arr = {20, 15, 26, 2, 98, 6};
        int n = arr.length;

        // Make a sorted copy
        int[] sorted = Arrays.copyOf(arr, n);
        Arrays.sort(sorted);

        // Map elements to their ranks
        Map<Integer, Integer> rankMap = new HashMap<>();
        int rank = 1;
        for (int val : sorted) {
            rankMap.putIfAbsent(val, rank++);
        }

        // Print ranks of original array
        for (int val : arr) {
            System.out.print(rankMap.get(val) + " ");
        }
    }
}
