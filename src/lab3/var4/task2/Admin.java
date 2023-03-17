package lab3.var4.task2;

public class Admin {
    public void blockCreditCard(CreditCard card) {
        System.out.println("Admin blocked card " + card.getCardNumber());
        card.setIsBlocked(true);
    }
}
