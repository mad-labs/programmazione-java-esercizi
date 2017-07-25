package it.madlabs.fc.model;

import static java.lang.System.out;

/**
 * Created by Matte on 30/06/2017.
 */
public class Printer {

    Person person = new Person();
    Player player = new Player();


    public void printName(Person person){
        System.out.println(person.getName());
    }

    public void printLastName(Person person){
        System.out.println(person.getLastame());
    }

    public void printAverage(Person person){System.out.println(player.getAverage());
    }





}
