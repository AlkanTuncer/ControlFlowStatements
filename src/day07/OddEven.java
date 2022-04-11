package day07;

import java.util.Scanner;
import java.util.SortedMap;

public class OddEven {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi=input.nextInt();
        if (sayi%2==0) {            // == Relational Operator -Eşit midir?- demek.
            System.out.println("Sayınız çift sayıdır.");
        }else{
            System.out.println("Sayınız tek sayıdır.");
        }
    }
}
