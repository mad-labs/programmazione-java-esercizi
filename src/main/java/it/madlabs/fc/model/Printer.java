package it.madlabs.fc.model;

import static java.lang.System.out;

/**
 * Created by Matte on 30/06/2017.
 */
public class Printer {

    //Questo a cosa serve?
    Person person = new Person(); //questa è una variabile d'istanza: ogni oggetto printer che crei, conterrà un'oggetto Person nuovo.

    //Avevo detto che i metodi dovevano prendere come argomento un oggetto di tipo Person
    //questi metodo NON prendono parametri, quindi possono usare SOLO altri metodi o attributi interni alla classe
    public void printName(){
        System.out.println(person.getName());
    }
    public void printLastName(){
        System.out.println(person.getLastame());
    }

    //Questo è un metodo che prende come argomento un intero
    public void printInt(int anInt){ //questa a sinistra è la "firma" del metodo, dove viene definito tutto il necessario per usare questo metodo
        System.out.println("anInt: " + anInt);
    }
    //le parti del metodo sono:
    /*
    public <- questo si chiama modificatore, serve per dire a Java se le altre classi "vedono" questo metodo / attributo
           void <- questo è il tipo di ritorno, dice cosa viene ritornato dal metodo. In questo caso non torna niente
                printInt <- questo è il nome del metodo
                        (int anInt) <- questo sono i parametri, possono essere 0 o N. In questo caso è 1 e di tipo int
                                   { <- questo, fra parentesi graffe è il corpo del metodo. Viene eseguito quanto il medoto viene richiamato
        System.out.println("anInt: " + anInt);
    }

    Questo un esempio di utilizzo di un metodo:
    creo un oggetto (lo istanzio):
    Printer myPrinter = new Printer(); //uso il costruttore, la parola chiave new e metto l'oggetto (il puntamento all'oggetto) nella variabile myPrinter
    myPrinter.printInt(1); //uso la variabile appena creata per accedere al metodo, chiamandolo con il suo nome e passandogli il giusto argomento
    int myInt = 0;
    myPrinter.printInt(myInt); //il parametro può anche essere una variabile, che del tipo giusto, definito nella firma
     */

}
