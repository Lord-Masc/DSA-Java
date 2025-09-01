
import java.util.HashMap;
import java.util.Set;

public class Majority_element1 {
    public static void main(String[] args) {
        int [] nums = {1,1,1,1,1,1,1,2,4,5,6};
        HashMap<Integer,Integer> map = new HashMap<>();
        int count = nums.length;
        // for (int i : nums) {
        //     count++;
        // }
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
          if (map.containsKey(num)) {
            map.put(num, map.get(num)+1);
          }else{
            map.put(num, 1);
          }
        }

        Set<Integer> key = map.keySet();
        for (Integer i : key) {
            if(map.get(i)>count/2) System.out.println(i);
        }

    }

}
