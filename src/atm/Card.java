package atm;

/**
 * Created by n on 03.04.17.
 */
public class Card {
    private int balance = 0;

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public Card(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

     void spisatMoney(int money) {
         if(balance > money){
             int tmp = balance - money;

         }
    }
}
