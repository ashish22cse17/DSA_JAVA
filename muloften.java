import java.util.Scanner;

public class muloften {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int t = sc.nextInt();
            if (t % 10 == 0) {
                System.out.println("multiple of ten is entered : " + t);
                break;
            }
            // else{
            //     System.out.println("loge kya");
            //     break;
            // }
        }
         sc.close();
    }
}
