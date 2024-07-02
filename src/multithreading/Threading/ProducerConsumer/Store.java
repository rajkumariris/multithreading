package multithreading.Threading.ProducerConsumer;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Store {
    private int size;
    List<Object> items= new ArrayList<>();

    public Store(int size){
        this.size = size;
    }
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public List<Object> getItems() {
        return items;
    }

    public void setItems(List<Object> items) {
        this.items = items;
    }

    public void addItem(Object obj){
        this.items.add(obj);
    }

    public void removeItem(){
        this.items.remove(this.items.size()-1);
    }


}
