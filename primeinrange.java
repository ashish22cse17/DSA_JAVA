import java.util.Scanner;

public class primeinrange {
    public static int primeRange(int n) {
        boolean isPrime = true;
        if (n <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if(isPrime) {
            System.out.println(n + " ");
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loge = sc.nextInt();
        for (int i = 0; i < loge; i++) {
            primeRange(i);
        }
        sc.close();
    }
}
