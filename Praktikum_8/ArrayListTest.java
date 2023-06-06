import java.util.ArrayList;

/**
 * File      : ArrayListTest.java  17/05/23
 * Penulis   : Fikri Baswara Andanawarih - 24060121140122
 * Deskripsi : Program penggunaan objek ArrayList sebagai Collection class
 *
 */

public class ArrayListTest{
    public static void main(String[] args) {

        ArrayList<String> strings = new ArrayList<String>();
        strings.add("praktikum");
        strings.add("collection");
        strings.add("dan generics");
        
        strings.remove("praktikum");

        for (String s : strings) {
            System.out.print(s + " ");
        }
    }
}

