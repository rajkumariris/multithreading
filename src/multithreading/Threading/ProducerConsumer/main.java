package multithreading.Threading.ProducerConsumer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class main {
    public static void main(String[] args) {
        Store store = new Store(5);
        ExecutorService es = Executors.newCachedThreadPool();
//always think mulltiple threads can run at a time on same object
        
        for(int i =0;i<8;i++){
            Producer producer = new Producer(store);
            es.submit(producer);
        }


        for(int i =0;i<8;i++){
            Consumer consumer = new Consumer(store);
            es.submit(consumer);
        }

    }
}
