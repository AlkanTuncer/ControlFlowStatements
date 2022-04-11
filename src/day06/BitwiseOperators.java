package day06;

public class BitwiseOperators {
    public static void main(String[] args) {

        // Bitwise Operators
        // & , | , ^ , ~ , << , >> , >>>               ~ (altgr+ü)

           //  Binary     76543210
            int x=15;   //00001111
            int y=7;    //00000111
            int r=x&y;  //00000111
            int r2=x|y; //00001111
            System.out.println(r);
            System.out.println(r2);

            int sayi=128; //10000000
            sayi=sayi>>1; //01000000
            System.out.println(sayi);
            y=y>>1;   //00000011
            System.out.println(y);
            y=y<<2;   //00001100
            System.out.println(y);
    }
}
