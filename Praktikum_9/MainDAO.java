/**
 * File      : MainDAO.java   31/05/23
 * Penulis   : Fikri Baswara Andanawarih - 24060121140122
 * Deskripsi : Main program untuk akses DAO
 *
 */

public class MainDAO{
    public static void main(String args[]){
        Person person = new Person("Indra");
        DAOManager m = new DAOManager();
        m.setPersonDAO(new MySQLPersonDAO());
        try{
            m.getPersonDAO().savePerson(person);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}