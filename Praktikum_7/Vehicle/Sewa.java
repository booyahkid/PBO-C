/**
 * File      : Sewa.java		03/05/23
 * Penulis   : Fikri Baswara Andanawarih
 * Deskripsi : Main dari vehicle
 */

public class Sewa {
	public static void main(String[] args){
		Vehicle kendaraan = new Vehicle();
		Vehicle mobil =  new Car();
		Vehicle bis =  new Bus();
		kendaraan.calRent(50, 1000);
		mobil.calRent(50, 1000);

	}
}
