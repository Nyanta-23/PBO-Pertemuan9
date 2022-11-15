/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
import javax.swing.*;

class segitiga{
    String alas,tinggi;


    public void input(){
        alas = JOptionPane.showInputDialog("Masukkan Angka Alas : ");
        tinggi = JOptionPane.showInputDialog("Masukkan Angka Tinggi : ");
    }

    public double hitung(){
        long a = Long.parseLong(alas);
        long t = Long.parseLong(tinggi);
        return (0.5*a*t);
    }

    public void hasil(){
        JOptionPane.showMessageDialog(null,"0.5" + " * "+ alas + " * " +  tinggi + " = " +hitung());
    };
}

public class LatihanModul5_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        segitiga hitungSegitiga = new segitiga();
        
        hitungSegitiga.input();
        hitungSegitiga.hasil();
    }
    
}
