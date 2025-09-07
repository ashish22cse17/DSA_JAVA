// Arithmetic operation are of two type 
// binary when two operands like + - * / %etc
//  and 
//  for single operand is unary like ++ and -- etc..


import java.util.Scanner;

public class add {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=a+b; //similar for '-','*','/','%'
        System.out.println("Addition :"+c);
        sc.close();
    }
}
