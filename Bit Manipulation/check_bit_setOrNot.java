import java.util.Scanner;

public class check_bit_setOrNot {
    public static void main(String[] args) {
        int num = 45;
        System.out.println("Enter the number to check bit is set or not");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        num = num>>(i-1);
        if((num&1)==1) System.out.println("Bit is set");
        else System.out.println("bit is not set");

    }
}
