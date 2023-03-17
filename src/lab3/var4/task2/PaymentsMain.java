package lab3.var4.task2;

public class PaymentsMain {
    public static void main(String[] args) {
        Account a1 = new Account("12345678900987654321", 600);
        Account a2 = new Account("0987654321234567890", 10);
        CreditCard c1 = new CreditCard("2020 1234 1234 1234");
        CreditCard c2 = new CreditCard("4000 5678 5678 5678");
        Order o = new Order("notebook", 500);
        Client client1 = new Client("Vasya", a1, c1);
        Client client2 = new Client("Petya", a2, c2);
        Admin admin = new Admin();
        client1.payOrder(o);
        client1.payAnotherAccount(a2, 300);
        if (a1.getFunds() < 0) {
            admin.blockCreditCard(c1);
        }
        client1.payAnotherAccount(a2, 100);
        client2.blockCard();
        client2.cancelAccount();
        client2.payAnotherAccount(a1, 100);
    }
}
