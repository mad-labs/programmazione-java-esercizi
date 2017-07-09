package it.madlabs.fc;

import it.madlabs.fc.model.Player;
import it.madlabs.fc.model.Printer;
import it.madlabs.fc.model.User;
import it.madlabs.fc.model.Util;

/**
 * Created by Matte on 30/06/2017.
 */
public class Main {
    public static void main(String[] args){
        Printer print = new Printer();
        Player player = new Player();
        User user = new User();
        Util util = new Util();

        Player player1 = new Player();
        player1.setName("Matteo");
        player1.setLastame("Manfredi");
        player1.setAverage(6);

        Player player2 = new Player();
        player2.setName("Gabriele");
        player2.setLastame("Manfredi");
        player2.setAverage(7);

        Player player3 = new Player();
        player3.setName("Francesco");
        player3.setLastame("Ilminchione");
        player3.setAverage(6);

        Player player4 = new Player();
        player4.setName("Davide");
        player4.setLastame("Scarpamarcia");
        player4.setAverage(4);

        Player player5 = new Player();
        player5.setName("Leonardo");
        player5.setLastame("Saltafossi");
        player5.setAverage(9);

        Player player6 = new Player();
        player6.setName("Leopoldo");
        player6.setLastame("Minchiaguaddi");
        player6.setAverage(8);

        User user1 = new User();
        user1.setUserName("Toroseduto");
        user1.setPassword("Ciao123");

        User user2 = new User();
        user2.setUserName("Toroinpe");
        user2.setPassword("Tavolo123");

        User user3 = new User();
        user3.setUserName("Torosaltellante");
        user3.setPassword("Banana123");




        String userName = util.askUserName("Enter your username :");

        /* Ho ragionato un po su for, ma in realtà non mi viene in mente nulla
        per poter controllare l'username e proseguire... in ogni caso dobbiamo
        parlarne in tempo reale, so che è colpa mia se ciò non è successo AHAHAHA :)
        ...cmq almeno mi chiarisci dei dubbi che ho...tutto sempre quando abbiamo voglia e tempoo
        chiaro!!!! Notte gab...o buongiornoo
         */












    }

}
