
import java.util.HashMap;

public class Add_Duplicate {
    public static void main(String[] args) {
        int arr[] = {1,2,2,3,3,4};
        HashMap <Integer,Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        // System.out.println("Element\tCount");
        // System.out.println(map);
        int sum = 0;
        for(int k:map.keySet()){
            if(map.get(k)>1){

                sum+=map.get(k);
            }
        }
        System.err.println("Total number of duplicate elements: " + sum);
    }
}
