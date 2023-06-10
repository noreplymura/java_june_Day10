class Animal6 {
    public void move() {
        System.out.println("call from Animals class");
    }
}

class Wild extends Animal6 {
   public void move()
    {
        System.out.println("call from Wild class");
    }
}

class pet extends Animal6 {
    public void move()
    {
        System.out.println("call from Pet class");
    }
} 
class Test {
    public static void main(String[] args) {
        Animal6 a = new Animal6();
        Animal6 w = new Wild();
        Animal6 p = new pet();
        a.move();
        w.move();
        p.move();

    }
}
