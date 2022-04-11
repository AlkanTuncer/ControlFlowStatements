package day08;

import java.util.Scanner;

public class DUcgenler {
    public static final int UCGENIN_IC_ACILARI=180;  // Evrensel bir belirtme ise constant bir değerse final ile tutulur -- üçgen iç açıları toplamı 180

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen üçgenin iç açılarını giriniz : ");
        System.out.print("A açısı : ");
        int a=input.nextInt();
        System.out.print("B açısı : ");
        int b=input.nextInt();
        System.out.print("C açısı : ");
        int c=input.nextInt();

        int icAcılarınToplamı=a+b+c;

        if (icAcılarınToplamı==UCGENIN_IC_ACILARI){
            System.out.println("Geçerli bir üçgendir.");
        }else{
            System.out.println("Geçersiz bir üçgendir.");
        }


    }
}
