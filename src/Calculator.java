import java.io.PrintStream;
import java.util.Objects;
import java.util.function.*;

public class Calculator {
    static Supplier<Calculator> instance = Calculator::new;
    BinaryOperator<Integer> plus = (x, y) -> {
        return x + y;
    };
    BinaryOperator<Integer> minus = (x, y) -> {
        return x - y;
    };
    BinaryOperator<Integer> multiply = (x, y) -> {
        return x * y;
    };


    BinaryOperator<Integer> devide = (x, y) -> {
        try {                                  // ловим ошибку
            return x / y;                      // возвращаем результат вычисления, если нет ошибок

        } catch (ArithmeticException e) {
            System.out.println("Ошибка: " + e); // вывод наименования ошибки в консоль
            return 0;                           // возвращаем 0, если ошибка
        }
    };


    UnaryOperator<Integer> pow = (x) -> {
        return x * x;
    };
    UnaryOperator<Integer> abs = (x) -> {
        return x > 0 ? x : x * -1;
    };
    Predicate<Integer> isPositive = (x) -> {
        return x > 0;
    };
    Consumer<Integer> println = System.out::println;


}

