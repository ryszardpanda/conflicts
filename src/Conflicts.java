package src;

public class Conflicts {
    public static void main(String[] args) {
        CalcClasssssss calcClass = new CalcClasssssss();
        CalcClassSecond calcClassSecond = new CalcClassSecond();

        int add = calcClass.add(1, 4);
        int minus = calcClass.minus(1, 1);

        System.out.println(add);
        System.out.println(minus);

        System.out.println(calcClassSecond.multiplyyyy(2, 4));
        System.out.println(calcClassSecond.divide(5, 5));
    }
}
