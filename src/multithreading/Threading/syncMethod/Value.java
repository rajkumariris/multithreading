package multithreading.Threading.syncMethod;

public class Value {
    public int value=0;
// getter and setter doesnt help bcoz once it took value it has to update
    //but getter get once and setter update latet in bettween different task happen leads to sync problme
    public  synchronized  void IncrementBy(){
        //value.lock()
        // here we are getting value and setting value at the same time same lock
        this.value+=1;
        //value.unlock()
    }
    public synchronized  void DecrementBy(){
        //value.lock()
        this.value-=1;
        //value.unlock()
    }
}
