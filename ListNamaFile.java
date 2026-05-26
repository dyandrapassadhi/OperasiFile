/*
Dyandra Naresuan Vaisaka Passadhi
255150707111030
Teknologi Informasi - B
*/

import java.io.File;
import java.util.Scanner;

public class ListNamaFile {
    public static void main(String[] args) {
        var keyboard = new Scanner(System.in);
        System.out.print("Masukkan path direktori: ");
        var pathString = keyboard.nextLine();
        
        var folder = new File(pathString);
        if (folder.exists() && folder.isDirectory()) {
            String[] daftarFile = folder.list();
            
            if (daftarFile != null && daftarFile.length > 0) {
                System.out.println("\n--- Daftar File di Direktori ---");
                for (String nama : daftarFile) {
                    System.out.println(nama);
                }
            } else {
                System.out.println("Direktori kosong.");
            }
        } else {
            System.out.println("Direktori tidak ditemukan atau path tersebut bukan folder!");
        }
    }
}