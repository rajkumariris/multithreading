package multithreading.Threading.ProducerConsumer;

public class Consumer implements Runnable {
    private Store store;

    public Consumer(Store store){
        this.store = store;
    }

    @Override
    public void run() {
        while(true){
            synchronized (store) {
                if (store.getItems().size() > 0) {
                    System.out.println("removing item from store " + store.getItems().size());
//                store.getItems().remove(store.getItems().size()-1);
                    store.removeItem();

                }
            }
        }


    }
}
