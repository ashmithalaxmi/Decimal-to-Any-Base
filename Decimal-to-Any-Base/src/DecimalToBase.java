import java.util.Scanner;

public class DecimalToBase {
    private static void decimal_to_base(int n, int bit) {

        String s=Integer.toString(n,bit);
        System.out.println(Integer.parseInt(s));
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int bit=scanner.nextInt();
        decimal_to_base(n,bit);

    }

}
