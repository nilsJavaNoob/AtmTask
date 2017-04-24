package atm;

/**
 * Created by n on 03.04.17.
 */
public class Runner {
    public static void main(String[] args) {
        Card card = new Card(1000);
        Atm atm = new Atm();
        atm.insertCard(card);
        atm.getMoney(300);
        atm.reject();
        Card card2 = new Card(500);
        atm.insertCard(card2);
        atm.getMoney(2000);
        atm.insertCard(card);
        atm.getMoney(200);
        atm.reject();


    }
}
