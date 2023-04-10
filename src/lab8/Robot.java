package lab8;

// Лабораторная работа 8
// Вариант 1
// Задание 2
public class Robot {

    private final Thread left_thread;
    private final Thread right_thread;
    class Leg implements Runnable {
        private final String name;
        Leg(String name) {
            this.name = name;
        }
        @Override
        public void run() {
            while(true) {
                step();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Leg " + this.name + " stopped");
                    break;
                }
            }
        }
        private void step() {
            System.out.println(name);
        }
    }

    public Robot() {
        Leg left_leg = new Leg("LEFT");
        Leg right_leg = new Leg("RIGHT");
        left_thread = new Thread(left_leg);
        right_thread = new Thread(right_leg);
    }

    void run() {
        left_thread.start();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        right_thread.start();
    }

    void stop() {
        left_thread.interrupt();
        right_thread.interrupt();
    }

    public static void main(String[] args) {
        Robot robot = new Robot();
        robot.run();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        robot.stop();
    }
}
