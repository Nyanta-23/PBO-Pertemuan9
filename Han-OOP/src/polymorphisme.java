/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Kuro
 */
class Manusia{
    public String nama, hobby, pekerjaan;
    
    public Manusia(String nm, String hobby, String kerja){
        this.nama = nm;
        this.hobby = hobby;
        this.pekerjaan = kerja;
    }
    
    public String tampilManusia(){
        return("Nama\t\t:" + nama + "\n" + "Hobby\t\t:" + hobby + "\n" + 
                "Pekerjaan\t:" + pekerjaan + "\n");
    }
    
}

class programmer extends Manusia{
    public programmer(String nm, String hobby, String kerja){
        super(nm, hobby, kerja);
    }
}

class polisi extends Manusia{
    public polisi(String nm, String hobby, String kerja){
        super(nm, hobby, kerja);
    }
}

public class polymorphisme {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Manusia[] informasi =  new Manusia[2];
        
        informasi[0] = new programmer("Programmer", "Futsal", "Mengetik Sintak");
        informasi[1] = new polisi("Polisi", "Fusal", "Operasi Keliling");
        
        for(int i = 0; i < informasi.length; i++){
            System.out.println("------------------------");
            System.out.println(informasi[i].tampilManusia());
        }
    }
    
}
