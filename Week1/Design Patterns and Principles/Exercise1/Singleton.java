package Anu;

public class Singleton {
    private static Singleton instance;
    private Singleton() {
        System.out.println("I am Ananya");
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void sayHello() {
        System.out.println("Hey, this is Singleton created by Ananya");
    }

    public static void main(String[] args) {
        Singleton a = Singleton.getInstance();
        Singleton b = Singleton.getInstance();

        a.sayHello();
        System.out.println("Are both the same? " + (a == b));
    }
}

