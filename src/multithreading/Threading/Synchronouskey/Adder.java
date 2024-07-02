package multithreading.Threading.Synchronouskey;

import java.util.concurrent.Callable;

public class Adder implements Callable<Void> {
    private Value addvalue;
    public Adder(Value v){
        this.addvalue = v;
    }

    @Override
    public Void call() throws Exception {
        for(int i =1;i<=5000;i++){
            synchronized (addvalue) {
                addvalue.value += i;
            }
        }
        return null;
    }
}
