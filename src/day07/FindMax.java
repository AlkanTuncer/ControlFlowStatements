package day07;

import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz: ");
        int sayi1=input.nextInt();                            // double sayi1=input.nextDouble(); Kesirli sayı girilebilir olur.
        System.out.print("İkinci sayıyı giriniz: ");
        int sayi2=input.nextInt();

        if (sayi1>sayi2){
            System.out.println("Birinci sayı büyüktür.");
        }else if (sayi1<sayi2){
            System.out.println("İkinci sayı büyüktür.");
        }else {
            System.out.println("Sayılar eşittir.");
        }
    }
}
