package DesignPattern.SingletonDP;

public class SingletonDesignPattern {
    private static SingletonDesignPattern instance = null;
    String name;
    int age;

    private SingletonDesignPattern(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static SingletonDesignPattern getInstance(String name, int age) {
        if (instance == null) {
            instance = new SingletonDesignPattern(name, age);
;
        }
        return instance;
    }
}
