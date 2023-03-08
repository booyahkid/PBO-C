/**
 * File      : Poligon.java		02/04/23
 * Penulis   : Fikri Baswara Andanawarih
 * Deskripsi : drive class untuk poligon, persegi panjang, dan segitiga
 */

package org.main;

import org.bangundatar.*;

public class MPoligon{
    public static void main(String[] args) {
        PersegiPanjang persegi = new PersegiPanjang(10, 10, 4);
        persegi.printInfo();
        System.out.println("Luas Persegi Panjang : " +persegi.hitungLuas());
		
		Segitiga segitiga = new Segitiga(10, 10, 3);
		segitiga.printInfo();
		System.out.println("Luas segitiga : " +segitiga.hitungLuas());
    }
}