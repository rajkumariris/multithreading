package multithreading.Threading.Synchronouskey;

import java.util.concurrent.Callable;

public class Substractor implements Callable<Void> {
    private Value SubValue;
    public Substractor(Value v){
        this.SubValue = v;
    }

    @Override
    public Void call() throws Exception {
       for(int i =1;i<=5000;i++){
           //sysnchronized keyword works exactly like lock instead sharing lock
           // java by default provides this
           // synchronized(this) works on current object in this case substractor but we want on shared object Value
           // lock on the same object then it works
           synchronized (SubValue){
               this.SubValue.value-=i;
           }
       }
       return null;
    }
}
