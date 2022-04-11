package day08;

import java.util.Scanner;

public class CEnBuyukSayi {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.print("1. Sayı : ");
        int sayi1=input.nextInt();
        System.out.print("2. Sayı : ");
        int sayi2=input.nextInt();
        System.out.print("3: Sayı : ");
        int sayi3=input.nextInt();

        int enBuyuk=sayi1;

        if (sayi2>enBuyuk){
            enBuyuk=sayi2;
        }

        if (sayi3>enBuyuk){
            enBuyuk=sayi3;
        }

        System.out.println("En büyük sayı = "+enBuyuk);
    }
}
