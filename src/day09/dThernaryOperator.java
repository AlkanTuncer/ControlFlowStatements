package day09;

import java.util.Scanner;

public class dThernaryOperator {
    public static void main(String[] args) {

        //Klavyeden girilen bir sayının mutlak değerini alan bir Java programı yazınız.

/*        Scanner input=new Scanner(System.in);
        System.out.print("Sayı : ");
        int sayi=input.nextInt();
        int md=sayi;
        if (sayi<0){
            md=-sayi;   // tek eksi operatörü önündeki sayının negatifini alır.
        }
        System.out.println("|" +sayi+"| = "+md);*/


        Scanner input=new Scanner(System.in);
        System.out.print("Sayı : ");
        int sayi=input.nextInt();
        int md=sayi<0?-sayi:sayi;   // eger sayım sıfırdan küçük ise - sayı değilse sayı.
        System.out.println("|" +sayi+"| = "+md);

        // condition? case1 : case2 ;  -->   THERNARY OPERATOR FORMAT
        // true gelirse case1 false gelirse case2 calısır.

     }
}
