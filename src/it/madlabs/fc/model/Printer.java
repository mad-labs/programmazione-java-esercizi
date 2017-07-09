package it.madlabs.fc.model;

import static java.lang.System.out;

/**
 * Created by Matte on 30/06/2017.
 */
public class Printer {
    Person person = new Person();

    public void printName(){
        System.out.println(person.getName());
    }
    public void printLastName(){
        System.out.println(person.getLastame());
    }


}
