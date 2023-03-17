package lab3.var4.task2;

public class CreditCard {
    private final String card_number;
    private boolean is_blocked;

    public CreditCard(String card_number) {
        this.card_number = card_number;
        this.is_blocked = false;
    }

    public boolean getIsBlocked() {
        return is_blocked;
    }

    public void setIsBlocked(boolean is_blocked) {
        this.is_blocked = is_blocked;
        if (this.is_blocked) {
            System.out.println(this.card_number + ": now blocked");
        } else {
            System.out.println(this.card_number + ": now unblocked");
        }
    }

    public String getCardNumber() {
        return card_number;
    }
}
