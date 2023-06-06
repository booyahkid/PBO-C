/**
 * File      : Lingkaran.java	  17/05/23
 * Penulis   : Fikri Baswara Andanawarih - 24060121140122
 * Deskripsi : Implementasi Lingkaran sebagai BangunDatar
 *
 */

public class Lingkaran extends BangunDatar{
    private double jejari;

    public Lingkaran(double jejari){
        this.jejari = jejari;
    }
    public double hitungKeliling(){
        return 2*jejari*3.14;
    }
}