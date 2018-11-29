package matematika;

import java.util.Scanner;

public class Matematika {
    public static void RumusMatematika(){
        Scanner scan = new Scanner(System.in);
        boolean lanjut = true;
        do {
            System.out.println("Selamat Datang Di Rumus Matematika");
            System.out.println("1.Rumus Bangun Datar");
            System.out.println("2.Rumus Bangun Ruang");
            System.out.println("3.Back to Home");
            System.out.print("Pilih Menu: ");
            int menu = scan.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("Pilih Rumus Bangun Datar");
                    System.out.println("1.Luas");
                    System.out.println("2.Keliling");
                    System.out.print("Pilih Menu: ");
                    menu = scan.nextInt();

                    if (menu == 1) {
                        Luas rumus = new Luas();
                        rumus.rumusLuas();
                    } else if (menu == 2) {
                        Keliling rumus = new Keliling();
                        rumus.rumusKeliling();
                    } else {
                        System.out.println("Harap Masukan Menu dengan Benar!");
                    }
                    break;
                case 2:
                    System.out.println("Pilih Rumus Bangun Ruang");
                    System.out.println("1.Luas Permukaan");
                    System.out.println("2.Volume");
                    System.out.print("Pilih Menu:");
                    menu = scan.nextInt();

                    if (menu == 1) {
                        LuasPermukaan rumus = new LuasPermukaan();
                        rumus.rumusLuasPermukaan();
                    } else if (menu == 2) {
                        Volume rumus = new Volume();
                        rumus.rumusVolume();
                    } else {
                        System.out.println("Harap Pilih Menu dengan Benar!");
                    }
                    break;
                case 3:
                    lanjut = false;
                    break;
            }
        }while (lanjut);

    }
}
