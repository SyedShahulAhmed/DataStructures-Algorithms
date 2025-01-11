import java.util.*;

class Variables {
    public static void main(String[] arg) {
        // Output
        System.out.println("Hello World"); // println used to print on new line or "\n also can be used"
        System.out.print("Hello World\n");
        System.out.println("Hello World \nfrom Lucy");
        // Question-1
        System.out.println("*");
        System.out.println("**");
        System.out.println("***");
        System.out.println("****");
        // or
        System.out.println("*\n**\n***\n****");

        // Variables
        int a = 10;
        int b = 20;
        int c;
        c = a + b;
        System.out.println(c);
        c = a - b;
        System.out.println(c);

        // Datatypes :- It is of Two types Primitive and Non-Primitive

        // Primitive
        //    |
        //    |-Integer   :- byte , short , long ,int
        //    |-Float     :- double , float
        //    |-Character :- 
        //    |-Boolean   :-

        // Sizes

        // Integer 
        //   |type      Size                     Range
        //   |
        //   |-int -   4bytes  -> -2^31 to 2^31 - 1 (-2,147,483,648 to 2,147,483,647)
        //   |-long -  8bytes  -> -2^63 to 2^63 - 1 ( -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807)
        //   |-short - 2bytes  -> -2^15 to 2^15 - 1 (-32,768 to 32,767)
        //   |-byte -  1byte   -> -2^7 to 2^7 - 1 (-128 to 127)

        // Float 
        //   |
        //   |
        //   |- float - 4bytes  -> 2^-149 to (2-2^-23) * 2^127 ( 1.4E-45 to 3.4028235E38 (Approx.))
        //   |- double - 8bytes -> 2^-1074 to (2-2^-52) * 2^1023 (4.9E-324 to 1.7976931348623157E308 (Approx.))

        // Character :- 2bytes -> 0 to 2^16 - 1 (0 to 65,535 )
        //                  (Unicode Contains 16 bytes)

        // Boolean   :-  Accepts either True or False (Not Accepts 0 or 1)
 
        //Taking Input from User

        Scanner sc = new Scanner(System.in);
        String num = sc.next();   //Prints One token of the input
        // String num = sc.nextLine();   //Prints the Whole Input
        System.out.println(num);
        // int num1 = sc.nextFloat();  //Taking Floating number
        int num1 = sc.nextInt();  //Taking Integer number
        int num2 = sc.nextInt();
        System.out.println(num1 + num2);

        sc.close();

        
    }
}
