package day08;

import java.util.Scanner;

public class DUcgenler2 {
    public static final int UCGENIN_IC_ACILARI=180;  // Evrensel bir belirtme ise constant bir değerse final ile tutulur -- üçgen iç açıları toplamı 180

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        String invalidMessage="Geçersiz bir üçgendir.";
        System.out.println("Lütfen üçgenin iç açılarını giriniz : ");

        System.out.print("A açısı : ");
        int a=input.nextInt();
        if (a<=0){
            System.out.println(invalidMessage);
            System.exit(-1);   // A açısı yanlıs degerde girilince programdan çıkılır.
        }

        System.out.print("B açısı : ");
        int b=input.nextInt();
        if (b<=0){
            System.out.println(invalidMessage);
            System.exit(-1);   // B açısı yanlıs degerde girilince programdan çıkılır.
        }

        System.out.print("C açısı : ");
        int c=input.nextInt();
        if (c<=0){
            System.out.println(invalidMessage);
            System.exit(-1);   // C açısı yanlıs degerde girilince programdan çıkılır.
        }

        int icAcılarınToplamı=a+b+c;

        if (icAcılarınToplamı==UCGENIN_IC_ACILARI){
            System.out.println("Geçerli bir üçgendir.");
        }else{
            System.out.println(invalidMessage);
        }


    }
}
