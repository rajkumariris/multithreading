package multithreading.Threading.Executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NumberPrinterClient {
    public static void main(String[] args) {
        //threadpool of size 10 instead of new thread everytime we use 10 thread only for every task
        ExecutorService e = Executors.newFixedThreadPool(10);
        //newCachedThreadPool() -> creates new thread for every task

        // getting the task for every number
        // putting that in one in among 10 thread and running each task in those 10
        for(int i =0;i<100;i++){
            NumberPrinter numberPrinter = new NumberPrinter(i);
            e.execute(numberPrinter);
//            Thread thread = new Thread(numberPrinter);
//            thread.start();
        }
    }
}
