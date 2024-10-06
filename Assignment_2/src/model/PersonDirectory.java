/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author ayushighia
 */
public class PersonDirectory {

    
    
    private ArrayList<Person> person;
    public PersonDirectory() {
       
        this.person = new ArrayList <Person>();
   }
    
    public ArrayList<Person> getPerson() {
        return person;
    }
     
    public void setPerson(ArrayList<Person> account)  {
       this.person= person;
    }
    
    public Person addPerson(){
       Person a = new Person();
       person.add(a);
       return a;
    
    }
    public void deletePerson(Person person){
        person.remove(person);
    }
    
    public Person searchPerson (String email){
    
        for(Person a:person){
            if(a.getEmail().contains(email)){
                return a;
            }
        
        }
    
    return null;
    }
    
}


    
    

