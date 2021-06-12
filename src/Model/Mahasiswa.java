package Model;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Mahasiswa {
    String npm;
    String nama;
    Date tanggalLahir;

    public Mahasiswa(String npm, String nama, Date tanggalLahir) {
        this.npm = npm;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
    }

    public Mahasiswa() {
    }

    void menyapa() {
        System.out.println("Hai nama ku : " + this.nama);
    }

    void tampilkanAtribut() {
        String polaTanggal = "dd-MM-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(polaTanggal);

        System.out.println("Nama \t\t\t : " + this.nama);
        System.out.println("NPM \t\t\t  : " + this.npm);
        System.out.println("tanggalLahir \t : " + simpleDateFormat.format(this.tanggalLahir));
    }
        int hitungUsia () {
            Calendar tanggalLahir = Calendar.getInstance();
            tanggalLahir.setTime(this.tanggalLahir);
            Calendar hariIni = Calendar.getInstance();

            int selisihTahun = hariIni.get(Calendar.YEAR) - tanggalLahir.get(Calendar.YEAR);

            if (hariIni.get(Calendar.MONTH) < tanggalLahir.get(Calendar.MONTH)) {
                selisihTahun--;


            } else {
                if (hariIni.get(Calendar.MONTH) == tanggalLahir.get(Calendar.MONTH)
                        && hariIni.get(Calendar.DAY_OF_MONTH) < tanggalLahir.get(Calendar.DAY_OF_MONTH)) {
                    selisihTahun--;
                }
            }
            return selisihTahun;
        }




    }

