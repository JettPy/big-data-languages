package lab3.var4.task2;

public class Order {
    private final String name;
    private final int cost;

    public Order(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }
}
