package check;

public class Kendaraan{
    private String noKendaraan;
    public String jenisKendaraan;
    public int bayar;
    public Kendaraan(String noKendaraan, String jenisKendaraan){
        this.noKendaraan = noKendaraan;
        this.jenisKendaraan = jenisKendaraan;
    }

    public String cekJenisKendaraan() {
      return "Jenis Kendaraan adalah " + jenisKendaraan;
    }

    public String cekNoKendaraan() {
        return "Nomor Kendaraan adalah " + noKendaraan;
    }


    public void bayarBiaya(int biaya) {
         this.bayar = biaya;
    }


}
