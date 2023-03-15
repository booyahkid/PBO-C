/**
 * File      : BujurSangkar.java		15/03/23
 * Penulis   : Fikri Baswara Andanawarih
 * Deskripsi : Representasi dasar dari BujurSangkar
 */

package org.bangundatar;

import org.poligon.Poligon;

public class BujurSangkar extends Poligon {
	private double panjangSisi;
	
	public BujurSangkar(double panjangSisi) {
		this.panjangSisi = panjangSisi;
		this.jumlahSisi = 4;
	}
	
	public double hitungLuas() {
		return this.panjangSisi * this.panjangSisi;
	}
	
	public double getPanjangsisi() {
		return this.panjangSisi;
	}
}