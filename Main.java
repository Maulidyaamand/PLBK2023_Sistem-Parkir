import check.*;

class Main {
    public static void main(String[] args) {
        Kendaraan kendaraan1 = new Kendaraan("BL 1234 AB", "motor");
        karcisMasuk karcisMasuk = new karcisMasuk();
        karcisMasuk.insertMasuk(kendaraan1);
        karcisMasuk.getKarcis();
        System.out.println("========= Proses Keluar ========= ");
        mesinKasir mesinKasir = new mesinKasir(kendaraan1, 9);
        System.out.println("Biaya Parkir : " + mesinKasir.hitungBiaya());
        mesinKasir.mobilBayar(10000);

        System.out.println("Kembalian : " + mesinKasir.bayarKembalian());
        mesinKasir.logout();
    }
}