public class swap_Two_Number{
    public static void main(String[] args) {
        int a = 64,b=89;
        a = a^b;
        b = a^b;

        a = a^b;
        System.out.println(a);
        System.out.println(b);
        

    }
}