import java.util.*;
class Conditional {
    public static void main(String[] args){ 
       Scanner sc = new Scanner(System.in);
       int age = sc.nextInt();

    //    If and else
       if(age >= 18) {
        System.out.println("You are Above 18");
       }
       else{
        System.out.println("You are below 18");
       }

       int a = sc.nextInt();
       int b = sc.nextInt();

       if(a == b) {
        System.out.println("Equal");
       }
       else if ( a > b) {
        System.out.println("A");
       }
       else {
        System.out.println("B");
       }

    // Switch Cases

    int button = sc.nextInt();

      switch(button) {
        case 1 :
            System.out.println("One");
            break;
        case 2 :
            System.out.println("Two");
            break;
        default :
            System.out.println("None");

      } 
       sc.close();
    }
}