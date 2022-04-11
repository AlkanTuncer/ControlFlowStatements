package day07;

import java.util.Scanner;

public class SayiTahmin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sayi = (int) Math.round(Math.random() * 10);
        System.out.println("Bir sayı tuttum. Lütfen tahmin ediniz.(Sadece 3 hakkınız var.)");
        // sout ile sayi yı yazdırırsak tutulan sayıyı görürüz.
        int tahmin;
        for (int i = 0; i < 3; i++) {    // i=1 yapsaydık devamı i<=3 yapıp aşagıda i+1 yapmayıp i bırakabiliriz. Ama yüzde99 döngüler 0 dan başlar.
            System.out.print((i + 1) + ".Tahmininiz: ");    // döngü 0 dan baslıcagı ıcın 0-1-2 seklinde i+1 dersek 1-2-3 diye gidicek.
            tahmin = input.nextInt();
            if (sayi == tahmin) {
                System.out.println("Bildiniz.");
                break;
            } else if (sayi > tahmin) {
                System.out.println("Daha büyük bir sayı giriniz.");
            } else {
                System.out.println("Daha küçük bir sayı giriniz.");
            }
        }
    }
}