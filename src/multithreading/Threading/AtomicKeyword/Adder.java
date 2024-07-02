package multithreading.Threading.AtomicKeyword;

import java.util.concurrent.Callable;

public class Adder implements Callable<Void> {
    private Value addvalue;
    public Adder(Value v){
        this.addvalue = v;
    }

    @Override
    public Void call() throws Exception {
        //internally operation happens i = i+1 this is not one operation this is 3 operations included
        // this causes concurreny in order to happen
        // in atomic way we make value from integer to AtomicInteger
        //make that 3 operation to 1 operator (atomic = single unit , indivisible)
        for(int i =1;i<=100;i++){
            addvalue.value.addAndGet(i);
        }
        return null;
    }
}
