package lab3.var4.task2;

public class Account {
    private final String account_number;
    private int funds;

    public Account(String account_number, int funds) {
        this.account_number = account_number;
        this.funds = funds;
    }

    public int getFunds() {
        return funds;
    }

    public void setFunds(int funds) {
        int prev = this.funds;
        this.funds = funds;
        int curr = this.funds;
        if (prev >= curr) {
            System.out.println(this.account_number + ": Payment has been made. current funds: " + this.funds);
        } else {
            System.out.println(this.account_number + ": Payment received. current funds: " + this.funds);
        }
    }

    public void cancel() {
        this.funds = 0;
        System.out.println(this.account_number + ": Account canceled");
    }
}
