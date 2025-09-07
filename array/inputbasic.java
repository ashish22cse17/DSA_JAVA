import java.util.Scanner;

public class inputbasic {
    public static void main(String[] args) {
        int marks[]=new int[10];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i <5; i++) {
          marks[i]=sc.nextInt();
        }
        for(int prices:marks){
            System.out.println("le dekhle :"+prices);
        }
        System.out.println(marks.length);  ///checking length of array //
        sc.close();
    }
}
