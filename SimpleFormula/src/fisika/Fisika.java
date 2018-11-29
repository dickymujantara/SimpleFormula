package fisika;

import java.util.Scanner;

public class Fisika {
    public static void rumusFisika(){
        Scanner scan = new Scanner(System.in);
        boolean lanjut = true;
        do {
            System.out.println("Selamat Datang Di Rumus Fisika");
            System.out.println("1.Rumus Gerak");
            System.out.println("2.Rumus Energi");
            System.out.println("3.Rumus Impuls dan Momentum");
            System.out.println("4.Back to Home");
            System.out.print("Pilih Menu: ");
            int menu = scan.nextInt();

            switch (menu){
                case 1:
                    Gerak rumus = new Gerak();
                    rumus.rumusGerak();
                    break;
                case 2:
                    Energi rumus1 = new Energi();
                    rumus1.rumusEnergi();
                    break;
                case 3:
                    ImpulsMomentum rumus2 = new ImpulsMomentum();
                    rumus2.rumusImpulsMomentum();
                    break;
                case 4:
                    lanjut = false;
                    break;
            }
        }while (lanjut);

    }
}
