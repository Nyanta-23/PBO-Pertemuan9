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


class bukuGambar extends barangBarang{
    
    public bukuGambar(String kodeBarang, String namaBarang, int HPP, int hargaJual, int stok, int jumlahJual){
        super(kodeBarang, namaBarang, HPP, hargaJual, stok, jumlahJual);
    }

}

class pensil extends barangBarang{
    
    public pensil(String kodeBarang, String namaBarang, int HPP, int hargaJual, int stok, int jumlahJual){
        super(kodeBarang, namaBarang, HPP, hargaJual, stok, jumlahJual);
    }

}

public class LatihanModul8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        barangBarang[] barang = new barangBarang[2];
        
        barang[0] = new bukuGambar("B001", "BUKU GAMBAR", 2500, 3000, 5, 2);
        barang[1] = new pensil("p002", "PENSIL 2B", 1500, 1750, 10, 1);
        
        for(int i = 0; i < barang.length; i++){
            System.out.println(barang[i].tampilinHasilPenjualanBarang());
            System.out.println("---------------------------------------------------");
        }
        
    }
    
}
