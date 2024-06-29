import DesignPattern.SingletonDP.SingletonDesignPattern;

public class Main {
    public static void main(String[] args) {
        SingletonDesignPattern singletonDesignPattern = SingletonDesignPattern.getInstance("raj", 23);
        //SingletonDesignPattern singletonDesignPattern1 = SingletonDesignPattern.getInstance();
        System.out.println("Hello world!");
    }
}