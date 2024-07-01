package multithreading.Threading.MutexSolutions;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SyncProblem {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Value v = new Value();
    // lock created and passing it to those adder and substractor lock should be same on shared resource
       //use of reentrantlock same thread can access cs without blocking at same time
        Lock lock = new ReentrantLock();



        // we cannot implement callable with threads we should only implement runnable with threads
        // executorservice is for callble
        //start() is for starting the thread
        // join() is for waiting for that thread that returns
         Adder ad = new Adder(v, lock);
        Substractor sub = new Substractor(v, lock);

        ExecutorService es = Executors.newCachedThreadPool();
         Future<Void> futureAdded = es.submit(ad);
        Future<Void> futureSub = es.submit(sub);

        futureAdded.get();
        futureSub.get();

 // only one thread for one task to execute completely
        System.out.println(v.value);


        //consider a scenario where a method A
        // acquires a lock and then calls another
        // method B that also tries to acquire the same lock. If the lock wasn't reentrant, this would result in a deadlock because method B would be waiting for method A
        // to release the lock. But with a reentrant lock,

        ///----------- it is handling deadlock
        // when one method which is locked trying to access another method
        // but that method is waiting for first method to unlock
        // it is never ending sitation called deadlock


//        public void methodA() {
//            lock.lock();
//            try {
//                System.out.println("Method A");
//                methodB();
//            } finally {
//                lock.unlock();
//            }
//        }
//
//        public void methodB() {
//            lock.lock();
//            try {
//                System.out.println("Method B");
//            } finally {
//                lock.unlock();
//            }
//        }

    }
}
