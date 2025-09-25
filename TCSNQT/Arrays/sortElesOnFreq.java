import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class sortElesOnFreq {

    // Inner Pair class inside Main
    static class Pair {
        int first;   // element
        int second;  // frequency
        Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }

    // Function to sort elements by frequency
    static void Sortelementsbyfreq(int arr[], int n) {
        // Step 1: Count frequencies using HashMap
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        // Step 2: Store element-frequency pairs in a list
        ArrayList<Pair> vec = new ArrayList<>();
        for (int x : map.keySet()) {
            vec.add(new Pair(x, map.get(x)));
        }

        // Step 3: Sort by frequency (desc), then by element (asc)
        Collections.sort(vec, (a, b) -> {
            if (a.second == b.second)
                return a.first - b.first;
            else
                return b.second - a.second;
        });

        // Step 4: Print elements by frequency
        for (int i = 0; i < vec.size(); i++) {
            while (vec.get(i).second > 0) {
                System.out.print(vec.get(i).first + " ");
                vec.get(i).second--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {3, 3, 5, 2, 1, 1, 1, 2};
        int n = arr.length;
        Sortelementsbyfreq(arr, n);
    }
}
