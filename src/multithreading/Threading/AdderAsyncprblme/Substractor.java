package multithreading.Threading.AdderAsyncprblme;

import java.util.concurrent.Callable;

public class Substractor implements Callable<Void> {
    private Value SubValue;
    public Substractor(Value v){
        this.SubValue = v;
    }

    @Override
    public Void call() throws Exception {
       for(int i =1;i<=100;i++){
           this.SubValue.value-=i;
       }
       return null;
    }
}
