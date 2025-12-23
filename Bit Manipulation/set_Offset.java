public class set_Offset {
    public static void main(String[] args) {
        int a = 205;
        //check if a bit is set or not

        int num = (a>>6)|0;
        if(num==0)System.out.println("bit is not set");
        else System.out.println("bit is set");
    }
}
