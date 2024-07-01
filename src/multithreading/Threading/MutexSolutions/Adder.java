package multithreading.Threading.MutexSolutions;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Adder implements Callable<Void> {
    private Value addvalue;
    private Lock lock;
    public Adder(Value v, Lock lock){
        this.addvalue = v;
        this.lock = lock;
    }

    @Override
    public Void call() throws Exception {
        for(int i =1;i<=10000;i++){
            lock.lock();
            addvalue.value+=i;
            lock.unlock();
        }
        return null;
    }
}
