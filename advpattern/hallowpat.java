package advpattern;

import java.util.Scanner;

public class hallowpat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt(); 
        int m=sc.nextInt(); 
        for (int i = 1; i <=n; i++) {
            
            for (int j2 = 1; j2 <=m; j2++) {
                if(j2==1 || i==n || j2==m || i==1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
