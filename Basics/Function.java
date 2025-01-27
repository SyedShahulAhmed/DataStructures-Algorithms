import java.util.Scanner;

public class Function {
    public static int Addition(int a,int b){
        return a + b;
    }
    public static int Product(int a, int b){
        return a * b;
    }
    public static int Fact(int num){
        int fact = 1;
        for(int i =num; i >=1; i--){
            fact = fact *i;
        }
        return fact;
    }
    public static int Table(int n){
        for(int i = 1; i <= 10; i++){
        System.out.println(n + "X" + i + "=" + n * i );
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        int num = sc.nextInt();
        System.out.println("Addition is " + Addition(a1,b1));
        System.out.println("Product is " + Product(a1,b1));
        System.out.println("Factorial is " + Fact(num));
        System.out.println(Table(num));
        sc.close();
        
    }
}
