import java.util.Scanner;

public class linear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int key=sc.nextInt();
        int search[]={2,8,6,4,15,9,10,7};
        for (int i = 0; i < search.length; i++) {
            if(search[i]==key){
                System.out.println("we got it!");
            }
        }
        sc.close();
    }
}
