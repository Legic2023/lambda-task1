//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.io.PrintStream;
import java.util.Objects;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

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
        return x / y;
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
    Consumer<Integer> println;

    public Calculator() {
        PrintStream var10001 = System.out;
        Objects.requireNonNull(var10001);
        this.println = var10001::println;
    }
}
