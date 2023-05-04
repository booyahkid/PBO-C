/**
 * File      : Vehicle.java		04/05/23
 * Penulis   : Fikri Baswara Andanawarih
 * Deskripsi : Vehicle
 */

public class Vehicle{
    void calRent(int distance, float price) {
        float fare = distance * price;
        System.out.println("Vehicle price = " + fare);
    }
}
