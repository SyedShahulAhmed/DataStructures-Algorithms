package OOPS;
abstract class Animal{
    public void walk(){

    }
}
class Lion extends Animal{
    public void walk(){
        System.out.println("Lion walks on 4 legs");
    }
}
class Chicken extends Animal{
    public void walk(){
        System.out.println("Chicken walks on 2 Legs");
    }
}
public class Abstraction {
    public static void main(String[] args) {
        Lion l1 = new Lion();
        l1.walk();
        // Animal a1 = new Animal();
        // a1.walk();

    }
}
