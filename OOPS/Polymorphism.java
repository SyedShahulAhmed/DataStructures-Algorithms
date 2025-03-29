package OOPS;
class Tv{
    String name;
    int inch;
    public void print(String name){
        System.out.println(name);
    }
    public void print(int inch){
        System.out.println(inch);
    }
    public void print(String name, int inch){
        System.out.println(name + " " + inch);
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        Tv t1 = new Tv();
        t1.name = "Samsung";
        t1.inch = 65;
        t1.print(t1.name);
        t1.print(t1.inch);
        t1.print(t1.name,t1.inch);
    }
}
