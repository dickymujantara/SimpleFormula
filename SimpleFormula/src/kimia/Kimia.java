package kimia;

import java.util.Scanner;

public class Kimia {
    public static void rumusKimia(){
        Scanner scan = new Scanner(System.in);
        boolean lanjut = true;
        do {
            System.out.println("Selamat Datang Di Rumus Fisika");
            System.out.println("1.Rumus Konsentrasi Larutan");
            System.out.println("2.Rumus Sifat Koligatif Larutan");
            System.out.println("3.Back to Home");
            System.out.print("Pilih Menu: ");
            int menu = scan.nextInt();

            switch (menu){
                case 1:
                    KonsentrasiLarutan.rumusKonsentrasiLarutan();
                    break;
                case 2:
                    SifatKoligatifLarutan.rumusSifatKoligatifLarutan();
                    break;
                case 3:
                    lanjut = false;
                    break;
            }
        }while (lanjut);
    }

}
