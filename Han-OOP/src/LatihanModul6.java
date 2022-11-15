/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Kuro
 */

import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;


class barangs{
    private String kodeBarang,namaBarang;
    private int hargaJual, stok, HPP, jumlahJual;
    
    void input(String kodeBarang, String namaBarang, int HPP, int hargaJual, int stok){
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.HPP = HPP;
        this.hargaJual = hargaJual;
        this.stok = stok;
        
        System.out.println("Kode Barang : " + this.kodeBarang);
        System.out.println("Nama Barang : " + this.namaBarang);
        System.out.println("HPP : " + this.HPP);
        System.out.println("Harga Jual : " + this.hargaJual);
        System.out.println("Stok : " + this.stok);
    }
    
    void pembelian(int jumlah){
        if(this.stok - jumlah > 0){
            this.jumlahJual += jumlah;
            this.stok -= this.jumlahJual;
            System.out.println("Jumlah jual : " + this.jumlahJual);
        } else{
            System.out.println("Jumlah Jual: "+ this.jumlahJual);
        }
    }
    
    void profit(){
        int laba = (this.jumlahJual * this.hargaJual) - (this.HPP * this.jumlahJual);

        System.out.println("Stok Sekarang : " + this.stok);
        System.out.println("Total Bayar : " + this.jumlahJual * this.hargaJual);
        System.out.println("Laba : " + laba);
    }   
}




public class LatihanModul6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        barangs brng = new barangs();
        
        System.out.println("INPUT:");
        brng.input( JOptionPane.showInputDialog("Masukkan Kode"),
                    JOptionPane.showInputDialog("Masukkan Nama Barang"),
                    parseInt(JOptionPane.showInputDialog("Masukkan HPP")),
                    parseInt(JOptionPane.showInputDialog("Masukkan Harga Jual")),
                    parseInt(JOptionPane.showInputDialog("Masukkan Stok"))
        );
        
        brng.pembelian(parseInt(JOptionPane.showInputDialog("Masukkan Jumlah Beli : ")));
        System.out.println("OUTPUT:");
        
        brng.profit();
    }
}
