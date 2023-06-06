/**
 * File      : LambdaMap.java   31/05/23
 * Penulis   : Fikri Baswara Andanawarih - 24060121140122
 * Deskripsi : pengelola DAO dalam program
 *
 */

public class DAOManager{
    private PersonDAO personDAO;

    public void setPersonDAO(PersonDAO person){
        personDAO = person;
    }

    public PersonDAO getPersonDAO(){
        return personDAO;
    }
}