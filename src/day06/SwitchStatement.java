package day06;

public class SwitchStatement {
    public static void main(String[] args) {

        // switch .. case

        int dayNumber=1;      // 2 de case 2, 3de case3, ......  Eşleşme olmazsa default durumu output olur.
          switch (dayNumber){
            case 1:
                System.out.println("Pazartesi");break;
            case 2:
                System.out.println("Salı");break;
            case 3:
                System.out.println("Çarşamba");break;
            case 4:
                System.out.println("Perşembe");break;
            case 5:
                System.out.println("Cuma");break;
            case 6:
                System.out.println("Cumartesi");break;
            case 7:
                System.out.println("Pazar");break;
            default:
                System.out.println("Yanlış girildi.");break;
        }

        int dayNumber2=2;
        switch (dayNumber2){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");break;
            case 6:
            case 7:
                System.out.println("Weekend");break;
            default:
                System.out.println("Wrong case.");break;
        }


        int k1=5;
        int k2=10;

        switch (k1+k2){
            case 15:
                System.out.println("Kargo için uygundur.");



                break;
            case 20:
                System.out.println("Kargo için uygun değildir.");
                break;
            default:
                System.out.println("Girilen verilerle hesaplama yapılamaz.");
        }


    }
}
