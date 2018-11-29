package kimia;

import java.util.Scanner;

public class SifatKoligatifLarutan {
    static double hasil;
    static void rumusSifatKoligatifLarutan(){
        Scanner scan = new Scanner(System.in);
        int menu;
        double x=0, y=0, z=0;
        boolean lanjut = true;

        do {
            System.out.println("===Pilih Rumus Sifat Koligatif Larutan===");
            System.out.println("1.Penurunan Tekanan Uap");
            System.out.println("2.Kenaikan Titik Didih");
            System.out.println("3.Penurunan Titik Beku");
            System.out.println("4.Tekanan Osmotik");
            System.out.println("5.Back");
            System.out.print("Pilih Menu: ");
            menu = scan.nextInt();
            switch (menu){
                case 1:
                    System.out.println("===Rumus Penurunan Tekanan Uap===");
                    System.out.print("Masukan Xp: ");
                    x = scan.nextDouble();
                    System.out.print("Masukan P0: ");
                    y = scan.nextDouble();
                    hasil = tekananUap(x,y);
                    System.out.println("∆P = " + hasil );
                    break;
                case 2:
                    System.out.println("===Kenaikan Titik Didih===");
                    System.out.print("Masukan Tetapan Titik Didih: ");
                    x = scan.nextDouble();
                    System.out.print("Masukan Molalitas: ");
                    y = scan.nextDouble();
                    hasil = titikDidih(x,y);
                    System.out.println("∆Tb = " + hasil);
                    break;
                case 3:
                    System.out.println("===Kenaikan Titik Didih===");
                    System.out.print("Masukan Tetapan Titik Beku: ");
                    x = scan.nextDouble();
                    System.out.print("Masukan Molalitas: ");
                    y = scan.nextDouble();
                    hasil = titikBeku(x,y);
                    System.out.println("∆Tf = " + hasil);
                    break;
                case 4:
                    System.out.println("===Kenaikan Titik Didih===");
                    System.out.print("Masukan Molaritas: ");
                    x = scan.nextDouble();
                    System.out.print("Masukan Suhu(celcius): ");
                    y = scan.nextDouble();
                    hasil = tekananOsmotik(x,y);
                    System.out.println("π = " + hasil);
                    break;
                case 5:
                    lanjut = false;
                    break;
            }
        }while (lanjut);
    }

    static double tekananUap(double p0, double xp){
        double p = xp * p0;
        hasil = p0 - p;

        return hasil;
    }

    static double titikDidih(double kb , double m){
        hasil = kb * m;

        return hasil;
    }

    static double titikBeku(double kf, double m){
        hasil = kf * m;

        return hasil;
    }

    static double tekananOsmotik(double m, double t){
        hasil = m * 0.08205 * (t * 273);

        return hasil;
    }
}
