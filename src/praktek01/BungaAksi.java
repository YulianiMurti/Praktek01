/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktek01;

/**
 *
 * @author ASUS
 */
public class BungaAksi {
    public static void main(String[] args) {
        Bunga Sepatu = new Bunga();
        Bunga Kertas = new Bunga();
        Bunga Melati = new Bunga();
        
        Sepatu.nama = "Kembang Sepatu";
        Sepatu.iklim = "Tropis";
        Sepatu.ukuran = "Sedang";
        Sepatu.Warna_Kelopak = "Merah";
        Sepatu.Jumlah_Kelopak = 5;
        Sepatu.Jenis_Kelamin = "Benang Sari";
        
        Sepatu.nama = "Bunga Kertas";
        Sepatu.iklim = "Tropis";
        Sepatu.ukuran = "Kecil";
        Sepatu.Warna_Kelopak = "Ungu";
        Sepatu.Jumlah_Kelopak = 3;
        Sepatu.Jenis_Kelamin = "Putik";
        
        Sepatu.nama = "Bunga Melati";
        Sepatu.iklim = "Tropis";
        Sepatu.ukuran = "Kecil";
        Sepatu.Warna_Kelopak = "Putih";
        Sepatu.Jumlah_Kelopak = -+9;
        Sepatu.Jenis_Kelamin = "Kepala Putik";
        
        Sepatu.CaraKawin();
        Kertas.CaraKawin();
        Melati.CaraKawin();
    }
}
