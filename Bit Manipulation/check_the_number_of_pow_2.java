
import java.util.Scanner;

public class check_the_number_of_pow_2 {
    public static void main(String[] args) {
        System.out.print("Plese enter the number to check :- ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(((num)&(num-1))==0) System.out.println("Number is satisfy");
        else System.out.println("number is not satisfy");
    }
}
