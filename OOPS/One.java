package OOPS;
class Car {
    String color;
    String type;

    public void write(){
        System.out.println("The car color is " + this.color+ " " + "and type is" + " " +this.type);
    }
}
public class One {
    
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        car1.color = "red";
        car1.type = "sports";
        car1.write();
        car2.color = "black";
        car2.type = "luxury";
        car2.write();
    }
}
