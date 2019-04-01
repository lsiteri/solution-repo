package enumSingleton;

public class Main {

    public static void main(String[] args) {
        Singleton singleton = Singleton.INSTANCE;
        Singleton newSingleton = Singleton.INSTANCE;

        System.out.println("Both instance are the same instance -> " +singleton.equals(newSingleton));
    }

}
