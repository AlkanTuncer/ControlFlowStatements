package day07;

import java.util.Scanner;

public class Kare {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Lütfen karenin kenar uzunluğunu giriniz: ");
        int kenar=input.nextInt();
        System.out.println("Menü");
        System.out.println("------------------");
        System.out.println("1. Alan Hesapla");
        System.out.println("2. Çevre Hesapla");
        System.out.println("------------------");
        System.out.print("Seçiminiz: ");
        int secim=input.nextInt();

        switch (secim){
            case 1:
                int alan=kenar*kenar;
                System.out.println("Alan = "+alan);
                break;
            case 2:
                int cevre=4*kenar;
                System.out.println("Çevre = "+cevre);
                break;
            default:
                System.out.println("Yanlış seçim yaptınız.");
                break;
        }
    }
}
