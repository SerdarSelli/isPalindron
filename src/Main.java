import java.util.Scanner;

public class Main {
    static void f(int x){
        int reflect = x, lastNumber=0,newNumber=0;
        while (reflect!=0){
            lastNumber=reflect%10;
            newNumber=(newNumber*10)+lastNumber;
            reflect/=10;
           // System.out.println(newNumber);
        }
if (newNumber==x){
    System.out.println("sayı palindron dur");
}else {
    System.out.println("sayı palindrom değildir");
}
        ;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("sayı giriniz");
        int a= scan.nextInt();
         f(a);
    }
}