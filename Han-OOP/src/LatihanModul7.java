/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Kuro
 */

class Barang1{
    private String kodeBarang,namaBarang;
    
    public Barang1(String kodeBarang, String namaBarang){
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
    }
    
    

    
    public String tampilBarang1(){
        return ("INPUT : \n" + "Kode Barang :\t" + kodeBarang + "\nNama Barang :\t" + namaBarang + "\n");
    }
}

class BukuGambar extends Barang1{
    private int HPP, hargaJual, stok, jumlahJual;
    
    public BukuGambar(String kodeBarang, String namaBarang, int HPP, int hargaJual, int stok, int jumlahJual){
        super(kodeBarang, namaBarang);
        
        this.HPP = HPP;
        this.hargaJual = hargaJual;
        this.stok = stok;
        this.jumlahJual = jumlahJual;
    }
    
    public String tampilHasilPenjualanBarang(){
        return(super.tampilBarang1() + "HPP : \t" + this.HPP + "\n" + "Harga Jual : \t"
                + this.hargaJual + "\n" + "Stok : \t" + this.stok +
                "\nJumlah Jual :\t" + this.jumlahJual + 
                "\nOUTPUT :\n" + "Stok Sekarang :\t" 
                + (this.stok -= this.jumlahJual) +
                "\nTotal Bayar :\t" + (this.jumlahJual * this.hargaJual) + 
                "\nLaba :\t" + ((this.jumlahJual * this.hargaJual) - (this.jumlahJual * this.HPP)) + 
                "\n");
    }
    
}

public class LatihanModul7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        BukuGambar coba = new BukuGambar("B001", "BUKU GAMBAR", 2500, 3000, 5, 2);
        
        System.out.println(coba.tampilHasilPenjualanBarang());
        
        
    }
    
}
