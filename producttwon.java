public class producttwon {
 
    public static int mul(int n,int m) {
        int pro=n*m;
        return pro;
    }
    public static int mul(int j) {
        int fact=1;
        for (int i = 1; i <=j; i++) {
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        System.out.println(mul(5,7));
        System.out.println(mul(5));
    }
}
