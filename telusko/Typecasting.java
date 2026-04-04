package telusko;
 class A {
    public void show() {
        System.out.println("I am A");
    } 
}
 class B extends A {
    public void show1() {
        System.out.println("I am B");
    }

}
public class Typecasting {
    public static void main(String[] args) {
        B obj = new B();
        obj.show1(); // B's show method will be called
        A obj1 = (A) new B(); // Upcasting: B is being treated as A             
        obj1.show(); // B's show method will be called due to dynamic method dispatch  
        //obj1.show1();
    }
}