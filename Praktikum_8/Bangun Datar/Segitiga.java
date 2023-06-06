/**
 * File      : Segitiga.java	  17/05/23
 * Penulis   : Fikri Baswara Andanawarih - 24060121140122
 * Deskripsi : Implementasi segitiga sebagai BangunDatar
 *
 */

public class Segitiga extends BangunDatar{
    private double sisi;

    public Segitiga(double sisi){
        this.sisi = sisi;
    }
    public double hitungKeliling(){
        return sisi*3;
    }
}