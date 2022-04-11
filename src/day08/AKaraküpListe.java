package day08;

public class AKaraküpListe {
    public static void main(String[] args) {

        for (int i = 1; i <=10 ; i++) {
            System.out.println("Sa\tKa\tKü");   // tab veriyoruz altgr+? \t
            System.out.print(i);
            System.out.print("\t");
            System.out.print(i*i);
            System.out.print("\t");
            System.out.println(i*i*i);
            System.out.println("\n");
            // if (i==7) break;  yaparsak 7de durur 8e gecmez.
            // if (i%2!=) continue; --> soutlarla for arasına yazmalıyız. Yaparsak sadece çift sayıların karesini ve küpünü hesaplar. != Eşit degil midir? demek
            // continue döngüyü devam ettirir ama bir sonrakine atlatır yani 1den 3e 3den 5e gibi.                                       == Eşit midir? demek

        }
    }
}
