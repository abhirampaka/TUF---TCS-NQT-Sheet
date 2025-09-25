// import java.util.Arrays;
// import java.util.TreeSet;

public class RemoveDuplicatesInSortedArray {
    public static void main(String[] args) {
        int[] arr = {12, 12, 23, 25, 36, 56, 56, 56, 56, 85};

        // TreeSet<Integer> set =  new TreeSet<>();

        // for(int i = 0;i < arr.length;i++)
        //     set.add(arr[i]);

        // int j = 0;
        // for(int x : set){
        //     arr[j++] = x;
        // }

        // System.out.println(Arrays.toString(Arrays.copyOf(arr, set.size())));
        // for(int i = 0;i < set.size();i++)
        //     System.out.print(arr[i] + " ");

        // int indx = 0;
        // int n = arr.length;
        // for(int i = 0 ; i < n ; i++ ){
        //     if( arr[indx] != arr[i] ){
        //            indx++;
        //            arr[indx] = arr[i];
        //     }
        // }
        // for( int i = 0 ; i <= indx ; i++){
        //     System.out.print(arr[i] + " ");
        // }

        int i = 0;
        for(int j = 0;j < arr.length;j++){
            if(arr[i] != arr[j]){
                i++;
                arr[i] = arr[j];
            }
        }

        for(int x = 0; x < i + 1;x++)
            System.out.print(arr[x]+ " ");
    }
}
