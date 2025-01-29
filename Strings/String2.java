package Strings;

import java.util.Scanner;

public class String2 {
    public static void main(String[] args) {
        // Functions :-

        // Concatenation
        String fname = "Shahul";
        String lname = "Ahmed";
        String name = fname + " " + lname;
        System.out.println(name);

        // Length
        int len = name.length();
        System.out.println("The length of the string is " + len); // including spaces

        // charAt
        String str = "a bc def";
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
        System.out.println();

        // compareTo

        String str1 = "Hello";
        String str2 = "hello";
        if (str1.compareTo(str2) == 0) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
        // str1 > str2 = +ve
        // str1 < str2 = -ve
        // str1 == str2 = 0

        // if(str1 == str2){ // not used because of failure in some cases
        // System.out.println("Equal");
        // }else{
        // System.out.println("Not Equal");
        // }

        //Substring
        
        String str3 = "Hello World";
        System.out.println(str3.substring(0,5));  //endIndex is Not Inclusive


        //Problem-1

        int tot = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size :-");
        int n = sc.nextInt();
        String arr[] = new String[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.next();
            tot += arr[i].length();
        }
        System.out.println("Total length is =" + tot);

        //Problem-2

        System.out.println("Enter String := ");
        String og = sc.nextLine();
        String res = "";
        for(int i =0; i < og.length(); i++){
            if(og.charAt(i) == 'e'){
                res += "i";
            }else{
                res += og.charAt(i);
            }
        }
        System.out.println(res);

        //Problem-3

        String email = sc.nextLine();
        String user = "";
        for(int i = 0; i < email.length(); i++){
            if(email.charAt(i) == '@'){
                break;
            }else{
                user += email.charAt(i);
            }
        }
        System.out.println(user);
        sc.close();

    }
}
