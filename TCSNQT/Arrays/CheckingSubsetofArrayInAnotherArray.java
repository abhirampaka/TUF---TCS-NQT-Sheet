import java.util.HashMap;

public class CheckingSubsetofArrayInAnotherArray {
    public static void main(String[] args) {
        int arr1[]={1,3,4,5,2};
	    int arr2[]={2,4,3,1,7,5,15};
        int m = arr1.length;
        int n = arr2.length;
        //boolean present = false;
        if(m > n){
            System.out.println("not present");
            System.exit(0);
        }

        //Approach 1
        // for(int i = 0;i < m;i++){
        //     present = false;
        //     for(int j = 0;j < n;j++){
        //         if(arr1[i] == arr2[j]){
        //             present = true;
        //             break;
        //         }
        //     }
        //     if(present == false){
        //         System.out.println("not present");
        //         break;
        //     }
        // }
        // if(present == true)
        //     System.out.println("Present");


        //Approach 2
        HashMap<Integer, Boolean> mp = new HashMap<>();
        for(int i = 0;i < n;i++){
            mp.put(arr2[i], true);
        }

        for(int i = 0;i < m;i++){
            if(mp.containsKey(arr1[i]) == false){
                System.out.println("not present");
                System.exit(0);
            }
        }
        System.out.println("present");

    }
}
