package multithreading.Threading.Executors;

public class NumberPrinter implements  Runnable{
    private int i;
    public NumberPrinter(int i){
        this.i = i;
    }
    @Override
    public void run() {
        System.out.println(i+"printed by "+ Thread.currentThread().getName());
    }
}
