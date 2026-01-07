import java.util.Scanner;

public class set_bit_ofNumber {
    public static void main(String[] args) {
        int num = 45;
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        i = 1<<(i-1);
        int temp = num|i;
        System.err.println(temp);
        sc.close();
        
    }
}
