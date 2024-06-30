package multithreading.Threading.MultithreadMergeSort;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultiMergeSort {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> l = List.of(8,6,5,2,3,4,7,1,9);
        ExecutorService es = Executors.newCachedThreadPool();

         Sortor s = new Sortor(l,es);
         Future<List<Integer>> sortedarray =  es.submit(s);

         List<Integer> ls = sortedarray.get();

         for(int i:ls){
             System.out.println(i);
         }
    }
}
