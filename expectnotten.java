import java.util.Scanner;

public class expectnotten {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int t = sc.nextInt();
            if (t % 10 != 0) {
                System.out.println("printing other than multiple of ten is entered : "+ t);
                continue;
            }
            sc.close();
        } 
    }
}

