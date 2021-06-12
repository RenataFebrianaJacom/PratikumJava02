package Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;



public class MahasiswaBeraksi {

    public MahasiswaBeraksi() {
    }

    public static void main(String[] args) throws ParseException {


        String polaTanggal = "dd-MM-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(polaTanggal);



        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.npm = "19630453";
        mahasiswa.nama = "Renata Febriana Jacom";
        mahasiswa.tanggalLahir = simpleDateFormat.parse(" 21-02-2001");

        mahasiswa.tampilkanAtribut();
        mahasiswa.menyapa();


        System.out.println("Nama \t\t\t : " + mahasiswa.nama);
        System.out.println("NPM \t\t\t  : " + mahasiswa.npm);
        System.out.println("tanggalLahir \t : " + mahasiswa.tanggalLahir);

        Mahasiswa  mahasiswa2 = new Mahasiswa();
        mahasiswa2.npm = "1963045";
        mahasiswa2.nama = "Renata Jacom";
        mahasiswa2.tanggalLahir = simpleDateFormat.parse(" 22-02-2002");

        System.out.println("Nama \t\t\t : " + mahasiswa2.nama);
        System.out.println("NPM \t\t\t  : " + mahasiswa2.npm);
        System.out.println("tanggalLahir \t : " + simpleDateFormat.format(mahasiswa2.tanggalLahir));




    }
    }
