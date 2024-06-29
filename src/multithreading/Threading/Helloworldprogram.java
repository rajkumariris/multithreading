package multithreading.Threading;

public class Helloworldprogram implements Runnable{
    //we can also run different method in this class use that in run method only bcoz
    // thread only runs run method
    public void dosomething(){
        System.out.println("hello world from dosomething"+ Thread.currentThread().getName());
    }

    // this is funtional interface so we have to implement run method only
    @Override
    public void run() {
        System.out.println("hello world from runnable"+ Thread.currentThread().getName());
        dosomething();
    }
}
