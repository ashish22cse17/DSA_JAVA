package function;

import java.util.Scanner;

public class checkifprimeornot {
    public static boolean checkprime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i<Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    // public static boolean checkprime(int n){
    //     if(n<=1){
    //         return false;
    //     }
    //     for(int i=2;i<n-1;i++){
    //         if(n%i==0){
    //             return false;
    //         }
    //     }
    //     return true;
    // }
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(checkprime(n));
        sc.close();
     }
}
