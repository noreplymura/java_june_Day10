abstract class Abstract3 {
    Abstract3() {System.out.println("bike is created");}
    abstract void run();
    void changeGear() { System.out.println("gear changed");}
}
class Honda extends Abstract3 {
    void run() {System.out.println("running safely.....,"); }
}
class TestAbstraction2 {
    public static void main(String args[]) {
        Abstract3 obj = new Honda();
        obj.run();
        obj.changeGear();
    }
}