import java.util.*;
class PolymorphismEx1 {
    void print() {
        System.out.println("Wellcom");
    }
    void print(String n) {
        System.out.println("Wellcom "+n);
    }
}
class Test {
    public static void main(String[] args) {
        PolymorphismEx1 ob1 = new PolymorphismEx1();
        ob1.print();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Type your Name");
        String s = sc.next();
       ob1.print(s);
    }
}
