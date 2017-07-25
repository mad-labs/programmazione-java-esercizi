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

        User[] utentiSalvati = {user1 , user2 , user3};




        String nomeCercato = util.askUserName("Enter your username : ");
        for (User utenteSalvatoCorrente : utentiSalvati) {
            if (nomeCercato.equals(utenteSalvatoCorrente.getUserName())) {
                User utenteTrovato = new User();
                utenteTrovato = utenteSalvatoCorrente;
                break;
            }
            else {
                System.out.println("This Username is inexistent");
            }

            }
        String password = util.askPassword("Enter your password : ");
        if (password.equals(this.utenteTrovato.getPassword())) {
            System.out.println("Good");
        }











    }

}
