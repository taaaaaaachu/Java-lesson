package book;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        for (int i = 1; i < 16; i++) {
            for (int j = 1; j < 16; j++) {
                System.out.print(i * j);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}