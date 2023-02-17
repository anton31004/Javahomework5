import java.util.Scanner;
class Fraction{
    public int numerator, denominator;
    public Fraction(){
        numerator = 1;
        denominator = 1;
    }
    public Fraction(int a, int b) throws Exception {
        if (b != 0) {
            numerator = a;
            denominator = b;
        } else {
            throw new Exception("Знаменатель должен быть отличен от нуля!");
        }
    }
    public void vivod(){
        System.out.println(numerator + "/" + denominator);
    }
    public void summa(int a, int b, int c, int d) {
        System.out.println("Результат: " + (a * d + b * c) + "/" + b * d);
    }
    public void subtraction(int a, int b, int c, int d) {System.out.println("Результат: " + (a * d - b * c) + "/" + b * d);
    }
    public void multiplication(int a, int b, int c, int d) {
        System.out.println("Результат: " + (a * c) + "/" + b * d);
    }
    public void division(int a, int b, int c, int d) {
        System.out.println("Результат: " + (a * d) + "/" + c * b);
    }
}
public class Main{
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите значения числителя и знаменателя:");
        Fraction drob1 = new Fraction(in.nextInt(), in.nextInt());
        drob1.vivod();
        System.out.println("Дробь по умолчанию:");
        Fraction drob2 = new Fraction();
        drob2.vivod();

        System.out.println("Введите значения числителя и знаменателя первой дроби для выполнения сложения:");
        Fraction drob3 = new Fraction(in.nextInt(), in.nextInt());
        System.out.println("Введите значения числителя и знаменателя второй дроби для выполнения сложения:");
        Fraction drob4 = new Fraction(in.nextInt(), in.nextInt());
        drob3.summa(drob3.numerator, drob3.denominator, drob4.numerator, drob4.denominator);

        System.out.println("Введите значения числителя и знаменателя для выполнения сложения c дробью по умолчанию:");
        Fraction drob3a = new Fraction(in.nextInt(), in.nextInt());
        Fraction drob4a = new Fraction();
        drob3.summa(drob3a.numerator, drob3a.denominator, drob4a.numerator, drob4a.denominator);

        System.out.println("Введите значения числителя и знаменателя первой дроби для выполнения вычетания:");
        Fraction drob5 = new Fraction(in.nextInt(), in.nextInt());
        System.out.println("Введите значения числителя и знаменателя второй дроби для выполнения вычетания:");
        Fraction drob6 = new Fraction(in.nextInt(), in.nextInt());
        drob5.subtraction(drob5.numerator, drob5.denominator, drob6.numerator, drob6.denominator);

        System.out.println("Введите значения числителя и знаменателя для выполнения вычетания c дробью по умолчанию:");
        Fraction drob5a = new Fraction(in.nextInt(), in.nextInt());
        Fraction drob6a = new Fraction();
        drob5.subtraction(drob5a.numerator, drob5a.denominator, drob6a.numerator, drob6a.denominator);

        System.out.println("Введите значения числителя и знаменателя первой дроби для выполнения умножения:");
        Fraction drob7 = new Fraction(in.nextInt(), in.nextInt());
        System.out.println("Введите значения числителя и знаменателя второй дроби для выполнения умножения");
        Fraction drob8 = new Fraction(in.nextInt(), in.nextInt());
        drob7.multiplication(drob7.numerator, drob7.denominator, drob8.numerator, drob8.denominator);

        System.out.println("Введите значения числителя и знаменателя для выполнения умножения c дробью по умолчанию:");
        Fraction drob7a = new Fraction(in.nextInt(), in.nextInt());
        Fraction drob8a = new Fraction();
        drob7.multiplication(drob7a.numerator, drob7a.denominator, drob8a.numerator, drob8a.denominator);

        System.out.println("Введите значения числителя и знаменателя первой дроби для выполнения деления");
        Fraction drob9 = new Fraction(in.nextInt(), in.nextInt());
        System.out.println("Введите значения числителя и знаменателя второй дроби для выполнения деления");
        Fraction drob10 = new Fraction(in.nextInt(), in.nextInt());
        drob9.division(drob9.numerator, drob9.denominator, drob10.numerator, drob10.denominator);

        System.out.println("Введите значения числителя и знаменателя для выполнения деления c дробью по умолчанию:");
        Fraction drob9a = new Fraction(in.nextInt(), in.nextInt());
        Fraction drob10a = new Fraction();
        drob9.division(drob9a.numerator, drob9a.denominator, drob10a.numerator, drob10a.denominator);
    }
}
