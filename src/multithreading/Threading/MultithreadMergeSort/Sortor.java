package multithreading.Threading.MultithreadMergeSort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Sortor implements Callable<List<Integer>> {

    private List<Integer> list;
    ExecutorService es;
    public Sortor(List<Integer> list, ExecutorService es) {
        this.list = list;
        this.es = es;
    }
    @Override
    public List<Integer> call() throws Exception {

        if(list.size()<=1){
            return list;
        }
        int size = list.size();
        int mid =size/2;

        List<Integer> leftArray = new ArrayList<>();
        List<Integer> rightArray = new ArrayList<>();

        for(int i =0;i<mid;i++){
            leftArray.add(list.get(i));
        }
        for(int i =mid;i<size;i++){
            rightArray.add(list.get(i));
        }

        //ExecutorService es = Executors.newCachedThreadPool();
        Sortor leftSortor = new Sortor(leftArray, es);
        Sortor rightSortor = new Sortor(rightArray,es);

        // executor submit says i will give you the result in future but can carry on for now with next task
        Future<List<Integer>> leftsorted=  es.submit(leftSortor);
        Future<List<Integer>> rightSorted = es.submit(rightSortor);


        // get() will wait for the result to come
       List<Integer> sortedLeftArray =  leftsorted.get();
       List<Integer> sortedRightArray = rightSorted.get();

       List<Integer> sorted = new ArrayList<>();
         int leftIndex = 0;
            int rightIndex = 0;
            while(leftIndex<sortedLeftArray.size() && rightIndex<sortedRightArray.size()){
                if(sortedLeftArray.get(leftIndex)<sortedRightArray.get(rightIndex)){
                    sorted.add(sortedLeftArray.get(leftIndex));
                    leftIndex++;
                }else{
                    sorted.add(sortedRightArray.get(rightIndex));
                    rightIndex++;
                }
            }
            while(leftIndex<sortedLeftArray.size()){
                sorted.add(sortedLeftArray.get(leftIndex));
                leftIndex++;
            }
            while(rightIndex<sortedRightArray.size()){
                sorted.add(sortedRightArray.get(rightIndex));
                rightIndex++;
            }
        return sorted;
    }
}
