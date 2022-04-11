package day05;

public class IfStatement {
    public static void main(String[] args) {

        int yas=35;

        // Yetişkin olup olmama
        if (yas>=18) {
            System.out.println("Kişi yetişkindir.");
        }else {
            System.out.println("Yetişkin değildir.");   // yaşı 15 tanımlasak ekranda bu görünücekti.
        }

        // Yaşı 70'den büyük, 18'den küçük olma durumu
        int yas2=53;
        if (yas2<18) {
            System.out.println("Sosyal yardım alabilir.");
        }else if(yas2>=70) {
            System.out.println("Sosyal yardım alabilir.");
        }else{
            System.out.println("Sosyal yardım alamaz.");

            int yas3=78;
            if (yas3<18|yas3>70){
                System.out.println("Sosyal yardım alabilir.");
            }else {
                System.out.println("Sosyal yardım alamaz.");
            }
        }


        int x=65;   // decimal
        int y=0b01000001;    // 01000001 binary de 65
        int z=0x41;          // 64 sayısının hexadecimal karsılıgı
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);


    }
}
