package atm;

/**
 * Created by n on 03.04.17.
 */
public class Runner {
    public static void main(String[] args) {
        Card card = new Card();
        Atm atm = new Atm();
        atm.insertCard(card);
        atm.getMoney();
        atm.reject();
        Card card2 = new Card();
        atm.insertCard(card2);
        atm.getMoney();
        atm.insertCard(card);
        atm.getMoney();
        atm.reject();


    }
}
