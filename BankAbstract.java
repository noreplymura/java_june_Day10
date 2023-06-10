abstract class BankAbstract {
    abstract int RateOfInterest();
}
class SBI extends BankAbstract {
    int RateOfInterest() {
        return 9;
    }
}
class HDFC extends BankAbstract {
    int RateOfInterest() {
        return 5;
    }
}
class TestBank {
    public static void main(String args[]) {
        BankAbstract b;
        b = new SBI();
        System.out.println("Rate of Interest is: "+b.RateOfInterest()+"%");
        b = new HDFC();
        System.out.println("Rate of Interest is: "+b.RateOfInterest()+"%");
    }
}
