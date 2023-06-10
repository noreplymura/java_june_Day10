class AmimalSuperkeyWord2 {
    AmimalSuperkeyWord2() {
        System.out.println("animal is created");
    }
}
class Dog extends AmimalSuperkeyWord2 {
    Dog() {
        System.out.println("dog is created");
    }
}
class TestSuper4 {
    public static void main(String args[]) {
        Dog d = new Dog();
    }
}