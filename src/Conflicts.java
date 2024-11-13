package src;

public class Conflicts {
    public static void main(String[] args) {
        CalcClass calcClass = new CalcClass();
        CalcClassSecond calcClassSecond = new CalcClassSecond();

        int add = calcClass.add(1, 1);
        int minus = calcClass.minus(1, 1);

        System.out.println(add);
        System.out.println(minus);

        System.out.println(calcClassSecond.multiply(2, 4));
        System.out.println(calcClassSecond.divide(5, 5));
    }
}
