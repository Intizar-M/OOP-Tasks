//4. Калькулятор (Calculator):
//
//Методы:
//add(double a, double b): возвращает сумму a и b.
//subtract(double a, double b): возвращает разность a и b.
//multiply(double a, double b): возвращает произведение a и b.
//divide(double a, double b): возвращает частное a и b.
//Дополнительно: Реализуйте функции для расчета степени, корня и процентов.

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(1, 2);
        System.out.println(calculator.add(3, 2));
        System.out.println(calculator.subtract(3, 2));
        System.out.println(calculator.multiply(4, 2));
        System.out.println(calculator.divide(8, 4));
        System.out.println(calculator.power(5, 3));
        System.out.println(calculator.sqrt(16));
        System.out.println(calculator.percent(200, 2));
    }
}