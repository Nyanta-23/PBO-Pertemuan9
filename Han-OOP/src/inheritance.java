/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Kuro
 */

class Pelajar{
    private String nama;
    private long tinggi, berat;
    
    public Pelajar(String nama, long tinggi, long berat){
        this.nama = nama;
        this.tinggi = tinggi;
        this.berat = berat;
    }
    
    public String tampilPelajar(){
        return ("Nama\t: " + nama + "\nTinggi\t: " + tinggi + "\nBerat\t: " + berat + "\n");
    }
}

class Siswa extends Pelajar{
    private String nim, asalSekolah;
    private long nilai;
    public Siswa(String nama, long tinggi, long berat, String nim, String asalSekolah, long nilai){
        super(nama, tinggi, berat);
        this.nim = nim;
        this.asalSekolah = asalSekolah;
        this.nilai = nilai;
    }
    
    public String tampilSiswa(){
        return (super.tampilPelajar() + "nim\t: " + nim + "\nAsal Sekolah\t " + asalSekolah + "\nNilai\t: " + nilai);
    }
}

public class inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Siswa ti = new Siswa("Ahmad", 180, 78, "1390192", "SMK Informatika", 90);
        System.out.println(ti.tampilSiswa());
    }
    
}
