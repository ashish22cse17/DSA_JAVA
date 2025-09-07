public class overloadingfn {
    public static int sum(int a,int b,int c){
        return a+b+c;
    }
    public static float sum(float a,float b,float c){
        return a+b+c;
    }
    public static void main(String[] args) {
        sum(4, 5, 7);
    }
}
