/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
class Sepeda_Motor{
    private String merk, tipe;
    private int tangki;
    private long harga;
    
    public void inputMerk(String merk){
        this.merk = merk;
    }
    
    public void inputTipe(String tipe){
        this.tipe = tipe;
    }
    
    public void inputTangki(int tangki){
        this.tangki = tangki;
    }
    
    public void inputHarga(long harga){
        this.harga = harga;
    }
    
    public String tampilMerk(){
        return merk;
    }
    
    public String tampilTipe(){
        return tipe;
    }
    
    public int tampilTangki(){
        return tangki;
    }
    
    public long tampilHarga(){
        return harga;
    }


   
}

public class SepedaMotor_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Sepeda_Motor motor = new Sepeda_Motor();
    
    motor.inputMerk("Yamaha");
    motor.inputTipe("MX - 125cc");
    motor.inputTangki(4);
    motor.inputHarga(15000000);
    
    System.out.println("Rincian Motor : ");
    System.out.println("Merk : " + motor.tampilMerk());
    System.out.println("Rincian Motor : " + motor.tampilTipe());
    System.out.println("Rincian Motor : " + motor.tampilTangki());
    System.out.println("Rincian Motor : " + motor.tampilHarga());
    
    
    }
    
}
