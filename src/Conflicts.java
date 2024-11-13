package src;

public class Conflicts {
    public static void main(String[] args) {
        Calc calcClass = new Calc();
        CalcClassNew calcClassSecond = new CalcClassNew();

        int add = calcClass.adding(1, 4);
        int minus = calcClass.minus(1, 1);

        System.out.println(minus);
        System.out.println(minus);

        System.out.println(calcClassSecond.multiply(2, 1000));
        System.out.println(calcClassSecond.divide(5, 5));
    }
}
