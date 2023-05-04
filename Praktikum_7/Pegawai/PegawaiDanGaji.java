/**
 * File      : PegawaiDanGaji.java		04/05/23
 * Penulis   : Fikri Baswara Andanawarih
 * Deskripsi : main dari pegawai dan gaji
 */

public class PegawaiDanGaji{
	public static void main(String[] args){
		Pegawai pegawai = new Programmer("Mira");
		Pegawai pegawai2 = new Manajer("Joko");
		Pegawai pegawai3 = new Manajer("Argo");
		
		Payroll payroll = new Payroll ();
		payroll.cetakGaji(pegawai);
		payroll.cetakGaji(pegawai2);
		payroll.cetakGaji(pegawai3);
	}
}
