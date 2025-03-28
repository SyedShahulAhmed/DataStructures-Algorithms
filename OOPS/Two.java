package OOPS;

class Student {
    String name;
    int id;
    Student(String name,int id){
        this.name = name;
        this.id = id;
        System.out.println("Name :- " + " " + name);
        System.out.println("Id :- " + " " + id);
    }
}
public class Two {
    public static void main(String[] args) {
        Student s1 = new Student("Lucy", 1234);
        Student s2 = new Student("Lucifer", 1235);
    }
}
