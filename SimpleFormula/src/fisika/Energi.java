package fisika;

import java.util.Scanner;

public class Energi {
    static int hasil;
    static void rumusEnergi(){
        Scanner scan = new Scanner(System.in);
        int menu,x,y;
        boolean lanjut = true;
        do {
            System.out.println("===Pilih Rumus Energi===");
            System.out.println("1.Rumus Energi Mekanik");
            System.out.println("2.Rumus Energi Potensial");
            System.out.println("3.Rumus Energi Kinetik");
            System.out.println("4.Back");
            System.out.print("Pilih Menu: ");
            menu = scan.nextInt();

            switch (menu){
                case 1:
                    System.out.println("===Rumus Energi Mekanik===");
                    System.out.print("Masukan Energi Potensial: ");
                    x = scan.nextInt();
                    System.out.print("Masukan Energi Kinetik: ");
                    y = scan.nextInt();
                    hasil = energiMekanik(x,y);
                    System.out.println("Em = " + hasil +  " Joule");
                    break;
                case 2:
                    System.out.println("===Rumus Energi Potensial===");
                    System.out.print("Masukan Massa: ");
                    x = scan.nextInt();
                    System.out.print("Masukan Tinggi: ");
                    y = scan.nextInt();
                    hasil = energiPotensial(x,y);
                    System.out.println("Ep = " + hasil + " Joule");
                    break;
                case 3:
                    System.out.println("Pilih Rumus Energi Kinetik");
                    System.out.println("1.Energi Kinetik");
                    System.out.println("2.Energi Kinetik Pegas");
                    System.out.print("Pilih Menu: ");
                    menu = scan.nextInt();
                    if (menu == 1){
                        System.out.println("===Rumus Energi Kinetik===");
                        System.out.print("Masukan Massa: ");
                        x = scan.nextInt();
                        System.out.print("Masukan Kecepatan: ");
                        y = scan.nextInt();
                        hasil = energiKinetik(x,y);
                        System.out.println("Ek = " + hasil + " Joule");
                    }else if (menu == 2){
                        System.out.println("===Rumus Energi Kinetik Pegas===");
                        System.out.print("Masukan Kostanta Pegas: ");
                        x = scan.nextInt();
                        System.out.print("Masukan Perpanjangan Pegas: ");
                        y = scan.nextInt();
                        hasil = energiKinetikPegas(x,y);
                        System.out.println("Ek = " + hasil + " Joule");
                    }
                    break;
                case 4:
                    lanjut = false;
                    break;
            }
        }while (lanjut);

    }

    static int energiMekanik(int energiPotensial, int energiKinetik){
        hasil = energiPotensial + energiKinetik;

        return hasil;
    }

    static int energiPotensial(int massa, int tinggi){
        hasil = massa * 10 * tinggi;

        return hasil;
    }

    static int energiKinetik(int massa, int kecepatan){
        hasil = ((int) (massa * Math.pow(kecepatan,2))/2);

        return hasil;
    }

    static int energiKinetikPegas(int kostantaPegas, int perpanjanganPegas){
        hasil = ((int) (kostantaPegas * Math.pow(perpanjanganPegas,2))/2);

        return hasil;
    }
}
