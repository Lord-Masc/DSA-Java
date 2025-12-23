
import java.util.Stack;

public class ReversePolishNotation {
    public static void main(String[] args) {
        String tokens [] = {"4","13","5","/","+"};
        Stack<Integer> stack = new Stack<>();
        for (String token : tokens) {
            if (token.equals("+")||token.equals("-")||token.equals("/")||token.equals("*")) {
                int a = stack.pop();  // second operand
                int b = stack.pop();  // first operand
                int result = 0;

                // Apply the operator
                switch (token) {
                    case "+": result = b + a; break;
                    case "-": result = b - a; break;  // order matters
                    case "*": result = b * a; break;
                    case "/": result = b / a; break;  // integer division
                }
                stack.push(result);
            }else{
                stack.push(Integer.parseInt(token));
            }
        }
        System.out.println(stack.pop());
    }
}
