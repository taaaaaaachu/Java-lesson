package book;

/**
 * Calc
 */
public class Calc {

    public static void main(String[] args) {
        int a = 10; int b = 2;
        int total = CalcLogic.plus(a, b);
        int delta = CalcLogic.max(a, b);
        System.out.println("足すと" + total + "、引くと" + delta);
    }
}