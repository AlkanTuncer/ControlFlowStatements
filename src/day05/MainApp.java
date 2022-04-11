package day05;

public class MainApp {
    public static void main(String[] args) {

        // Mantıksal Operatörler
        // & (shift+6) and - VE , | (altgr+<) or - VEYA , !  DEĞİL
        // [&& , ||] --> short cut and(ve), short cut or(veya): VE'de ilki false ise digerine bakmaz. VEYA'da ilki true ise diğerine bakmaz.

        boolean b1=false&false;  // False
        boolean b2=false&true;
        boolean b3=true&false;
        boolean b4=true&true;   // True

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);

        boolean b5=false|false;
        boolean b6=false|true;
        boolean b7=true|false;
        boolean b8=true|true;

        System.out.println(b5);
        System.out.println(b6);
        System.out.println(b7);
        System.out.println(b8);

        boolean b9=!(true&false);
        boolean b10=!(true|false);

        System.out.println(b9);
        System.out.println(b10);



    }
}
