import java.util.Scanner;

public class binaryshinarr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int start,end;
        int key=sc.nextInt();
        int arr[]=new int[6];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();

        }
        start=0;
        end=arr.length-1;
        while (start<=end) {
           int mid=(start+end)/2;
           if (arr[mid]==key) {
            System.out.println("mil gaya "+arr[mid]);
           }
           if (arr[mid]<key) {
            start=mid+1;
           }
           if (arr[mid]==key) {
            end=mid-1;
           }
        }
        sc.close();
    }
}
