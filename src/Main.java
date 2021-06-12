import java.net.SocketOption;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        String namaDepan = "Renata";
        String namaTengah = "Febriana";
        String namaBelakang ="Jacom";

        int usia = 20;
        int targetTahunKuliah =4;
        double ipk = 3.999;
        char nilaiAbjad ='A';
        boolean Cantik = true;

        System.out.println(namaDepan + namaTengah + namaBelakang);

        char[] uniskaChar = {'U','N','I','S','K','A'};
        String uniskaString = new String(uniskaChar);
        System.out.println(uniskaString);

        String namaLengkap = namaDepan + " " + namaTengah + " " + namaBelakang;
        System.out.println(namaLengkap.length());
        System.out.println(namaLengkap.indexOf("NIS"));
        System.out.println(namaLengkap.substring(5));
        System.out.println(namaLengkap.substring(5,12));
        System.out.println(namaLengkap.replace("Ren", "Barr")) ;
        System.out.println(namaLengkap.toUpperCase());
        System.out.println(namaLengkap.toLowerCase());
        System.out.println(namaLengkap.charAt(6));

        String[] namaArray = namaLengkap.split(" ");
        for (String nama : namaArray){
            System.out.println(nama);
        }

    }
}
