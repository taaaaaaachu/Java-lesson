package book;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("メソッドを呼び出します");
        hello("奏");
        hello("浅香");
        hello("菅原");
    }

    public static void hello(String name) {
        System.out.println(name + "さん、こんにちは");
    }
}