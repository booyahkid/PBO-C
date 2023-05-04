/**
* File      : Car.java		04/05/23
* Penulis   : Fikri Baswara Andanawarih
* Deskripsi : representasi dari car
*/

public class Car extends Vehicle{
    void calRent(int jarak, float harga){
        float fare = jarak * harga;
        fare -= 100.00f;
        System.out.println("Harga sewa mobil = " + fare);
    }
}
