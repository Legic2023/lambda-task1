public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1); // делитель b = 0
        int c; // объявление переменной c

        try {
            c = calc.devide.apply(a, b); // обработка исключения

        } catch (ArithmeticException e) {
            System.out.println("Ошибка: " + e); // вывод наименования ошибки в консоль
            c = 0; // инициализация переменной c
        }

        calc.println.accept(c);

    }
}