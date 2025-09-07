public class binomial {
    public static int factor(int j) {
        int fact=1;
        for (int i = 1; i <=j; i++) {
            fact=fact*i;
        }
        return fact;
    }
    public static int binocoffee(int n,int m){
        int cofee=factor(n)/(factor(m)*factor(n-m));
        return cofee;
    }
    public static void main(String[] args) {
        System.out.println(binocoffee(5,2));
    }
}
