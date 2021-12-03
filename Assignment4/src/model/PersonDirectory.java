package model;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bhuva
 */
public class PersonDirectory {
    protected ArrayList<Person> person = new ArrayList();
    
    public PersonDirectory(){
        this.person = new ArrayList<Person>();
    }

    public ArrayList<Person> getPerson() {
        return person;
    }

    public void setPerson(ArrayList<Person> person) {
        this.person = person;
    }
    
    public Person addNewPersonDetails(){
        Person addPersonDetails = new Person();
        person.add(addPersonDetails);
        return addPersonDetails;
    }
    
    public void deletePersonDetails(Person pr){
        person.remove(pr);
    }
   
    
}
