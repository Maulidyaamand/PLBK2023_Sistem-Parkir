package check;

import java.io.*;

public class kameraDigital {
    private Kendaraan kendaraan;

    public kameraDigital(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }

    public void getPicture(){
        System.out.println("Gambar Berhasil diambil. No Kendaraan : " + this.kendaraan.cekNoKendaraan());
    }

    public void inputDataToPC(String jam, String tanggal){
        try {
            FileWriter myWriter = new FileWriter("db/database.txt", true);
            PrintWriter printWriter = new PrintWriter(myWriter);
            printWriter.println("No Kendaraan " + this.kendaraan.cekNoKendaraan() + " Masuk pada : " + jam + " "+ tanggal);
            printWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
