package multithreading.Threading.syncMethod;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SyncProblem {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Value v = new Value();

        // here we are putting lock on shared object

        //by using getter method for shared obbject it return and unlock in bettwen someone try to update
        //in object
        Adder ad = new Adder(v);
        Substractor sub = new Substractor(v);

        ExecutorService es = Executors.newCachedThreadPool();
         Future<Void> futureAdded = es.submit(ad);
        Future<Void> futureSub = es.submit(sub);

        futureAdded.get();
        futureSub.get();

        System.out.println(v.value);
    }
}
