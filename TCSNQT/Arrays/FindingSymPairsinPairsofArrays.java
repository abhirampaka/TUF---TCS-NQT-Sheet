import java.util.HashMap;

public class FindingSymPairsinPairsofArrays {
    public static void main(String[] args) {
        int arr[][] = {{1, 2}, {2, 1}, {3, 4}, {4, 5}, {5, 4}};
        int n = arr.length;
        // for(int i = 0;i < n;i++){
        //     for(int j = i + 1;j < n;j++){
        //         if(arr[i][0] == arr[j][1] && arr[i][1] == arr[j][0]){
        //             System.out.print("(" + arr[i][1] + "," + arr[i][0] + ") ");
        //         }
        //     }
        // }

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0;i < n;i++){
            int first = arr[i][0];
            int second = arr[i][1];
            if(map.get(second) != null && map.get(second) == first)
                System.out.print("(" + first + "," + second + ") ");
            else
                map.put(first, second);
        }
    }
}
