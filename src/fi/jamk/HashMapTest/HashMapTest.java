/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fi.jamk.HashMapTest;

import fi.jamk.Register.Person;
import java.util.HashMap;
import java.util.TreeMap;

/**
 *
 * @author Greatmelons
 */
public class HashMapTest {
    
    public static void main(String[] args) {
        
        HashMap people = new HashMap();
        
        Person person1 = new Person("Jesus", "Christ", "275023-213");
        Person person2 = new Person("Roger", "Moore", "297630-3487");
        Person person3 = new Person("Mickey", "Mouse", "769587-437");
        Person person4 = new Person("Baal", "Argmar", "236458723-413");
        Person person5 = new Person("No", "More", "9742023-5684");
        
        people.put(person1.getSsn(), person1);
        people.put(person2.getSsn(), person2);
        people.put(person3.getSsn(), person3);
        people.put(person4.getSsn(), person4);
        people.put(person5.getSsn(), person5);
        
        System.out.println("Printing one person using their key: " + ((Person)(people.get("769587-437"))).getPerson());
        
        System.out.println("\nWhole Hash Map using keyset:");
        for (Object key: people.keySet()) {
            System.out.println(((Person)(people.get(key))).getPerson());
        }
        
        //Same thing as above but with TreeMap instead of HashMap
        /*TreeMap people = new TreeMap();
        
        Person person1 = new Person("Jesus", "Christ", "275023-213");
        Person person2 = new Person("Roger", "Moore", "297630-3487");
        Person person3 = new Person("Mickey", "Mouse", "769587-437");
        Person person4 = new Person("Baal", "Argmar", "236458723-413");
        Person person5 = new Person("No", "More", "9742023-5684");
        
        people.put(person1.getSsn(), person1);
        people.put(person2.getSsn(), person2);
        people.put(person3.getSsn(), person3);
        people.put(person4.getSsn(), person4);
        people.put(person5.getSsn(), person5);
        
        System.out.println("Printing one person using their key: " + ((Person)(people.get("769587-437"))).getPerson());
        
        System.out.println("\nWhole Tree Map using keyset:");
        for (Object key: people.keySet()) {
            System.out.println(((Person)(people.get(key))).getPerson());
        }*/

    }
    
}
