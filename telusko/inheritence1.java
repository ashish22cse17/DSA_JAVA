package telusko;
 class Ram{
    void show()
    {
        System.out.println("I am Ram");
    } 
}
class Ram2 extends Ram{
    void show()
    {
        System.out.println("I am Ram2");
    } 
}
public class inheritence1 {
    public static void main(String[] args) {
        Ram2 r2 = new Ram2();
        r2.show();
    }
}
