/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fi.jamk.TreeSetTest;

import fi.jamk.Register.Person;
import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author Greatmelons
 */
public class TreeSetTest {
    
    public static void main(String[] args) {
        
        TreeSet<Person> people = new TreeSet<>();
        
        Person person1 = new Person("Jesus", "Christ", "275023-213");
        Person person2 = new Person("Roger", "Moore", "297630-3487");
        Person person3 = new Person("Mickey", "Mouse", "769587-437");
        Person person4 = new Person("Baal", "Argmar", "236458723-413");
        Person person5 = new Person("Amanda", "Moore", "9742023-5684");
        Person person6 = new Person("Mickey", "Mouse", "769587-437");
        
        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);
        people.add(person5);
        people.add(person6);
        
        Iterator<Person> iterator = people.iterator();
        while(iterator.hasNext()) {
            System.out.print(((Person)(iterator.next())).getPerson()+ "\n");
        }
        System.out.println();
        
        if(people.isEmpty()) {
            System.out.print("Tree Set is empty, sorry.");
        }
        else {
            System.out.print("Tree Set size: " + people.size() + " ");
        }
        
    }
    
}
