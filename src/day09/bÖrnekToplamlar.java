package day09;

import java.sql.SQLOutput;
import java.util.Scanner;

public class bÖrnekToplamlar {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        int sayi;
        int toplam=0;
        do {
            System.out.print("Sayı : ");
            sayi=input.nextInt();
            toplam += sayi;
        }while (sayi!=0);
        System.out.println("Toplam = "+toplam);

/*        int num,toplam1=0;
        System.out.print("Sayı : ");
        num=input.nextInt();                              // Üstteki durumun aynısı ama üstteki daha güzel bir kod yazımı.
        while (num!=0){
            toplam1 +=num;
            System.out.print("Sayı : ");
            num=input.nextInt();
        }
        System.out.println("Toplam1 = "+toplam1);*/



    }
}
