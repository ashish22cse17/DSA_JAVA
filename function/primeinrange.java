package function;

import java.util.Scanner;

public class primeinrange {
    public static boolean isprime(int n) {
        if(n<=1) {
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++) {
            if(n%i==0) {
                return false;
            }
        }
        return true;
    }
    public static void primeinran(int a,int b) {
        for(int i=a;i<=b;i++) {
            if(isprime(i)) {
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        primeinran(a, b);
        sc.close();
    }
}
