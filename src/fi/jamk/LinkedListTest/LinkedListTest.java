/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fi.jamk.LinkedListTest;

import fi.jamk.Register.Person;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 *
 * @author h3090
 */
public class LinkedListTest {
    
    public static void main(String[] args) {
    
    LinkedList<Person> people = new LinkedList<>();
    
    Person person1 = new Person("Jesus", "Christ", "275023-213");
    Person person2 = new Person("Roger", "Moore", "297630-3487");
    Person person3 = new Person("Mickey", "Mouse", "769587-437");
    Person person4 = new Person("Baal", "Argmar", "236458723-413");
    Person person5 = new Person("No", "More", "9742023-5684");
    
    people.add(person1);
    people.add(person2);
    people.add(person3);
    people.add(person4);
    people.add(person5);
    
    ListIterator iterator = people.listIterator();
    
    while(iterator.hasNext()) {
        System.out.println(((Person)(iterator.next())).getPerson());
        }
    while(iterator.hasPrevious()) {
        System.out.println(((Person)(iterator.previous())).getPerson());
        }
    }
}    
