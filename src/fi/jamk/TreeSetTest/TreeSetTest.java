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
                
        people.add(new Person("Jesus", "Christ", "275023-213"));
        people.add(new Person("Roger", "Moore", "297630-3487"));
        people.add(new Person("Mickey", "Mouse", "769587-437"));
        people.add(new Person("Baal", "Argmar", "236458723-413"));
        people.add(new Person("Amanda", "Moore", "9742023-5684"));
        people.add(new Person("Mickey", "Mouse", "769587-437"));
        
        Iterator<Person> iterator = people.iterator();
        while(iterator.hasNext()) {
            System.out.print(((Person)(iterator.next())).getPerson()+ "\n");
        }
        System.out.println();
        
        if(people.isEmpty()) {
            System.out.printf("Tree Set is empty, sorry.");
        }
        else {
            System.out.printf("Tree Set size: %d ", people.size());
        }
        
    }
    
}
