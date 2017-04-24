package atm;

import bills.cards.Card;

/**
 * Created by n on 02.04.17.
 */
public class Atm {
    private int balance;
    private Card currentCard=null;
    public void insertCard(Card card){
        if(currentCard == null){
            currentCard =card;
            System.out.println("You inserted the card " + currentCard);
        }
        else System.out.println("Карта " + currentCard + " - уже вставлена");
    }
    public void reject(){ //return back user's card

        System.out.println("Вы забрали карту - " + currentCard);
        currentCard =null;
    }

    public void getMoney(int money){
        if(currentCard.getBalance() > money) {
           currentCard.spisatMoney(money); balance = balance-money;
            System.out.println("Вы получили деньги");
        }
        else System.out.println("Запрашиваемая сумма - " + money + " отсутствует");
    }
    private int getBalance(){
        return currentCard.getBalance();
    }
    public void showBalans(){
        System.out.println("Ваш баланс - "+ currentCard.getBalance() );
    }
}