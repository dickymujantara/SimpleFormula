package matematika;

import java.util.Scanner;

public class Keliling {

    static void rumusKeliling(){
        Scanner scan = new Scanner(System.in);
        int menu, w=0,x=0, y=0,z=0;
        int hasil;
        boolean lanjut = true;


        Keliling rumus = new Keliling();

        do {
            System.out.println("===Pilih Rumus Keliling===");
            System.out.println("1.Persegi");
            System.out.println("2.Persegi Panjang");
            System.out.println("3.Segitiga");
            System.out.println("4.Jajargenjang");
            System.out.println("5.Trapesium");
            System.out.println("6.Layang-layang");
            System.out.println("7.Belah Ketupat");
            System.out.println("8.Back");
            System.out.print("Masukan Menu: ");
            menu = scan.nextInt();
            switch (menu){
                case 1:
                    System.out.println("===Rumus Keliling Persegi===");
                    System.out.print("Masukan Sisi: ");
                    x = scan.nextInt();
                    hasil = rumus.kelilingPersegi(x);
                    System.out.println("Keliling = " + hasil + " m");
                    break;
                case 2:
                    System.out.println("===Rumus Keliling Persegi Panjang===");
                    System.out.print("Masukan Panjang: ");
                    x = scan.nextInt();
                    System.out.println("Masukan Lebar: ");
                    y = scan.nextInt();
                    hasil = rumus.kelilingPersegiPanjang(x,y);
                    System.out.println("Keliling = " + hasil + " m");
                    break;
                case 3:
                    System.out.println("===Rumus Keliling Segitiga===");
                    System.out.print("Masukan Alas: ");
                    x = scan.nextInt();
                    System.out.print("Masukan Tinggi: ");
                    y = scan.nextInt();
                    System.out.print("Masukan Sisi Miring: ");
                    z = scan.nextInt();
                    hasil = rumus.kelilingSegitiga(x,y,z);
                    System.out.println("Keliling =  " + hasil + " m");
                    break;
                case 4:
                    System.out.println("===Rumus Keliling Jajargenjang===");
                    System.out.print("Masukan Sisi AB: ");
                    w = scan.nextInt();
                    System.out.print("Masukan Sisi BC: ");
                    x = scan.nextInt();
                    System.out.print("Masukan Sisi CD: ");
                    y = scan.nextInt();
                    System.out.print("Masukan Sisi AD: ");
                    z = scan.nextInt();
                    hasil = rumus.kelilingJajargenjang(w,x,y,z);
                    System.out.println("Keliling = " + hasil + " m");
                    break;
                case 5:
                    System.out.println("===Rumus Keliling Trapesium===");
                    System.out.print("Masukan Sisi AB: ");
                    w = scan.nextInt();
                    System.out.print("Masukan Sisi BC: ");
                    x = scan.nextInt();
                    System.out.print("Masukan Sisi CD: ");
                    y = scan.nextInt();
                    System.out.print("Masukan Sisi AD: ");
                    z = scan.nextInt();
                    hasil = rumus.kelilingTrapesium(w,x,y,z);
                    System.out.println("Keliling = " + hasil + " m");
                    break;
                case 6:
                    System.out.println("===Rumus Keliling Layang-layang===");
                    System.out.print("Masukan Sisi ke-1: ");
                    x = scan.nextInt();
                    System.out.print("Masukan Sisi ke-2: ");
                    y = scan.nextInt();
                    hasil = rumus.kelilingLayangLayang(x,y);
                    System.out.println("Keliling = " + hasil + " m");
                    break;
                case 7:
                    System.out.println("Rumus Luas Belah Ketupat===");
                    System.out.print("Masukan Sisi: ");
                    x = scan.nextInt();
                    hasil = rumus.kelilingBelahKetupat(x);
                    System.out.println("Keliling = " + hasil + " m");
                    break;
                case 8:
                    lanjut = false;
                    break;
            }
        }while (lanjut);

    }

    static int kelilingPersegi(int sisi){
        int hasil =  4 * sisi;

        return hasil;
    }

    static int kelilingPersegiPanjang(int panjang, int lebar){
        int hasil = (panjang + lebar) * 2;

        return hasil;
    }

    static int kelilingSegitiga(int tinggi, int alas, int sisiMiring){
        int hasil = tinggi + alas + sisiMiring;

        return hasil;
    }

    static int kelilingJajargenjang(int sisi1, int sisi2, int sisi3, int sisi4){
        int hasil = sisi1 + sisi2 + sisi3 + sisi4;

        return hasil;
    }

    static int kelilingTrapesium(int sisi1, int sisi2, int sisi3, int sisi4 ){
        int hasil = sisi1 + sisi2 + sisi3 + sisi4;

        return hasil;
    }

    static int kelilingLayangLayang(int sisi1, int sisi2){
        int hasil = 2 * (sisi1 + sisi2);

        return hasil;
    }

    static int kelilingBelahKetupat(int sisi){
        int hasil = 4 * sisi;

        return hasil;
    }
}
