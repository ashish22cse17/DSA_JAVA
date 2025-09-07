public class callbyvalue {
    public static void swap(int n,int m) {
        int temp=n;
        n=m;
        m=temp;
       System.out.println(n); 
       System.out.println(m); 
    }
    public static void main(String[] args) {
        swap(5,7);
    }
}
