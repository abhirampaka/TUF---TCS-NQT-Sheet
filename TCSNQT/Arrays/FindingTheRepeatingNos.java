import java.util.*;

public class FindingTheRepeatingNos {
    public static void main(String[] args) {
        int[] arr = {2, 1, 1, 3, 2, 5, 2, 1, 6, 2, 6};
        // int n = arr.length;
        
        //approach 1 brute Force
        // int[] dup = new int[n];
        // int count = 0;
        // for(int i = 0;i < n;i++){
        //     for(int j = i + 1;j < n;j++){
        //         if(arr[i] == arr[j]){
        //             dup[count] = arr[i];
        //             count++;
        //             break;
        //         }
        //     }
        // }

        // Arrays.sort(dup, 0 , count);

        // for(int i = 0;i< count;i++){
        //     if(i == 0 || dup[i] != dup[i - 1]){
        //         System.out.print(dup[i] + " ");
        //     }
        // }

        //approach 2
        //ArrayList<Integer> list = new ArrayList<>();
        // for(int i = 0;i < n;i++){
        //     for(int j = i + 1;j < n;j++){
        //         if(arr[i] == arr[j] && list.contains(arr[i]) == false){
        //             list.add(arr[i]);
        //             System.out.print(arr[i] + " ");
        //             break;
        //         }
        //     }
        // }

        //approach 3

        // Arrays.sort(arr);
        // for(int i = 0;i < n - 1;i++){
        //     if(arr[i] == arr[i + 1]){
        //         System.out.print(arr[i + 1] + " ");
        //         while(i < n - 1 && arr[i] == arr[i + 1])   
        //             i++;
        //     }
        // }

        //approach 4 using HashMaps
        // HashMap<Integer, Integer> map = new HashMap<>();
        // for(int x : arr)
        //     map.put(x, map.getOrDefault(x, 0) +  1);
        
        // for(Map.Entry<Integer, Integer> entry : map.entrySet()){
        //     if(entry.getValue() != 1) 
        //         System.out.print(entry.getKey() + " ");
        // }
        // int[] arr = {2, 1, 1, 3, 2, 5, 2, 1, 6, 2};
        HashSet<Integer> set = new HashSet<>();
        Arrays.sort(arr); // Required for only using one set
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1] && !set.contains(arr[i])) {
                System.out.print(arr[i] + " ");
                set.add(arr[i]); // Track printed duplicates
            }
        }
    }
    
}
