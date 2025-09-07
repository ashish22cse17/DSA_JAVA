package function;
import java.util.Scanner;

public class dectobnry {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int binary=0;
        int dec=sc.nextInt();
        int power=0;
        while (dec>0) {
            int rem=dec%2;
            binary=binary+(rem*(int)Math.pow(10,power));
            power++;
            dec=dec/2;

        }
        System.out.println(binary);
        sc.close();
    }
}
