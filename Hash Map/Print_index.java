import java.util.HashMap;

public class Print_index {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,1};
        int number = 0;
        HashMap<Integer,Integer>map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], i);
            }else{
            // number = map.get(arr[i]);
           

            }

            // map.put(arr[i], i);
        }
        System.out.println(number);

    }
}
