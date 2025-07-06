package TCSNQT.Arrays;
import java.util.*;

public class CountingFreqOfEveryElement {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 4, 6, 2, 6};
        int n = arr.length;
        //MAP Creation
        Map<Integer, Integer> map = new HashMap<>();

        //adding elements to map
        for(int i = 0;i < n;i++)
            map.put(arr[i], map.getOrDefault(arr[i],0) + 1);
        
        //printing map keys and values
        map.forEach((key, value) -> System.out.println(key + " " + value));

        // boolean[] visited = new boolean[n];

        // for(int i = 0;i < n;i++){
        //     if(visited[i] == true)
        //         continue;
            
        //     int count = 1;
        //     for(int j = i + 1;j < n;j++){
        //         if(arr[i] == arr[j]){
        //             visited[j] = true;
        //             count++;
        //         }
        //     }
        //     System.out.println(arr[i] + " " + count);
            
    }
}
    

