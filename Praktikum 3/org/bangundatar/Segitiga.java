/**
 * File      : Poligon.java		02/04/23
 * Penulis   : Fikri Baswara Andanawarih
 * Deskripsi : Representasi dasar dari objek segitiga, turunan kelas poligon
 */

package org.bangundatar;

import org.poligon.Poligon;

public class Segitiga extends Poligon{
    private double alas, tinggi;

    public Segitiga (double alas, double tinggi, int jumlahSisi) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.jumlahSisi = jumlahSisi;
    } 

    public double hitungLuas() {
        return alas * tinggi / 2;
    }

    public void printInfo() {
        System.out.println("Bangun Segitiga bersisi " +this.getJumlahSisi());
    }
    
}