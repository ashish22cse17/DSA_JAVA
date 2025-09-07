public class passtofun {
    public static void eater(int marks[]) {
        for(int prices:marks){
            System.out.println("le dekhle :"+prices);
        }
    }
    public static void main(String[] args) {
        int marks[]={86,45,7,95,36};
        eater(marks);// always use pass by reference***
    }
}
