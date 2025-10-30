import java.util.*;
public class RemoveDuplicaet1 {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        int [] nums = {1,1,1,1,1,1,1,2,4,5,6};
        for (int i : nums) {
            set.add(i);
        }
        System.out.println(set.size());
        System.out.println(set);
        System.out.println(set);
    }
}
