import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        System.out.println("Welcome to calculator");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");   
        int a = sc.nextInt();
        System.out.println("Enter second number");  
        int b = sc.nextInt();
        System.out.println("Enter the operator (+, -, *, /, %)");   
        char op = sc.next().charAt(0);
        switch (op) {
            case '+':System.out.println(a+b);
             break;
            case '-':System.out.println(a-b); 
             break;    
            case '*':System.out.println(a*b);
             break;
            case '/':System.out.println(a/b);
             break;
            case '%':System.out.println(a%b); 
             break;
            default:System.out.println("enter a valid operator"); 
                break;
        }
        sc.close();
    }
}
