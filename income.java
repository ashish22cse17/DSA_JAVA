import java.util.Scanner;

public class income {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int incom=sc.nextInt();
        if(incom<500000){
            System.out.println("0% tax"+" : "+incom*0);
        }
        else if(incom>=500000&&incom<1000000){
            System.out.println("20% tax"+" : "+(int)incom*0.2);
        }
        else{
            System.out.println("30% tax"+" : "+(int)incom*0.3);
        }
        sc.close();
    }
    
}