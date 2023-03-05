package check;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class karcisMasuk implements checkIn {
    private Kendaraan kendaraan;
    private String jamMasuk;
    private String tanggalMasuk;

    Palang palang = new Palang();
    DateTimeFormatter jamformat = DateTimeFormatter.ofPattern("HH:mm:ss");
    DateTimeFormatter tanggalFormat = DateTimeFormatter.ofPattern("yyyy/MM/dd");
    LocalDateTime now = LocalDateTime.now();

    public void insertMasuk(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
        this.jamMasuk = jamformat.format(now);
        this.tanggalMasuk = tanggalFormat.format(now);
        palang.Close();
        kameraDigital kameraDigital = new kameraDigital(kendaraan);
        kameraDigital.getPicture();
        kameraDigital.inputDataToPC(jamformat.format(now), tanggalFormat.format(now));
    }

    @Override
    public void getKarcis() {
        System.out.println("=============== Karcis ===============");
        System.out.println("Nomor Kendaraan : " + this.kendaraan.cekNoKendaraan());
        System.out.println("Jenis Kendaraan : " + this.kendaraan.cekJenisKendaraan());
        System.out.println("Jam Masuk : " + this.jamMasuk);
        System.out.println("Tanggal Masuk : " + this.tanggalMasuk);
        System.out.println("=============== Karcis ===============");
        palang.Open();

    }
}
