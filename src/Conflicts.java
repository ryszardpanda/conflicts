package src;

public class Conflicts {
    public static void main(String[] args) {
        Clacccc calcClass = new Clacccc();
        Clacccc calcClassSecond = new Clacccc();

        int add = calcClass.ad(1, 1);
        int minus = calcClass.minus(1, 1);

        System.out.println(add);
        System.out.println(minus);

        System.out.println(calcClassSecond.minus(2, 4));
        System.out.println(calcClassSecond.minus(5, 5));
    }
}
