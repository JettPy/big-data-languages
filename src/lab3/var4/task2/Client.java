package lab3.var4.task2;

public class Client {
    private final String name;
    private final Account account;
    private final CreditCard credit_card;

    public Client(String name, Account account, CreditCard credit_card) {
        this.name = name;
        this.account = account;
        this.credit_card = credit_card;
    }

    public void payOrder(Order order) {
        if (this.credit_card.getIsBlocked()) {
            System.out.println(this.name + ": Your account is blocked!");
        } else {
            System.out.println("Order " + order.getName() + "payed");
            this.account.setFunds(account.getFunds() - order.getCost());
        }
    }

    public void payAnotherAccount(Account account, int amount) {
        if (this.credit_card.getIsBlocked()) {
            System.out.println(this.name + ": Your account is blocked!");
        } else {
            this.account.setFunds(this.account.getFunds() - amount);
            account.setFunds(account.getFunds() + amount);
        }
    }

    public void blockCard() {
        this.credit_card.setIsBlocked(true);
    }

    public void cancelAccount() {
        this.account.cancel();
    }
}
