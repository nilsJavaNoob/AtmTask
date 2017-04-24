package runner;

import atm.Atm;
import bills.cards.Card;

/**
 * Created by n on 03.04.17.
 */
public class Runner {
    public static void main(String[] args) {

        Atm atm = new Atm();
        Card card = new Card(1000);
        atm.insertCard(card);
        atm.getMoney(3000);
        atm.showBalans();
        atm.reject();
        Card card2 = new Card(500);
        atm.insertCard(card2);
        atm.getMoney(2000);
        atm.showBalans();
        atm.insertCard(card);
        atm.getMoney(200);
        atm.reject();


    }
}
