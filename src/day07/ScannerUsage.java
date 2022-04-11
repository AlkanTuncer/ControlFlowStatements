package day07;

import java.util.Scanner;      // java.util kütüphanesini import ediyoruz.

public class ScannerUsage {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);           // new operatörünün görevi yeni bir nesne oluşturmak.
        System.out.print("Lütfen isminizi giriniz: ");
        String isim=input.nextLine();                               // çıktı-output kısmına İsim yazabilicez, klavyeden input-girdi alıcaz.
        System.out.println("Merhaba "+isim +"!");
    }
}
