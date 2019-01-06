package lesson14Multithreading;

public class Main {


    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i <= 10; i++) {
            new Thread(new Client("Bob#" + i, i)).start();
            Thread.sleep(400);
        }


    }

}
