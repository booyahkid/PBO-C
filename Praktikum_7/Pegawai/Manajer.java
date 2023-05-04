/**
* File      : Manajer.java		04/05/23
* Penulis   : Fikri Baswara Andanawarih
* Deskripsi : representasi dari Manajer
*/

public class Manajer extends Pegawai{
    private int tunjangan = 700000;

    public Manajer(String nama){
        super.setNama(nama);
    }

    public void tampilData(){
        super.tampilData();
        System.out.println("Tunjangan = " + tunjangan + "\n");
    }
}
