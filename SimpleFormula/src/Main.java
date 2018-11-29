import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import matematika.Matematika;
import kimia.Kimia;
import fisika.Fisika;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean lanjut = true;
        int menu;

        for (int i = 0; i < 3; i++) {
            System.out.print("Masukan Password: ");
            String password = scan.next();
            String encrypt = encryptionPass(password);
            if (encrypt.equals("yhjnxjuvgrpbssrr")){
                locale();
                do {
                    System.out.println("======SELAMAT DATANG======");
                    System.out.println("===Kumpulan Rumus-Rumus===");
                    System.out.println("Pilih Mapel");
                    System.out.println("1.Matematika");
                    System.out.println("2.Fisika");
                    System.out.println("3.Kimia");
                    System.out.println("4.EXIT");
                    System.out.print("Pilih Menu: ");
                    menu = scan.nextInt();
                    switch (menu){
                        case 1:
                          Matematika.RumusMatematika();
                           break;
                        case 2:
                            Fisika.rumusFisika();
                            break;
                        case 3:
                            Kimia.rumusKimia();
                            break;
                        case 4:
                            System.out.println("Terima Kasih ^-^");
                            lanjut = false;
                    }
                } while (lanjut);
                break;
            }else {
                if(i == 2){
                    System.out.println("Anda Sudah Memasukan Password salah Sebanyak 3 kali!");
                }else{
                    System.out.println("Harap Masukan Password Dengan Benar!");
                }
            }
        }
    }

    static void locale(){
        boolean berhenti = true;
        do {
            Scanner scan = new Scanner(System.in);
            Date tgl = new Date();
            int lang;
            System.out.println("1.Indonesian");
            System.out.println("2.English");
            System.out.println("3.Belgium");
            System.out.println("4.Switzterland");
            System.out.println("5.Argentina");
            System.out.print("Pilih Menu: ");
            lang = scan.nextInt();

            switch (lang){
                case 1:
                    Locale bahasa = new Locale("id", "ID");
                    DateFormat tanggalIn = new SimpleDateFormat("EEEE-dd-mm-yy", bahasa);
                    DateFormat waktuIn = new SimpleDateFormat("HH:mm:ss");
                    System.out.println(tanggalIn.format(tgl) + " " + waktuIn.format(tgl));
                    break;
                case 2:
                    Locale eng = new Locale("en", "EN");
                    DateFormat tanggalEn = new SimpleDateFormat("EEEE-dd-mm-yy",eng);
                    DateFormat waktuEn = new SimpleDateFormat("HH:mm:ss");
                    System.out.println(tanggalEn.format(tgl) + " " + waktuEn.format(tgl));
                    break;
                case 3:
                    Locale be = new Locale("nl", "BE");
                    DateFormat tanggalJp = new SimpleDateFormat("EEEE-dd-mm-yy",be);
                    DateFormat waktuJp = new SimpleDateFormat("HH:mm:ss");
                    System.out.println(tanggalJp.format(tgl) + " " + waktuJp.format(tgl));
                    break;
                case 4:
                    Locale ch = new Locale("de", "CH");
                    DateFormat tanggalSa = new SimpleDateFormat("EEEE-dd-mm-yy",ch);
                    DateFormat waktuSa = new SimpleDateFormat("HH:mm:ss");
                    System.out.println(tanggalSa.format(tgl) + " " + waktuSa.format(tgl));
                    break;
                case 5:
                    Locale ar = new Locale("es", "AR");
                    DateFormat tanggalTh = new SimpleDateFormat("EEEE-dd-mm-yy",ar);
                    DateFormat waktuTh = new SimpleDateFormat("HH:mm:ss");
                    System.out.println(tanggalTh.format(tgl) + " " + waktuTh.format(tgl));
                    break;
            }
        }while (berhenti = false);
    }

    static String encryptionPass(String pass){
        char[] password = pass.toCharArray();
        for (int i = 0; i < password.length ; i++) {
            char kata = password[i];

            if (kata >= 'a' && kata <= 'z'){
                if (kata > 'm'){
                    kata -= 13;
                }else{
                    kata +=13;
                }
            }
            password[i] = kata;
        }
        return new String(password);
    }
}
