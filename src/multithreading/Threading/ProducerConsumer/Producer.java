package multithreading.Threading.ProducerConsumer;

public class Producer  implements Runnable{

    private Store store;

    public Producer(Store store){
        this.store = store;
    }

    @Override
    public void run() {
        while(true){
            //it works but slow
            synchronized (store) {
                if (store.getItems().size() < store.getSize()) {
                    System.out.println("producere addng " + store.getItems().size());
                    //  store.getItems().add(new Object());
                    store.addItem(new Object());

                }
            }
        }
    }
}
