/**
 * File      : Pegawai.java		04/05/23
 * Penulis   : Fikri Baswara Andanawarih
 * Deskripsi : representasi dari pegawai
 */

public class Pegawai{
    private String nama;
    private int gajiPokok = 5000000;

    public void setNama(String nama){
        this.nama = nama;
    }

    public void tampilData(){
        System.out.println("Nama = " + nama + ", Gaji Pokok = " + gajiPokok);
    }
}







