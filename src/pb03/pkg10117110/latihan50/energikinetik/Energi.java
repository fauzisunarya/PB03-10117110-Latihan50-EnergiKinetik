
package pb03.pkg10117110.latihan50.energikinetik;


public class Energi {
    private int kecepatan;
    private double massa;

    public double getMassa() {
        return massa;
    }

    public void setMassa(double massa) {
        this.massa = massa;
    }

    public int getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(int kecepatan) {
        this.kecepatan = kecepatan;
    }
    public double hitungEnergiKinetik(){
        return 0.5*massa*(kecepatan*kecepatan);
        
    }
    /* karena dimulai dalam keadaan diem maka kecepatan nya menjadi nol*/
    public double hitungUsaha(){
        return 0.5*massa*(kecepatan*kecepatan) - 0.5*massa*(0*0);
        
    }
    
}
