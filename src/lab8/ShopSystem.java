package lab8;

import java.util.PriorityQueue;
import java.util.Queue;

// Лабораторная работа 8
// Вариант 1
// Задание 3
public class ShopSystem {
    private final Producer producer;
    private final Shop shop;
    private final Customer customer;
    private static final Queue<Integer> store = new PriorityQueue<>();
    private static final Queue<Integer> shelving = new PriorityQueue<>();


    class Producer implements Runnable {
        private final String name;

        public Producer(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            double probability;
            for (int i = 0; i < 10; i++) {
                try {
                    long secs = (long)(Math.random() * 3) + 1;
                    Thread.sleep(1000 * secs);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                probability = Math.random();
                if (probability > 0.5) {
                    int product_id = (int)(Math.random() * 90) + 10;
                    System.out.println(this.name + ": Отправлен товар с id: " + product_id);
                    store.add(product_id);
                }
            }
            System.out.println(this.name + ": Конец отправки");
            store.add(-1);
        }
    }
    class Shop implements Runnable {
        private final String name;

        public Shop(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            while (true) {
                if (store.isEmpty()) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                } else {
                    int product_id = store.poll();
                    if (product_id == -1) {
                        break;
                    }
                    try {
                        long secs = (long)(Math.random() * 3) + 1;
                        Thread.sleep(1000 * secs);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(this.name + ": Получен товар с id: " + product_id);
                    shelving.add(product_id);
                }
            }
            System.out.println(this.name + ": Магазин закрывается");
            shelving.add(-1);
        }
    }
    class Customer implements Runnable {
        private final String name;

        public Customer(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            while (true) {
                if (shelving.isEmpty()) {
                    try {
                        Thread.sleep(1000);
                        System.out.println(this.name + ": Ждет товар");
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                } else {
                    int product_id = shelving.poll();
                    if (product_id == -1) {
                        break;
                    }
                    try {
                        long secs = (long)(Math.random() * 3) + 1;
                        Thread.sleep(1000 * secs);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(this.name + ": Купил товар с id: " + product_id);
                }
            }
            System.out.println(this.name + ": Клиент ушел");
        }
    }

    public ShopSystem() {
        producer = new Producer("Хлеб Завод");
        shop = new Shop("Пятерочка");
        customer = new Customer("Серёжа");
    }

    void run() {
        new Thread(producer).start();
        new Thread(shop).start();
        new Thread(customer).start();
    }
    public static void main(String []args) throws InterruptedException {
        ShopSystem shop_system = new ShopSystem();
        shop_system.run();
    }
}
