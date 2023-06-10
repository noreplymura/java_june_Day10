abstract class Abstract2 {
    abstract void draw();
}
class Rectangle extends Abstract2 {
    void draw() {
        System.out.println("drawing rectangle");
    }
}
class Circle1 extends Abstract2 {
    void draw() {
        System.out.println("drawing circle");
    }
}
class TestAbstraction1 {
    public static void main(String args[]) {
        Abstract2 s = new Circle1();
        s.draw();
        Abstract2 r = new Rectangle();
        r.draw();
    }
}