import java.util.*;

public class FindingNonRepeatingElesinArray {
    public static void main(String[] args) {
        int[] arr = {2, 1, 1, 3, 2, 5, 2, 1, 6, 2};
        int n = arr.length;
        
        //approach 1 brute Force
        // for(int i = 0;i < n;i++){
        //     int count = 0;
        //     for(int j = 0;j < n;j++){
        //         if(arr[i] == arr[j]){
        //             count++;
        //         }
        //     }
        //     if(count == 1)
        //         System.out.print(arr[i] + " ");
        // }


        //approach 2

        Arrays.sort(arr);
        if(n > 1 && arr[0] != arr[1])
            System.out.println(arr[0] + " ");

        for(int i = 1;i < n - 1;i++){
            if(arr[i] != arr[i - 1] && arr[i] != arr[i + 1])
                System.out.print(arr[i] + " ");
        }

        if(n > 1 && arr[n - 1] != arr[n - 2])
            System.out.println(arr[n - 1]);

        //approach 3 using HashMaps
        // HashMap<Integer, Integer> map = new HashMap<>();
        // for(int x : arr)
        //     map.put(x, map.getOrDefault(x, 0) +  1);
        
        // for(Map.Entry<Integer, Integer> entry : map.entrySet()){
        //     if(entry.getValue() == 1) 
        //         System.out.print(entry.getKey() + " ");
        // }
    }    
}
