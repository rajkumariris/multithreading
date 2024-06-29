package DesignPattern.SingletonDP;

public class SingletonDesignPattern2 {

    //static methods only need static variables
    //private constructor to restrict instantiation of the class from other classes.
    // in private constructor does everything same but not returning the instance
    private static SingletonDesignPattern2 instance = new SingletonDesignPattern2();
    //above object loaded at class loading time
    private  SingletonDesignPattern2(){

    }
    public static SingletonDesignPattern2 getInstance(){
        return instance;
    }
}
