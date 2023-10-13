package ICPC;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Profit {
    public static void main(String[] args) {
        System.out.println("salam");
        int[] arr = new int[] {1, 2, 3, 4, 5 };
        System.out.println(Arrays.toString(twoSum(arr, 5)));

    }
    public static int[] twoSum(int[] arr, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
//        curr + x = target
        for (int i = 0; i < arr.length; i++) {
            int curr = arr[i];
            int x = target - curr;

            if (map.containsKey(x)){
                return new int[] {i, map.get(x)};
            }
            map.put(curr,i);
        }
//        return new int[] {-1,-1};
        return null;

    }
}
