import java.util.*;
public class Loops {
    public static void main(String[] args){
        //For Loops
        for(int i = 0; i < 10; i ++){
            System.out.println("Hello World"+" ");
        }
        for(int j = 0; j <= 10; j++){
            for(int k= 0 ; k <= 5; k++){
                System.out.println(k + " ");
            }
        }
        //While Loop
        int w = 0;
        while (w < 11) {
            System.out.println(w);
            w++;
        }
        //Do while
        // int a = 0;
        // do{
        //     System.out.println(a);
        //     a++;
        // }while(a <= 5);

        //Sum of N natural Numbers
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number :");
        int num = sc.nextInt();
        for (int b = 1; b <= num; b++){
            sum = sum + b;
        }
        System.out.println(sum);
        

        //Tables

        int mul;
        int number = sc.nextInt();
        for (int t = 1; t <= 10; t++){
            mul = number * t;
            System.out.println(number  +  "X"  +  t  +  "="  + mul);
        }

        sc.close();
    }
}
