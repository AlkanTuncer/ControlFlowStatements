package day08;

import java.util.Scanner;

public class BKareDikdortgenDaire {   // Geometrik şekiillerin Alan ve Cevre hesabı
    public static void main(String[] args) {

        System.out.println("1.Kare");
        System.out.println("2.Dikdörtgen");
        System.out.println("3.Daire");
        System.out.print("Geometrik Şekli Seçiniz : ");

        Scanner input = new Scanner(System.in);
        int secim = input.nextInt();
        double alan,cevre;

        switch (secim) {
            case 1:
                System.out.print("Kenar Uzunluğu : ");
                int kenar=input.nextInt();
                alan=kenar*kenar; // alan=Math.pow(kenar,2)
                cevre=4*kenar;
                System.out.println("Alan = "+(int)alan);     // Çember hariç sonucu double (20.0) göstermemek için int e (20) dönüştürüyoruz.
                System.out.println("Çevre = "+(int)cevre);
                break;
            case 2:
                System.out.print("Uzun Kenar : ");
                int uzunKenar=input.nextInt();
                int kisaKenar;
                for (;;){  System.out.print("Kısa Kenar : ");    // do-while döngüsünü görünce daha kullanıslı bir kod yazıcaz. Sonsuz döngü tehlikelidir! 'break'
                    kisaKenar=input.nextInt();
                    if (uzunKenar>kisaKenar)
                        break;
                }
                alan=kisaKenar*uzunKenar;
                cevre=2*(kisaKenar+uzunKenar);
                System.out.println("Alan = "+(int)alan);
                System.out.println("Çevre = "+(int)cevre);
                break;
            case 3:
                System.out.print("Yarıçap Uzunluğu : ");
                int yariCap=input.nextInt();
                alan=Math.PI*Math.pow(yariCap,2);
                cevre=2*Math.PI*yariCap;
                System.out.println(String.format("Alan = %5.2f",alan));
                System.out.println("Çevre = "+cevre);
                break;
            default:
                System.out.println("YANLIŞ SEÇİM!");
                break;
        }
    }
}