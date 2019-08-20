package praktikum.pkg1;

import static java.sql.DriverManager.println;

public class Datadiri {
    public static void main(String[] args){ 
        // membuat variabel
        String nama,alamat,kelas,hobby,goldar;
        int usia;
        double tinggi;
        
        
        // mengisi variabel
        nama = "In'amy Fadlyyah Takariyanti";
        alamat = "Perumnas Tasikmadu Tuban";
        kelas = ("x RPL 2");
        hobby = "makan";
        usia = 16;
        tinggi = 164.6;
        goldar  = "O" ;
        
        //mencetak ke layar isi variabel
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Kelas: " +kelas);
        System.out.println("Hobby:" +hobby);
        System.out.println("Usia: " + usia + "tahun");
        System.out.println("tinggi: " + tinggi + "cm");
        System.out.println("Darah: " + goldar + "ini darahku" );
        
        
    }
}