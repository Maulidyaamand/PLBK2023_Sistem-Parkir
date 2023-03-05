import check.*;

class Main {
    public static void main(String[] args) {
        Kendaraan kendaraan1 = new Kendaraan("BL 1234 AB", "motor");
        karcisMasuk karcisMasuk = new karcisMasuk();
        karcisMasuk.insertMasuk(kendaraan1);
        karcisMasuk.getKarcis();

        mesinKasir mesinKasir = new mesinKasir(kendaraan1, 9);
        mesinKasir.readData();
        System.out.println("Biaya Parkir : " + mesinKasir.hitungBiaya());
        mesinKasir.mobilBayar(10000);
        System.out.println("Kembalian : " + mesinKasir.bayarKembalian());
    }
}