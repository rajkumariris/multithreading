package multithreading.Threading.MutexSolutions;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Substractor implements Callable<Void> {
    private Value SubValue;
    private Lock lock;
    public Substractor(Value v, Lock lock){
        this.SubValue = v;
        this.lock = lock;
    }

    @Override
    public Void call() throws Exception {
       for(int i =1;i<=10000;i++){
           lock.lock();
           this.SubValue.value-=i;
           lock.unlock();
       }
       return null;
    }
}
