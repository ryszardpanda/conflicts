package src;

public class Confl {
    public static void main(String[] args) {
        Clacccc calcClass = new Clacccc();
        CalcClass calcClassSecond = new CalcClass();

        int add = calcClass.add(1, 2);
        int minus = calcClass.minus(1, 1);

        System.out.println(add);
        System.out.println(minus);

        System.out.println(calcClassSecond.multi(2, 4));
        System.out.println(calcClassSecond.divide(5, 5));
    }
}
