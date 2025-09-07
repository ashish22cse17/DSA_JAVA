package function;

public class factorial {
    public static void recursionnotused(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println(fact);
    }
    //recursion method used here
    public static int factorialofnumber(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            return n*factorialofnumber(n-1);
        }
    }   
    public static void main(String[] args) {
        System.out.print(factorialofnumber(5));
        recursionnotused(0);
    }
}
