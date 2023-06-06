/**
 * File      : LambdaMap.java   31/05/23
 * Penulis   : Fikri Baswara Andanawarih - 24060121140122
 * Deskripsi : Implementasi PersonDAO untuk MySQL
 *
 */

import java.sql.*;

public class MySQLPersonDAO implements PersonDAO{
    public void savePerson(Person person) throws Exception {
        String name = person.getName();

        //membuat koneksi, nama db, user, pass
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/pbo","root","");

        //kerjakan mysql query
        String query = "INSERT INTO person(name) VALUES ('"+name+"')";
        System.out.println(query);
        Statement s =con.createStatement();
        s.executeUpdate(query);

        //tutup koneksi database
        con.close();
    }
}
