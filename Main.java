import check.*;

class Main {
    public static void main(String[] args) {
        Kendaraan kendaraan1 = new Kendaraan("BL 3061 Oli", "motor");
        KarcisMasuk karcisMasuk = new KarcisMasuk();
        karcisMasuk.insertMasuk(kendaraan1);
        karcisMasuk.getKarcis();
        System.out.println("========= Proses Keluar ========= ");
        MesinKasir mesinKasir = new MesinKasir(kendaraan1, 9);
        System.out.println("Biaya Parkir : " + mesinKasir.hitungBiaya());
        mesinKasir.mobilBayar(15000);

        System.out.println("Kembalian : " + mesinKasir.bayarKembalian());
        mesinKasir.logout();
    }
}