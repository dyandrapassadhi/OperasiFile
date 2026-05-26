/*
Dyandra Naresuan Vaisaka Passadhi
255150707111030
Teknologi Informasi - B
*/

import java.io.File;

public class HapusDirektoriIsi {
    public static void main(String[] args) {
        var file = new File("test.txt");

        if (file.exists()) {
            var result = file.delete();
        
            System.out.println((result ? "Berhasil" : "Gagal") + " menghapus file");
        } else {
            System.out.println("File tidak ada");
        }
    }
}