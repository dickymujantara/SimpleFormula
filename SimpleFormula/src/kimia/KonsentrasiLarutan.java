package kimia;

import java.util.Scanner;

public class KonsentrasiLarutan {
    static double hasil;
    static void rumusKonsentrasiLarutan(){
        Scanner scan = new Scanner(System.in);
        int menu;
        boolean lanjut = true;
        double x=0, y=0, z=0;

        do {
            System.out.println("===Pilih Rumus Kosentrasi Larutan===");
            System.out.println("1.Molalitas");
            System.out.println("2.Molaritas");
            System.out.println("3.Fraksi Mol");
            System.out.println("4.Back");
            System.out.print("Pilih Menu: ");
            menu = scan.nextInt();
            switch (menu){
                case 1:
                    System.out.println("===Rumus Molalitas===");
                    System.out.print("Masukan Massa Terlarut(gram): ");
                    x = scan.nextDouble();
                    System.out.print("Masukan MR Terlarut: ");
                    y = scan.nextDouble();
                    System.out.print("Masukan Massa Pelarut(gram): ");
                    z = scan.nextDouble();
                    hasil = molalitas(x,y,z);
                    System.out.println("Molalitas = " + hasil);
                    break;
                case 2:
                    System.out.println("===Rumus Molaritas===");
                    System.out.print("Masukan Massa Terlarut(gram): ");
                    x = scan.nextDouble();
                    System.out.print("Masukan MR Terlarut: ");
                    y = scan.nextDouble();
                    System.out.print("Masukan Volume Pelarut(ml): ");
                    z = scan.nextDouble();
                    hasil = molaritas(x,y,z);
                    System.out.println("Molaritas = " + hasil);
                    break;
                case 3:
                    System.out.println("===Rumus Fraksi Mol===");
                    System.out.println("1.Rumus Xt");
                    System.out.println("2.Rumus Xp");
                    System.out.print("Pilih Menu: ");
                    menu = scan.nextInt();
                    if (menu == 1){
                        System.out.println("===Rumus Xt===");
                        System.out.print("Masukan nt: ");
                        x = scan.nextDouble();
                        System.out.print("Masukan np: ");
                        y = scan.nextDouble();
                        hasil = fraksiMolXt(x,y);
                        System.out.println("Xt = " + hasil);
                    }else if (menu == 2){
                        System.out.println("===Rumus Xp===");
                        System.out.print("Masukan nt: ");
                        x = scan.nextDouble();
                        System.out.print("Masukan np: ");
                        y = scan.nextDouble();
                        hasil = fraksiMolXp(x,y);
                        System.out.println("Xp = " + hasil);
                    }
                    break;
                case 4:
                    lanjut = false;
                    break;
            }
        }while (lanjut);
    }

    static double molalitas(double massaTerlarut, double mrTerlarut, double massaPelarut){
        hasil = (massaTerlarut/mrTerlarut) * (1000 / massaPelarut);

        return hasil;
    }

    static double molaritas(double massaTerlarut, double mrTerlarut, double volumeLarutan){
        hasil = (massaTerlarut/mrTerlarut) * (1000 / volumeLarutan);

        return hasil;
    }

    static double fraksiMolXt(double nt, double np){
        hasil = nt / (nt+np);

        return hasil;
    }

    static double fraksiMolXp(double nt, double np){
        hasil = np / (nt+np);

        return hasil;
    }
}
