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

    
    
    private ArrayList<Person> persons;
    private ArrayList<Address> addresses;
    public PersonDirectory() {
       
        this.persons = new ArrayList <Person>();
        this.addresses= new ArrayList<Address>();
   }
    
    public ArrayList<Person> getPerson() {
        return persons;
    }
     
    public void setPerson(ArrayList<Person> person)  {
       this.persons= person;
    }
    
    public Person addPerson(){
       Person a = new Person();
       persons.add(a);
       return a;
    
    }
    public void deletePerson(Person person){
        persons.remove(person);
    }
    
   
    
    
        public Person searchPerson(String search){
        for (Person p:persons){
            Address add = p.getHomeAddress();
            if(p.getFirstName().contains(search) || p.getLastName().contains(search) ||
               add.gethStreet().contains(search) || String.valueOf(add.gethUnitNum()).contains(search) || add.gethCity().contains(search) || add.gethState().contains(search) || String.valueOf(add.gethZipCode()).contains(search) || String.valueOf(add.gethPhone()).contains(search)){
                return p;
        }
     
    }



        
    
    
    
    return null;
    }
    
   public Person searchPersonByEmail(String email) {
    PersonDirectory personDirectory = new PersonDirectory();
    for (Person p : personDirectory.getPerson()) {
        if (p.getEmail().equals(email)) {
            return p;
        }
    }
    

    return null;  // Return null if no person is found
}

    
  
    
    public ArrayList<Address> getAddress() {
        return addresses;
    }
     
    public void setAddress(ArrayList<Address> address)  {
       this.addresses= address;
    }
    
    public Address addAddress(){
       Address a = new Address();
       addresses.add(a);
       return a;
    
    }
    public void deleteAddress(Address address){
        addresses.remove(address);
    }
    
    public Address searchAddress(Double phoneNum){
    
        for(Address a:addresses){
            if(a.gethPhone()==phoneNum){
                return a;
            }
        
        }
    
    return null;
    }
    
    
}


    
    

