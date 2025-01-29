package Strings;

import java.util.Scanner;

public class String1 {
    public static void main(String[] args) {
        String name = "Shahul Ahmed";
        String sentence = "Hello World, I am a Programmer";
        System.out.println(name);
        System.out.println(sentence);

        //Input in Strings

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter yout name :-");
        String str = sc.nextLine();
        System.out.println("Your name is " + str);
        sc.close();
    }
}
