package matematika;

import java.util.Scanner;

public class Volume {
    static int hasil;
    static void rumusVolume(){
        Scanner scan = new Scanner(System.in);
        int menu, x=0, y=0, z=0;
        boolean lanjut = true;

        do {
            System.out.println("===Pilih Rumus Volume===");
            System.out.println("1.Volume Kubus");
            System.out.println("2.Volume Balok");
            System.out.println("3.Volume Tabung");
            System.out.println("4.Volume Kerucut");
            System.out.println("5.Volume Bola");
            System.out.println("6.Back");
            System.out.print("Pilih Menu: ");
            menu = scan.nextInt();
            switch (menu){
                case 1:
                    System.out.println("===Rumus Volume Kubus===");
                    System.out.print("Masukan Sisi: ");
                    x = scan.nextInt();
                    hasil = volumeKubus(x);
                    System.out.println("Volume = " + hasil + " m3");
                    break;
                case 2:
                    System.out.println("===Rumus Volume Balok===");
                    System.out.print("Masukan Panjang: ");
                    x = scan.nextInt();
                    System.out.print("Masukan Lebar: ");
                    y = scan.nextInt();
                    System.out.print("Masukan Tinggi: ");
                    z = scan.nextInt();
                    hasil = volumeBalok(x,y,z);
                    System.out.println("Volume = " + hasil + " m3");
                    break;
                case 3:
                    System.out.println("===Rumus Volume Tabung===");
                    System.out.print("Masukan Jari-Jari: ");
                    x = scan.nextInt();
                    System.out.print("Masukan Tinggi: ");
                    y = scan.nextInt();
                    hasil = volumeTabung(x,y);
                    System.out.println("Volume = " + hasil + " m3");
                    break;
                case 4:
                    System.out.println("===Rumus Volume Kerucut===");
                    System.out.print("Masukan Jari-jari: ");
                    x = scan.nextInt();
                    System.out.print("Masukan Tinggi: ");
                    y = scan.nextInt();
                    hasil = volumeKerucut(x,y);
                    System.out.println("Volume = " + hasil + " m3");
                    break;
                case 5:
                    System.out.println("===Rumus Volume Bola===");
                    System.out.print("Masukan Jari-Jari: ");
                    x = scan.nextInt();
                    hasil = volumeBola(x);
                    System.out.println("Volume = " + hasil + " m3");
                    break;
                case 6:
                    lanjut = false;
                    break;
            }
        }while (lanjut);


    }

    static int volumeKubus(int sisi){
        hasil =(int) Math.pow(sisi,3);

        return hasil;
    }

    static int volumeBalok(int panjang, int lebar, int tinggi){
        hasil = panjang * lebar * tinggi;

        return hasil;
    }

    static int volumeTabung(int jariJari, int tinggi){
        hasil = ((int) (3.14 * Math.pow(jariJari,2) * tinggi));

        return hasil;
    }

    static int volumeKerucut(int jariJari, int  tinggi){
        hasil = ((int) (3.14 *  Math.pow(jariJari,2) * tinggi)/3);

        return hasil;
    }

    static int volumeBola(int jariJari){
        hasil = ((int) (3.14 * Math.pow(jariJari,3) * 4) / 3);

        return hasil;
    }
}
