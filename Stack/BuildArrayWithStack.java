
import java.util.Stack;

public class BuildArrayWithStack {
    public static void main(String[] args) {
        Stack <String> stk = new Stack<>();
        int target[] = {1,3};
        
        int counter = 0 , n = 3;
        for(int i = 1;i<=n;i++){
             if(counter == target.length ) break;
             if (i==target[counter]) {
                stk.add("push");
                counter++;
             }else{
                stk.add("push");
                stk.add("pop");
             }

        }
        System.out.println(stk);
    }
}
