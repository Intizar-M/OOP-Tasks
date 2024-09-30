//4. Калькулятор (Calculator):
//
//Методы:
//add(double a, double b): возвращает сумму a и b.
//subtract(double a, double b): возвращает разность a и b.
//multiply(double a, double b): возвращает произведение a и b.
//divide(double a, double b): возвращает частное a и b.
//Дополнительно: Реализуйте функции для расчета степени, корня и процентов.


public class Calculator {
    private int a;
    private int b;

    public Calculator(int a, int b) {
        setA(a);
        setB(b);
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }

    public int power(int a, int b) {
        return (int) Math.pow(a, b);
    }

    public int sqrt(int a) {
        return (int) Math.sqrt(a);
    }

    public int percent(int a, int b) {
        return a * b / 100;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}
