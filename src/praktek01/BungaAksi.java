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
        
        Bunga Kertas = new Bunga();
        
        Kertas.nama = "Bunga Kertas";
        Kertas.iklim = "Tropis";
        Kertas.ukuran = "Kecil";
        Kertas.Warna_Kelopak = "Ungu";
        Kertas.Jumlah_Kelopak = 3;
        Kertas.Jenis_Kelamin = "Putik";
        
        Kertas.CaraKawin();
    }
}
