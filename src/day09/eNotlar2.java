package day09;

import java.util.Scanner;

public class eNotlar2 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.print("Notu giriniz [0-100] : ");
        int not=input.nextInt();
        char notHarf=not<60?'F':not<70?'D':not<80?'C':not<90?'B':not<=100?'A':'G';  //String notHarf=not<60?"F":not<70?"D":not<80?"C":not<90?"B":not<=100?"A":
        System.out.println(not+"---> "+notHarf);                                                                                          // "Geçersiz Not";


        float f1=3.0F;
        int x=(int)f1;
        System.out.println(x);
    }
}
