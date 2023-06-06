/**
 * File      : BangunDatarGeneric.java	  17/05/23
 * Penulis   : Fikri Baswara Andanawarih - 24060121140122
 * Deskripsi : Kelas intruksi generic untuk BangunDatar
 *
 */

public class BangunDatarGeneric<T extends BangunDatar> {
    private T bangunDatar;

    public void set(T tipeBangunDatar){
        bangunDatar = tipeBangunDatar;
    }

    public T get(){
        return bangunDatar;
    }

    public double hitungKeliling(){
        return bangunDatar.hitungKeliling();
    }
}