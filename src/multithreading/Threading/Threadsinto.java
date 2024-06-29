package multithreading.Threading;

public class Threadsinto {
    public static void main(String[] args) {
        //creating an instance of an task which we want to run seperately
        // this task is implementing runnable interface so it has run method in it
        Helloworldprogram hwp = new Helloworldprogram();

        //creating a thread and passing the task to it
        Thread t1 = new Thread(hwp);
        //starting the thread
        t1.start();


        System.out.println("hello world from main"+ Thread.currentThread().getName());





        //not always true first main thread prints next other thred prints bcoz when main keeps on running while others doing their task
        //internally thread constructor goes with object we passed hwp  that got caught with constrcutor
        // assigning that object to task object in thread class
        // Runnable task;
        // public Thread(Runnable r) {
        //          task = r;
        //   }
        // this thread object also has start method we call run method from task object we passed



    }
}
