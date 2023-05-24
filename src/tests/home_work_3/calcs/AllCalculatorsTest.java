package tests.home_work_3.calcs;

import home_work_3.calcs.additional.CalculatorWithCounterAutoDecorator;
import home_work_3.calcs.additional.CalculatorWithMemoryDecorator;
import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AllCalculatorsTest {
    @Test
    public void checkAllCalculators () {
        ICalculator calculator = new CalculatorWithCounterAutoDecorator(new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends()));
        double multiply = calculator.Multiplication(15, 7);
        double division = calculator.Division(28, 5);
        ((CalculatorWithMemoryDecorator) ((CalculatorWithCounterAutoDecorator) calculator).getCalculator()).save();
        double lastResult = ((CalculatorWithMemoryDecorator) ((CalculatorWithCounterAutoDecorator) calculator).getCalculator()).load();
        double square = calculator.Exponentiation(division, 2);
        double firstSumm = calculator.Addition(4.1, multiply);
        double finalSumm = calculator.Addition(firstSumm, square);
        double operationCount = ((CalculatorWithCounterAutoDecorator) calculator).getCountOperation();
        Assertions.assertEquals(105, multiply);
        Assertions.assertEquals(5.6, division);
        Assertions.assertEquals(5.6, lastResult);
        Assertions.assertEquals(31.359999999999996, square);
        Assertions.assertEquals(109.1, firstSumm);
        Assertions.assertEquals(140.45999999999998,finalSumm);
        Assertions.assertEquals(5, operationCount);
    }

    @Test
    public void checkDoubleSumm (){
        ICalculator calculatorOperator = new CalculatorWithOperator();
        ICalculator calculatorMath = new CalculatorWithOperator();
        ICalculator calculatorExtends = new CalculatorWithOperator();
        double a = 4.16;
        double b = 17.13;
        Assertions.assertEquals(21.29, calculatorOperator.Addition(a,b));
        Assertions.assertEquals(21.29, calculatorMath.Addition(a,b));
        Assertions.assertEquals(21.29, calculatorExtends.Addition(a,b));
    }

    @Test
    public void checkIntSumm (){
        ICalculator calculatorOperator = new CalculatorWithOperator();
        ICalculator calculatorMath = new CalculatorWithOperator();
        ICalculator calculatorExtends = new CalculatorWithOperator();
        double a = 2;
        double b = 3;
        Assertions.assertEquals(5, calculatorOperator.Addition(a,b));
        Assertions.assertEquals(5, calculatorMath.Addition(a,b));
        Assertions.assertEquals(5, calculatorExtends.Addition(a,b));
    }

    @Test
    public void checkNegativeSumm (){
        ICalculator calculatorOperator = new CalculatorWithOperator();
        ICalculator calculatorMath = new CalculatorWithOperator();
        ICalculator calculatorExtends = new CalculatorWithOperator();
        double a = -8;
        double b = -22;
        Assertions.assertEquals(-30, calculatorOperator.Addition(a,b));
        Assertions.assertEquals(-30, calculatorMath.Addition(a,b));
        Assertions.assertEquals(-30, calculatorExtends.Addition(a,b));
    }

    @Test
    public void checkNegativePositiveSumm (){
        ICalculator calculatorOperator = new CalculatorWithOperator();
        ICalculator calculatorMath = new CalculatorWithOperator();
        ICalculator calculatorExtends = new CalculatorWithOperator();
        double a = 8;
        double b = -22;
        Assertions.assertEquals(-14, calculatorOperator.Addition(a,b));
        Assertions.assertEquals(-14, calculatorMath.Addition(a,b));
        Assertions.assertEquals(-14, calculatorExtends.Addition(a,b));
    }

    @Test
    public void checkNegativePositiveMultiplication (){
        ICalculator calculatorOperator = new CalculatorWithOperator();
        ICalculator calculatorMath = new CalculatorWithOperator();
        ICalculator calculatorExtends = new CalculatorWithOperator();
        double a = 8;
        double b = -22;
        Assertions.assertEquals(-176, calculatorOperator.Multiplication(a,b));
        Assertions.assertEquals(-176, calculatorMath.Multiplication(a,b));
        Assertions.assertEquals(-176, calculatorExtends.Multiplication(a,b));
    }

    @Test
    public void checkNegativeMultiplication (){
        ICalculator calculatorOperator = new CalculatorWithOperator();
        ICalculator calculatorMath = new CalculatorWithOperator();
        ICalculator calculatorExtends = new CalculatorWithOperator();
        double a = -8;
        double b = -22;
        Assertions.assertEquals(176, calculatorOperator.Multiplication(a,b));
        Assertions.assertEquals(176, calculatorMath.Multiplication(a,b));
        Assertions.assertEquals(176, calculatorExtends.Multiplication(a,b));
    }

    @Test
    public void checkNormalMultiplication (){
        ICalculator calculatorOperator = new CalculatorWithOperator();
        ICalculator calculatorMath = new CalculatorWithOperator();
        ICalculator calculatorExtends = new CalculatorWithOperator();
        double a = 3;
        double b = 9;
        Assertions.assertEquals(27, calculatorOperator.Multiplication(a,b));
        Assertions.assertEquals(27, calculatorMath.Multiplication(a,b));
        Assertions.assertEquals(27, calculatorExtends.Multiplication(a,b));
    }

    @Test
    public void checkNormalDivision (){
        ICalculator calculatorOperator = new CalculatorWithOperator();
        ICalculator calculatorMath = new CalculatorWithOperator();
        ICalculator calculatorExtends = new CalculatorWithOperator();
        double a = 9;
        double b = 3;
        Assertions.assertEquals(3, calculatorOperator.Division(a,b));
        Assertions.assertEquals(3, calculatorMath.Division(a,b));
        Assertions.assertEquals(3, calculatorExtends.Division(a,b));
    }

    @Test
    public void checkNegativeDivision (){
        ICalculator calculatorOperator = new CalculatorWithOperator();
        ICalculator calculatorMath = new CalculatorWithOperator();
        ICalculator calculatorExtends = new CalculatorWithOperator();
        double a = -18;
        double b = -3;
        Assertions.assertEquals(6, calculatorOperator.Division(a,b));
        Assertions.assertEquals(6, calculatorMath.Division(a,b));
        Assertions.assertEquals(6, calculatorExtends.Division(a,b));
    }

    @Test
    public void checkZeroDivision (){
        ICalculator calculatorOperator = new CalculatorWithOperator();
        ICalculator calculatorMath = new CalculatorWithOperator();
        ICalculator calculatorExtends = new CalculatorWithOperator();
        double a = 0;
        double b = 3;
        Assertions.assertEquals(0, calculatorOperator.Division(a,b));
        Assertions.assertEquals(0, calculatorMath.Division(a,b));
        Assertions.assertEquals(0, calculatorExtends.Division(a,b));
    }

    @Test
    public void checkOnZeroDivision (){
        ICalculator calculatorOperator = new CalculatorWithOperator();
        ICalculator calculatorMath = new CalculatorWithOperator();
        ICalculator calculatorExtends = new CalculatorWithOperator();
        double a = 5;
        double b = 0;
        Assertions.assertEquals(0, calculatorOperator.Division(a,b));
        Assertions.assertEquals(0, calculatorMath.Division(a,b));
        Assertions.assertEquals(0, calculatorExtends.Division(a,b));
    }

    @Test
    public void checkNegativeSubtraction (){
        ICalculator calculatorOperator = new CalculatorWithOperator();
        ICalculator calculatorMath = new CalculatorWithOperator();
        ICalculator calculatorExtends = new CalculatorWithOperator();
        double a = -18;
        double b = -3;
        Assertions.assertEquals(-15.0, calculatorOperator.Subtraction(a,b));
        Assertions.assertEquals(-15.0, calculatorMath.Subtraction(a,b));
        Assertions.assertEquals(-15.0, calculatorExtends.Subtraction(a,b));
    }

    @Test
    public void checkNegativePositiveSubtraction (){
        ICalculator calculatorOperator = new CalculatorWithOperator();
        ICalculator calculatorMath = new CalculatorWithOperator();
        ICalculator calculatorExtends = new CalculatorWithOperator();
        double a = 8;
        double b = -22;
        Assertions.assertEquals(30.0, calculatorOperator.Subtraction(a,b));
        Assertions.assertEquals(30.0, calculatorMath.Subtraction(a,b));
        Assertions.assertEquals(30.0, calculatorExtends.Subtraction(a,b));
    }

    @Test
    public void checkNormalSubtraction (){
        ICalculator calculatorOperator = new CalculatorWithOperator();
        ICalculator calculatorMath = new CalculatorWithOperator();
        ICalculator calculatorExtends = new CalculatorWithOperator();
        double a = 9;
        double b = 3;
        Assertions.assertEquals(6, calculatorOperator.Subtraction(a,b));
        Assertions.assertEquals(6, calculatorMath.Subtraction(a,b));
        Assertions.assertEquals(6, calculatorExtends.Subtraction(a,b));
    }

    @Test
    public void checkNormalExponentiation (){
        ICalculator calculatorOperator = new CalculatorWithOperator();
        ICalculator calculatorMath = new CalculatorWithOperator();
        ICalculator calculatorExtends = new CalculatorWithOperator();
        double a = 9;
        int b = 3;
        Assertions.assertEquals(729, calculatorOperator.Exponentiation(a,b));
        Assertions.assertEquals(729, calculatorMath.Exponentiation(a,b));
        Assertions.assertEquals(729, calculatorExtends.Exponentiation(a,b));
    }

    @Test
    public void checkSqExponentiation (){
        ICalculator calculatorOperator = new CalculatorWithOperator();
        ICalculator calculatorMath = new CalculatorWithOperator();
        ICalculator calculatorExtends = new CalculatorWithOperator();
        double a = 9;
        int b = 2;
        Assertions.assertEquals(81, calculatorOperator.Exponentiation(a,b));
        Assertions.assertEquals(81, calculatorMath.Exponentiation(a,b));
        Assertions.assertEquals(81, calculatorExtends.Exponentiation(a,b));
    }

    @Test
    public void checkOneExponentiation (){
        ICalculator calculatorOperator = new CalculatorWithOperator();
        ICalculator calculatorMath = new CalculatorWithOperator();
        ICalculator calculatorExtends = new CalculatorWithOperator();
        double a = 9;
        int b = 1;
        Assertions.assertEquals(9, calculatorOperator.Exponentiation(a,b));
        Assertions.assertEquals(9, calculatorMath.Exponentiation(a,b));
        Assertions.assertEquals(9, calculatorExtends.Exponentiation(a,b));
    }

    @Test
    public void checkModule (){
        ICalculator calculatorOperator = new CalculatorWithOperator();
        ICalculator calculatorMath = new CalculatorWithOperator();
        ICalculator calculatorExtends = new CalculatorWithOperator();
        double a = 9;
        Assertions.assertEquals(9, calculatorOperator.Module(a));
        Assertions.assertEquals(9, calculatorMath.Module(a));
        Assertions.assertEquals(9, calculatorExtends.Module(a));
    }

    @Test
    public void checkNegativeModule (){
        ICalculator calculatorOperator = new CalculatorWithOperator();
        ICalculator calculatorMath = new CalculatorWithOperator();
        ICalculator calculatorExtends = new CalculatorWithOperator();
        double a = -9;
        Assertions.assertEquals(9, calculatorOperator.Module(a));
        Assertions.assertEquals(9, calculatorMath.Module(a));
        Assertions.assertEquals(9, calculatorExtends.Module(a));
    }

    @Test
    public void checkSqrt (){
        ICalculator calculatorOperator = new CalculatorWithOperator();
        ICalculator calculatorMath = new CalculatorWithOperator();
        ICalculator calculatorExtends = new CalculatorWithOperator();
        double a = 9;
        Assertions.assertEquals(3, calculatorOperator.Sqrt(a));
        Assertions.assertEquals(3, calculatorMath.Sqrt(a));
        Assertions.assertEquals(3, calculatorExtends.Sqrt(a));
    }
}
