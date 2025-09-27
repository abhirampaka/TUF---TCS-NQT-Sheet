public class EquilibriumIndexOfArray {
    public static void main(String[] args) {
        int[] arr = {2, 3, -1, 8, 4};
        int n = arr.length;
        int check = 0;

        //Approach 1 
        // int firstSum = 0, secondSum = 0;
        // for(int i = 0;i < n;i++){
        //     firstSum = 0;
        //     for(int j = 0;j < i;j++){
        //         firstSum += arr[j]; 
        //     }

        //     secondSum = 0;
        //     for(int j = i + 1;j < n;j++){
        //         secondSum += arr[j];
        //     }

        //     if(firstSum == secondSum){
        //         System.out.println(i);
        //         check = 1;
        //     }
        // }
        // if(check == 0)
        //     System.out.println(-1);

        //Approach 2 little bit time complexity optimised
        int totalSum = 0, leftSum = 0, rightSum = 0;

        for(int x : arr)
            totalSum += x;
        
        rightSum = totalSum;

        for(int i = 0;i < n;i++){
            rightSum -= arr[i];
            if(leftSum == rightSum){
                System.out.println(i);
                check = 1;
                break;
            } 
            leftSum += arr[i];
        }
        if(check == 0)
            System.out.println(-1);
        
    }
}
