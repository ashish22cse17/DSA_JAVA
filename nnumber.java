import java.util.Scanner;

public class nnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=0;
        while (i<=n) {
            System.out.print(i+" ");
            i++;
        }
        sc.close();
    }
}
