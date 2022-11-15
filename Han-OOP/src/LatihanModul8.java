/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Kuro
 */

class barangBarang{
    public String kodeBarangBarang, namabarangBarang;
    public int HPP, hargaJualBarang, stokBarang, jumlahJualBarang;
    
    public barangBarang(String kodeBarang, String namaBarang, int HPP, int hargaJual, int stok, int jumlahJual){
        this.kodeBarangBarang = kodeBarang;
        this.namabarangBarang = namaBarang;
        this.HPP = HPP;
        this.hargaJualBarang = hargaJual;
        this.stokBarang = stok;
        this.jumlahJualBarang = jumlahJual;
    }
    
    public String tampilinHasilPenjualanBarang(){
        return("INPUT :\n" +
                "Kode\t\t\t:" + this.kodeBarangBarang + 
                "\nNama\t\t\t:" + this.namabarangBarang + 
                "\nHPP\t\t\t:" + this.HPP + "\nHarga Jual\t\t:"
                + this.hargaJualBarang + "\n" + "Stok\t\t\t:" + this.stokBarang +
                "\nJumlah Jual\t\t:" + this.jumlahJualBarang + 
                "\nOUTPUT :\n" + "Stok Sekarang\t\t:" + (this.stokBarang -= this.jumlahJualBarang) +
                "\nTotal Bayar\t\t:" + (this.jumlahJualBarang * this.hargaJualBarang) + 
                "\nLaba\t\t\t:" + ((this.jumlahJualBarang * this.hargaJualBarang) - (this.jumlahJualBarang * this.HPP)) 
                + "\n");
    }
}


class barang extends barangBarang{
    
    public barang(String kodeBarang, String namaBarang, int HPP, int hargaJual, int stok, int jumlahJual){
        super(kodeBarang, namaBarang, HPP, hargaJual, stok, jumlahJual);
    }

}

public class LatihanModul8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        barangBarang[] brng = new barangBarang[2];
        
        brng[0] = new barang("B001", "BUKU GAMBAR", 2500, 3000, 5, 2);
        brng[1] = new barang("p002", "PENSIL 2B", 1500, 1750, 10, 1);
        
        for(int i = 0; i < brng.length; i++){
            System.out.println(brng[i].tampilinHasilPenjualanBarang());
            System.out.println("---------------------------------------------------");
        }
        
    }
    
}
