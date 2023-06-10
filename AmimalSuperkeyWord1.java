class AmimalSuperkeyWord1 {
    AmimalSuperkeyWord1() {
        System.out.println("animal is created...");
    }
}
class Dog extends AmimalSuperkeyWord1 {
    Dog() {
        super();
        System.out.println("dog is created...");
    }
}
class TestSuper3 {
    public static void main(String args[]) {
        Dog d = new Dog();
    }
}