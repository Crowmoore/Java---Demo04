/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fi.jamk.Register;

/**
 *
 * @author h3090
 */
public class RegisterTest {
    
    public static final void main(String[] args) {
        
        Register register = new Register();
        
        Person person1 = new Person("Michael", "Jackson", "123431-463");
        
        if (register.addPerson(person1)) {
            System.out.println("Added a person!");
        }
        else {
            System.out.println("Could not add person!");
        }
        Person person2 = new Person("John", "Doe", "3632254-643");
        
        if (register.addPerson(person2)) {
            System.out.println("Added a person!");
        }
        else {
            System.out.println("Could not add person!");
        }
        System.out.println("Register contents:");
        for (int i= 0; i < register.getPeopleCount(); i++) {
            Person person = register.getPerson(i);
            System.out.println(person.getPerson());
        }
            
        String ssn = "4356334-532";
        System.out.println("Try to find person using ssn: " + ssn);
        Person person = register.findPerson(ssn);
        if (person != null) {
            System.out.println(person.getPerson());
        }
        else {
            System.out.println("Could not find person with ssn: " + ssn);
        }
    }

}
