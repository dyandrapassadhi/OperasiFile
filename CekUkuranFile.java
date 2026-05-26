/*
Dyandra Naresuan Vaisaka Passadhi
255150707111030
Teknologi Informasi - B
*/

import java.io.File;
import java.util.Scanner;

public class CekUkuranFile {
    public static void main(String[] args) {
        var keyboard = new Scanner(System.in);
        System.out.print("Masukkan path file lengkap: ");
        var pathString = keyboard.nextLine();
        
        var file = new File(pathString);
        if (file.exists() && file.isFile()) {
            long bytes = file.length();
            double kiloBytes = bytes / 1024.0;
            double megaBytes = kiloBytes / 1024.0;

            if (bytes < 1048576) {
                System.out.printf("Ukuran file: %.2f KB\n", kiloBytes);
            } else {
                System.out.printf("Ukuran file: %.2f MB\n", megaBytes);
            }
        } else {
            System.out.println("File tidak ditemukan atau path salah!");
        }
    }
}