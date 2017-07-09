package it.madlabs.fc.model;

import java.util.Scanner;

/**
 * Created by Matte on 05/07/2017.
 */
public class Util {


    Scanner scanner = new Scanner(System.in);

    public String askUserName(String message) {
        System.out.println("> " + message);
        System.out.println("< ");
        return scanner.nextLine();
    }
}
