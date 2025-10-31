// Класс Fraction для работы с дробями
public class Fraction {
    private final int numerator;
    private final int denominator;

    // Конструктор с числителем и знаменателем
    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Знаменатель не может быть равен нулю");
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    // Конструктор только с числителем (знаменатель = 1)
    public Fraction(int numerator) {
        this(numerator, 1);
    }

    // Геттеры
    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    // Строковое представление
    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    // Нахождение наибольшего общего делителя (НОД)
    private int gcd(int a, int b) {
        return b == 0 ? Math.abs(a) : gcd(b, a % b);
    }

    // Сокращение дроби
    private Fraction simplify() {
        int gcd = gcd(numerator, denominator);
        int sign = (numerator * denominator < 0) ? -1 : 1;
        int simplifiedNumerator = Math.abs(numerator) / gcd * sign;
        int simplifiedDenominator = Math.abs(denominator) / gcd;
        return new Fraction(simplifiedNumerator, simplifiedDenominator);
    }

    // Сложение с другой дробью
    public Fraction add(Fraction other) {
        int commonDenominator = this.denominator * other.denominator;
        int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        return new Fraction(newNumerator, commonDenominator).simplify();
    }

    // Сложение с целым числом
    public Fraction add(int number) {
        return add(new Fraction(number));
    }

    // Вычитание другой дроби
    public Fraction subtract(Fraction other) {
        int commonDenominator = this.denominator * other.denominator;
        int newNumerator = this.numerator * other.denominator - other.numerator * this.denominator;
        return new Fraction(newNumerator, commonDenominator).simplify();
    }

    // Вычитание целого числа
    public Fraction subtract(int number) {
        return subtract(new Fraction(number));
    }

    // Умножение на другую дробь
    public Fraction multiply(Fraction other) {
        int newNumerator = this.numerator * other.numerator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator).simplify();
    }

    // Умножение на целое число
    public Fraction multiply(int number) {
        return multiply(new Fraction(number));
    }

    // Деление на другую дробь
    public Fraction divide(Fraction other) {
        if (other.numerator == 0) {
            throw new IllegalArgumentException("Деление на ноль невозможно");
        }
        int newNumerator = this.numerator * other.denominator;
        int newDenominator = this.denominator * other.numerator;
        return new Fraction(newNumerator, newDenominator).simplify();
    }

    // Деление на целое число
    public Fraction divide(int number) {
        return divide(new Fraction(number));
    }
}
