package check;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class mesinKasir {
    private String idPegawai = "24";
    private Kendaraan kendaraan;
    private int durasi;
    public mesinKasir(Kendaraan kendaraan, int durasiKeluar){
        this.kendaraan = kendaraan;
        this.durasi = durasiKeluar;
    }

    public void readData() {
        DateTimeFormatter jamformat = DateTimeFormatter.ofPattern("HH:mm:ss");
        DateTimeFormatter tanggalFormat = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Id Pegawai : " + this.idPegawai);
        this.kendaraan.cekNoKendaraan();
        this.kendaraan.cekJenisKendaraan();
        System.out.println("Jam Keluar : " + jamformat.format(now.plusHours(this.durasi)));
        System.out.println("Tanggal Tanggal : " + tanggalFormat.format(now));
    }

    public void mobilBayar(int bayar){
        this.kendaraan.bayarBiaya(bayar);
    }

    public int hitungBiaya() {
        if (this.kendaraan.jenisKendaraan.toString() == "motor"){
            if (this.durasi < 5){
                return  2000;
            } else if (this.durasi >= 5 && this.durasi <= 10) {
                return  4000;
            } else {
                return 6000;
            }
        } else if (this.kendaraan.jenisKendaraan == "mobil") {
            if (this.durasi < 5){
                return  5000;
            } else if (this.durasi >= 5 && this.durasi <= 10) {
                return  7000;
            } else {
                return 10000;
            }
        } else {
            if (this.durasi < 5){
                return  3000;
            } else if (this.durasi >= 5 && this.durasi <= 10) {
                return  4000;
            } else {
                return 6000;
            }
        }
    }

    public int bayarKembalian() {
        return kendaraan.bayar - this.hitungBiaya();
    }


}
