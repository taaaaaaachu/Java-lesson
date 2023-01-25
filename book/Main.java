package book;

/**
 * Main
 */
public class Main {
    public static void methodA() {
        System.out.println("methodA");
        methodB();
    }

    public static void main(String[] args) {
        methodA();
    }

    public static void methodB() {
        System.out.println("methodB");
    }
}