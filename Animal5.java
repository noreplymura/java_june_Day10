class Animal5 {
    public void move() {
        System.out.println("Animals can move");
    }
}

class Dog extends Animal5 {
    {
        System.out.println("Dogs can walk and run");
    }
}

class Test {
    public static void main(String[] args) {
        Animal5 a = new Animal5();
        Animal5 b = new Dog();
        //a.move();
        b.move();
    }
}
