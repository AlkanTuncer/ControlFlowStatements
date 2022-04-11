package day09;

public class aWhileLoops {
    public static void main(String[] args) {

        int i=0;
        while (i<5){
            System.out.println(" --> Jugking");
            i++;  // i=i+1  i+=1  şeklinde de yapılabilir.
        }

        //1'den 10'a kadar olan sayıların toplamını bulan Java programı yazınız.
        int a=1,toplam=0;
        while (a<=10){         // while(++a<=10) yazılır ama int a=0 olarak tanımlanmalı. Bu durumda sona a++; yazılmaz.
            toplam=toplam+a;   // toplam += a;
            a++;
        }
        System.out.println("Toplam = "+toplam);


//        int d=1, toplam1=0;
//        do {
//            toplam1 +=d;
//            d++;
//        }while (d<=10&toplam1<50);
//        System.out.println("Toplam1 = "+toplam1);

        int d=1, toplam1=0;
        while (d<=100&toplam1<50){
            toplam1 += d;
            d++;
        }
        System.out.println("Toplam1 = "+toplam1);

    }
}
