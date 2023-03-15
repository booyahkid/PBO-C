/**
 * File      : MKubus.java		15/03/23
 * Penulis   : Fikri Baswara Andanawarih
 * Deskripsi : Main dari Kubus (praktikum 4)
 */

package org.main;

import org.bangundatar.*;

import org.bangunruang.*;


public class MKubus{
    public static void main(String[] args) {
        BujurSangkar bujursangkar = new BujurSangkar(4);
		Kubus kubus = new Kubus(bujursangkar);
		
		System.out.println("Volume Kubus : " +kubus.hitungVolume());
		System.out.println("Luas Alas : " +kubus.hitungLuasAlas());		
    }
}