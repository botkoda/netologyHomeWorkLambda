package lambdaCalculator;

public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        //a=3 b=0 происходит деление на 0 и ошибка ArithmeticException: / by zero
        //добавил условие в классе Calculator
        int c = calc.devide.apply(a, b);

        calc.println.accept(c);
    }
}
