package multithreading.Threading.NumberPrinter;

public class NumberPrinterClient {
    public static void main(String[] args) {
      // we are printing 0 to 99 numbers using 100 threads
        // getting the task for every number
        // putting that in thread and running each task in different thread
        for(int i =0;i<100;i++){
            NumberPrinter numberPrinter = new NumberPrinter(i);
            Thread thread = new Thread(numberPrinter);
            thread.start();
        }
    }
}
