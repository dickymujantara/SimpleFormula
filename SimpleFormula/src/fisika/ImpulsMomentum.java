package fisika;

import java.util.Scanner;

public class ImpulsMomentum {
    static int hasil;
    static void rumusImpulsMomentum(){
        Scanner scan = new Scanner(System.in);
        int menu,x,y,z;
        boolean lanjut = true;
        do {
            System.out.println("===Pilih Rumus Gerak===");
            System.out.println("1.Momentum");
            System.out.println("2.Impuls");
            System.out.println("3.Back");
            System.out.print("Pilih Menu: ");
            menu = scan.nextInt();
            switch (menu){
                case 1:
                    System.out.println("===Rumus Momentum===");
                    System.out.println("1.Momentum");
                    System.out.println("2.Perubahan Momentum");
                    System.out.println("3.Back");
                    System.out.print("Pilih Menu: ");
                    menu = scan.nextInt();
                    if (menu == 1){
                        System.out.println("===Rumus Momentum===");
                        System.out.print("Masukan Massa: ");
                        x = scan.nextInt();
                        System.out.print("Masukan Kecepatan: ");
                        y = scan.nextInt();
                        hasil = momentum(x,y);
                        System.out.println("P = " + hasil + " kg m/s");
                        break;
                    }else if(menu == 2){
                        System.out.println("===Rumus Perubahan Momentum===");
                        System.out.print("Masukan Massa: ");
                        x = scan.nextInt();
                        System.out.print("Masukan Kecepatan Awal: ");
                        y = scan.nextInt();
                        System.out.print("Masukan Kecepatan Akhir: ");
                        z = scan.nextInt();
                        hasil = perubahanMomentum(x,y,z);
                        System.out.println("Perubahan P = " + hasil + " kg m/s");
                        break;
                    }
                    break;
                case 2:
                    System.out.println("===Rumus Impuls===");
                    System.out.print("Masukan Gaya: ");
                    x = scan.nextInt();
                    System.out.print("Masukan Selang Waktu: ");
                    y = scan.nextInt();
                    hasil = impuls(x,y);
                    System.out.println("I = " + hasil + " kg m/s");
                    break;
                case 3:
                    lanjut = false;
                    break;
            }
        }while (lanjut);

    }

    static int momentum(int massa, int kecepatan){
        hasil = massa * kecepatan;

        return hasil;
    }

    static int perubahanMomentum(int massa, int kecepatanAwal, int kecepatanAkhir){
        hasil = (massa*kecepatanAkhir) - (massa*kecepatanAwal);

        return hasil;
    }

    static int impuls(int gaya, int selangWaktu){
        hasil = gaya * selangWaktu;

        return hasil;
    }
}
