
import java.util.Arrays;

public class ArithmeticProgression {
    public static void main(String[] args) {
        int arr[] = {3,5,1};
        Arrays.sort(arr);
        boolean flag = false;
        int diff = arr[0]-arr[1];
        for (int i =0 ; i < arr.length-1; i++) {
            if ((arr[i]-arr[i+1])!=diff) {
                flag = false;
            }else{
                flag = true;
            }
        }
        if (flag) {
            System.out.println("true");
        }else{
            System.out.println("false");
        }
        
    }
}
