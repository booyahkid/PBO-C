/**
 * File      : Kubus.java		15/03/23
 * Penulis   : Fikri Baswara Andanawarih
 * Deskripsi : Representasi dasar dari kubus
 */

package org.bangunruang;

import org.bangundatar.BujurSangkar;

public class Kubus {
	private BujurSangkar permukaan;
	
	public Kubus (BujurSangkar permukaan) {
		this.permukaan = permukaan;
	}
	
	public double hitungLuasAlas() {
		return this.permukaan.hitungLuas();
	}
	
	public double hitungVolume() {
		return this.hitungLuasAlas() * this.permukaan.getPanjangsisi();
	}
}	