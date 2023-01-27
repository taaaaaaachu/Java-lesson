package book.RPG;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        // 勇者を生成
        Hero h = new Hero();
        h.name = "ミナト";
        h.hp = 100;

        Matango m1 = new Matango();
        m1.hp = 50;
        m1.suffix = 'A';
        Matango m2 = new Matango();
        m2.hp = 48;
        m2.suffix = 'B';
        
        // 冒険の始まり
        h.slip();
        m1.run();
        m2.run();
        h.run();
    }
}