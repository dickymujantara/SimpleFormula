package matematika;

import java.util.Scanner;

public class LuasPermukaan {
    static  int hasil;

    static void rumusLuasPermukaan(){
        Scanner scan = new Scanner(System.in);
        int menu, x=0, y=0, z=0;
        boolean lanjut = true;

        do {
            System.out.println("===Pilih Rumus Luas Permukaan===");
            System.out.println("1.Luas Permukaan Kubus");
            System.out.println("2.Luas Permukaan Balok");
            System.out.println("3.Luas Permukaan Tabung");
            System.out.println("4.Luas Permukaan Kerucut");
            System.out.println("5.Luas Permukaan Bola");
            System.out.println("6.Back");
            System.out.print("Pilih Menu: ");
            menu = scan.nextInt();

            switch (menu){
                case 1:
                    System.out.println("===Rumus Luas Permukaan Kubus===");
                    System.out.print("Masukan Sisi: ");
                    x = scan.nextInt();
                    hasil = luasPermukaanKubus(x);
                    System.out.println("Luas Permukaan = " + hasil + " m2");
                    break;
                case 2:
                    System.out.println("===Rumus Luas Permuakaan Balok===");
                    System.out.print("Masukan Panjang: ");
                    x = scan.nextInt();
                    System.out.print("Masukan Lebar: ");
                    y = scan.nextInt();
                    System.out.print("Masukan Tinggi: ");
                    z = scan.nextInt();
                    hasil = luasPermukaanBalok(x,y,z);
                    System.out.println("Luas Permukaan = " + hasil + " m2");
                    break;
                case 3:
                    System.out.println("===Rumus Luas Permukaan Tabung===");
                    System.out.print("Masukan Jari-jari: ");
                    x = scan.nextInt();
                    System.out.print("Masukan Tinggi: ");
                    y = scan.nextInt();
                    hasil = luasPermukaanTabung(x,y);
                    System.out.println("Luas Permukaan = " + hasil + " m2");
                    break;
                case 4:
                    System.out.println("===Rumus Luas Permukaan Kerucut===");
                    System.out.print("Masukan Jari-jari: ");
                    x = scan.nextInt();
                    System.out.print("Masukan Panjang Garis Lukis: ");
                    y = scan.nextInt();
                    hasil = luasPermukaanKerucut(x,y);
                    System.out.println("Luas Permukaan = " + hasil + " m2");
                    break;
                case 5:
                    System.out.println("===Rumus Luas Permukaan Bola===");
                    System.out.print("Masukan Jari-jari: ");
                    x = scan.nextInt();
                    hasil = luasPermukaanBola(x);
                    System.out.println("Luas Permukaan: " + hasil + " m2");
                    break;
                case 6:
                    lanjut = false;
                    break;
            }
        }while (lanjut);

    }

    static int luasPermukaanKubus(int sisi){
        hasil = (int) (6 * Math.pow(sisi,2));

        return hasil;
    }

    static int luasPermukaanBalok(int panjang, int lebar, int tinggi){
        hasil = 2 * ((panjang * lebar) + (lebar * tinggi) + (panjang * tinggi));

        return hasil;
    }

    static int luasPermukaanTabung(int jariJari, int tinggi){
        hasil = (int) ((2 * 3.14 * jariJari) * (jariJari + tinggi));

        return hasil;
    }

    static int luasPermukaanKerucut(int jariJari, int panjagGaris){
        hasil = (int) (3.14 * jariJari * (jariJari + panjagGaris));

        return hasil;
    }

    static int luasPermukaanBola(int jariJari){
        hasil = (int) (4 * 3.14 * Math.pow(jariJari,2));

        return hasil;
    }
}
