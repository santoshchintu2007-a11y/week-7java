class GoodMorning implements Runnable {
    public void run() {
        while (true) {
            System.out.println("Good Morning");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}

class Hello implements Runnable {
    public void run() {
        while (true) {
            System.out.println("Hello");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}

class Welcome implements Runnable {
    public void run() {
        while (true) {
            System.out.println("Welcome");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        new Thread(new GoodMorning()).start();
        new Thread(new Hello()).start();
        new Thread(new Welcome()).start();
    }
}
