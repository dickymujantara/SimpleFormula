package fisika;

import java.util.Scanner;

public class Gerak {
    static int hasil;
    static void rumusGerak(){
        Scanner scan = new Scanner(System.in);
        int menu,x,y,z;
        boolean lanjut = true;

        do {
            System.out.println("===Pilih Rumus Gerak===");
            System.out.println("1.GlB");
            System.out.println("2.GlBB");
            System.out.println("3.Back");
            System.out.print("Pilih Menu: ");
            menu = scan.nextInt();
            switch (menu){
                case 1:
                    System.out.println("===Rumus GLB===");
                    System.out.println("1.Cari Kecepatan");
                    System.out.println("2.Cari Jarak");
                    System.out.println("3.Cari Waktu");
                    System.out.print("Pilih Menu: ");
                    menu = scan.nextInt();
                    if (menu == 1){
                        System.out.println("===Mencari Kecepatan===");
                        System.out.print("Masukan Jarak: ");
                        x = scan.nextInt();
                        System.out.print("Masukan Waktu: ");
                        y = scan.nextInt();
                        hasil = Gerak.glbKecepatan(x,y);
                        System.out.println("V = " + hasil + " m/s");
                    }else if (menu == 2){
                        System.out.println("===Mencari Jarak===");
                        System.out.print("Masukan Kecepatan: ");
                        x = scan.nextInt();
                        System.out.print("Masukan Waktu: ");
                        y = scan.nextInt();
                        hasil = Gerak.glbJarak(x,y);
                        System.out.println("s = " + hasil + " m");
                    }else if (menu == 3){
                        System.out.println("===Mencari Waktu===");
                        System.out.print("Masukan Kecepatan: ");
                        x = scan.nextInt();
                        System.out.print("Masukan Jarak: ");
                        y = scan.nextInt();
                        hasil = Gerak.glbWaktu(x,y);
                        System.out.println("t = " + hasil + " s");
                    }
                    break;
                case 2:
                    System.out.println("===Rumus GLBB===");
                    System.out.println("1.Kecepatan Akhir");
                    System.out.println("2.Kecepatan Akhir(vt2)");
                    System.out.println("3.Jarak Tempuh");
                    System.out.print("Pilih Menu: ");
                    menu = scan.nextInt();
                    if (menu == 1){
                        System.out.println("===Rumus Kecepatan Akhir===");
                        System.out.print("Masukan Kecepatan Awal: ");
                        x = scan.nextInt();
                        System.out.print("Masukan Percepatan: ");
                        y = scan.nextInt();
                        System.out.print("Masukan Waktu: ");
                        z = scan.nextInt();
                        hasil = glbbKecepatanAkhir(x,y,z);
                        System.out.println("Vt = " + hasil + " m/s");
                    }else if (menu == 2){
                        System.out.println("===Rumus Kecepatan Akhir(Vt2)===");
                        System.out.print("Kecepatan Awal: ");
                        x = scan.nextInt();
                        System.out.print("Percepatan: ");
                        y = scan.nextInt();
                        System.out.print("Masukan Waktu: ");
                        z = scan.nextInt();
                        hasil = glbbKecepatanAkhirVt2(x,y,z);
                        System.out.println("Vt2  = " + hasil + " m2/s");
                    }else if (menu == 3){
                        System.out.println("===Rumus Jarak Tempuh===");
                        System.out.print("Kecepatan Awal: ");
                        x = scan.nextInt();
                        System.out.print("Percepatan: ");
                        y = scan.nextInt();
                        System.out.print("Masukan Waktu: ");
                        z = scan.nextInt();
                        hasil = glbbJarakTempuh(x,y,z);
                        System.out.println("s = " + hasil + " m");
                    }
                    break;
                case 3:
                    lanjut = false;
                    break;
            }
        }while (lanjut);

    }

    static int glbKecepatan (int jarak, int waktu){
        hasil = jarak / waktu;

        return hasil;
    }

    static int glbJarak(int kecepatan, int waktu){
        hasil = kecepatan * waktu;

        return hasil;
    }

    static int glbWaktu(int kecepatan, int jarak){
        hasil = jarak / kecepatan;

        return hasil;
    }

    static int glbbKecepatanAkhir(int kecepatanAwal, int percepatan, int waktu){
        hasil = kecepatanAwal + percepatan * waktu;

        return hasil;
    }

    static int glbbKecepatanAkhirVt2(int kecepatanAwal, int percepatan, int waktu){
        hasil = kecepatanAwal + 2  * percepatan * waktu;

        return hasil;
    }

    static int glbbJarakTempuh(int kecepatanAwal, int waktu, int percepatan){
        hasil = (int) (kecepatanAwal * waktu + (percepatan * Math.pow(waktu,2))/2);

        return hasil;
    }


}
