package OOPS;
class Outer{
    public void out(){
        System.out.println("Base class");
    }
}
class Inner extends Outer {
    public void inner(){
        System.out.println("Inner class");
    }
}
class Inner2 extends Inner{

}
public class Inheritance {
    public static void main(String[] args) {
        Outer o1 = new Outer();
        o1.out();
        Inner i1 = new Inner();
        i1.out();
        i1.inner();
        Inner2 one = new Inner2();
        one.out();
        one.inner();
    }
}
