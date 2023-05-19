package home_work_3.calcs.api;

public interface ICalculator {

    double Addition(double term1, double term2);

    double Multiplication (double multiplier1, double multiplier2);

    double Subtraction (double subtrahend1, double subtrahend2);

    double Division (double divider1, double divider2);

    double Exponentiation (double number, int extent);

    double Module (double number);

    double Sqrt(double number);
}
