package OOPS;

class Student {
    String name;
    int id;
    Student(String name,int id){
        this.name = name;
        this.id = id;
    }
    public void printinfo(){
        System.out.println(this.name);
        System.out.println(this.id);
    }
}
public class Two {
    public static void main(String[] args) {
        Student s1 = new Student("Lucy", 1234);
        s1.printinfo();
        Student s2 = new Student("Lucifer", 1235);
        s2.printinfo();
    }
}
