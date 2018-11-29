package matematika;

import java.util.Scanner;

public class Luas {
    static void rumusLuas(){
        Scanner scan = new Scanner(System.in);
        int menu, x=0, y=0,z=0;
        int hasil;
        boolean lanjut = true;

        do {
            System.out.println("===Pilih Rumus Luas===");
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

            Luas rumus = new Luas();

            switch (menu){
                case 1:
                    System.out.println("===Rumus Luas Persegi===");
                    System.out.print("Masukan Sisi: ");
                    x = scan.nextInt();
                    hasil = rumus.luasPersegi(x);
                    System.out.println("Luas = " + hasil + " m2");
                    break;
                case 2:
                    System.out.println("===Rumus Luas Persegi Panjang===");
                    System.out.print("Masukan Panjang: ");
                    x = scan.nextInt();
                    System.out.print("Masukan Lebar: ");
                    y = scan.nextInt();
                    hasil = rumus.luasPersegiPanjang(x,y);
                    System.out.println("Luas = " + hasil);
                    break;
                case 3:
                    System.out.println("===Rumus Luas Segitiga===");
                    System.out.print("Masukan Alas: ");
                    x = scan.nextInt();
                    System.out.print("Masukan Tinggi: ");
                    y = scan.nextInt();
                    hasil = rumus.luasSegitiga(x,y);
                    System.out.println("Luas =  " + hasil + " m2");
                    break;
                case 4:
                    System.out.println("===Rumus Luas Jajargenjang===");
                    System.out.print("Masukan Alas: ");
                    x = scan.nextInt();
                    System.out.print("Masukan Tinggi: ");
                    y = scan.nextInt();
                    hasil = rumus.luasJajargenjang(x,y);
                    System.out.println("Luas = " + hasil + " m2");
                    break;
                case 5:
                    System.out.println("===Rumus Luas Trapesium===");
                    System.out.print("Masukan Sisi Atas: ");
                    x = scan.nextInt();
                    System.out.print("Masukan Sisi Bawah: ");
                    y = scan.nextInt();
                    System.out.print("Masukan Tinggi:");
                    z = scan.nextInt();
                    hasil = rumus.luasTrapesium(x,y,z);
                    System.out.println("Luas = " + hasil + " m2");
                    break;
                case 6:
                    System.out.println("===Rumus Luas Layang-layang===");
                    System.out.print("Masukan Diagonal ke-1: ");
                    x = scan.nextInt();
                    System.out.print("Masukan Diagonal ke-2: ");
                    y = scan.nextInt();
                    hasil = rumus.luasLayangLayang(x,y);
                    System.out.println("Luas = " + hasil + " m2");
                    break;
                case 7:
                    System.out.println("Rumus Luas Belah Ketupat===");
                    System.out.print("Masukan Diagonal: ");
                    x = scan.nextInt();
                    hasil = rumus.luasBelahKetupat(x);
                    System.out.println("Luas = " + hasil + " m2");
                    break;
                case 8:
                    lanjut = false;
                    break;
            }
        }while (lanjut);

    }

    static int luasPersegi(int sisi){
        int hasil =  sisi * sisi;

        return hasil;
    }

    static int luasPersegiPanjang(int panjang, int lebar){
        int hasil = panjang * lebar;

        return hasil;
    }

    static int luasSegitiga(int alas, int tinggi){
        int hasil = (alas*tinggi)/2;

        return hasil;
    }

    static int luasJajargenjang(int alas, int tinggi){
        int hasil = alas * tinggi;

        return hasil;
    }

    static int luasTrapesium(int a, int b, int tinggi){
        int hasil = ((a+b) * tinggi)/2;

        return hasil;
    }

    static int luasLayangLayang(int d1, int d2){
        int hasil = (d1*d2)/2;

        return hasil;
    }

    static int luasBelahKetupat(int diagonal){
        int hasil = diagonal * diagonal;

        return hasil;
    }
}
