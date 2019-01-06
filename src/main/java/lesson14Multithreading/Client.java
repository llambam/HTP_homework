package lesson14Multithreading;

import java.util.concurrent.Semaphore;

public class Client implements Runnable {

    //занято - true, свободно - false
    public static final int NUMBER_OF_OPERATORS = 3;
    private static final boolean[] FREE_OPERATORS = new boolean[NUMBER_OF_OPERATORS];
    private static final Semaphore SEMAPHORE = new Semaphore(NUMBER_OF_OPERATORS, true);
    private static final int speakTimeMS = 2000;
    public int operatorNumber;
    public String clientName;
    public int clientID;

    public Client(String clientName, int clientID) {
        this.clientName = clientName;
        this.clientID = clientID;
    }

    @Override
    public void run() {

        try {
            SEMAPHORE.acquire();

            synchronized (FREE_OPERATORS) {
                for (int i = 0; i < NUMBER_OF_OPERATORS; i++) {
                    if (!FREE_OPERATORS[i]) {
                        FREE_OPERATORS[i] = true;
                        operatorNumber = i;
                        System.out.println("Клиент " + clientName + " обслуживается оператором номер " + i);
                        break;
                    }
                }
            }

            Thread.sleep(speakTimeMS);
            synchronized (FREE_OPERATORS) {
                if (operatorNumber != -1) {
                    FREE_OPERATORS[operatorNumber] = false;
                } else {
                    System.out.println(operatorNumber);
                }
            }

            SEMAPHORE.release();
            System.out.println("Клиент " + clientName + " ообсудивание закончил");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}


//    тема колл центр. В колл центре имеется заданное число операторов и определенная вместимость по клиентам, необходимо организовать эмуляцию работы колцентра, т.е. разговор оператора с клиентом. Те клиенты, для которых оператора не нашлось должны быть помещены в очередь для ожидания. А для кого нашлась должны провести разговор с оператором. Каждое действие должно быть записано и выведено на консоль. Колл центр должен обслужить всех клиентов и завершить свою работу.