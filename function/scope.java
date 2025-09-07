package function;
//two scope are there other than class scope block and method scope
public class scope {
    public static void main(String[] args) {
        int a=5;
        {
            int b=6;
            System.out.println(a);
            System.out.println(b);
        }
        //System.out.println(b); //error b is not defined in this scope
    }
}
