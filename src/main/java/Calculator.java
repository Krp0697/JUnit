import java.util.function.*;

public class Calculator {
    static Supplier<Calculator> instance = Calculator::new;

    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> mulitply = (x, y) -> x * y;
    BinaryOperator<Integer> devide = (x, y) -> x/y;

    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abc = x -> x > 0 ? x : x * -1;

    Predicate<Integer> isPositive = x -> x > 0;

    Consumer<Integer> println = System.out::println;

}