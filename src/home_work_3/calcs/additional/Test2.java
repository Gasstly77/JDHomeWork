package home_work_3.calcs.additional;

import home_work_3.calcs.additional.CalculatorStringExpression;
import home_work_3.calcs.simple.CalculatorWithMathCopy;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        String testTask = "4.1 + (15 * 7) + ((28/5) + (15-3)) ^ 2";
        testTask = testTask.replaceAll(" +","");

        do {
            testTask = FindBrackets(testTask);
            System.out.println(testTask);
        } while (testTask.indexOf("(") != -1);

        System.out.println(testTask);

        System.out.println(mathFromString(testTask));

    }

    public static String FindBrackets (String s) {
        String brackets = "";
        int startBracketIdx;
        int endBracketIdx;
        String newS = "";

        if (s.indexOf("(") != -1) {
            startBracketIdx = s.indexOf("(");
            for (int i = s.indexOf("(") + 1; i < s.length() - 1; i++) {
                if (String. valueOf(s.charAt(i)).equals("(")) {
                    startBracketIdx = i;
                }
            }

            int j = startBracketIdx;
            endBracketIdx = startBracketIdx;

            do {
                if (String. valueOf(s.charAt(j)).equals(")")) {
                    endBracketIdx = j;
                }
                j++;
            } while (endBracketIdx == startBracketIdx);

            brackets = s.substring(startBracketIdx+1, endBracketIdx);
            newS = s.substring(0,startBracketIdx) + mathFromString(brackets) + s.substring(endBracketIdx+1,s.length());
            System.out.println(newS);

        }
        return newS;
    }

    public static double mathFromString (String m) {
        double result = 0;
        CalculatorWithMathCopy calculator = new CalculatorWithMathCopy();

        while ((m.indexOf("^") != -1)) {
            int index = m.indexOf("^");
            result = calculator.Exponentiation(getLeft(m, index), (int) getRight(m, index));
            m = completeOperation(m,index,result);
            System.out.println(m);
        }

        while (m.indexOf("/") != -1) {
            int index = m.indexOf("/");

            result = calculator.Division(getLeft(m, index), getRight(m, index));
            m = completeOperation(m,index,result);
            System.out.println(m);
        }
        while (m.indexOf("*") != -1) {
            int index = m.indexOf("*");

            result = calculator.Multiplication(getLeft(m, index), getRight(m, index));
            m = completeOperation(m,index,result);
            System.out.println(m);
        }
        while (m.indexOf("+") != -1) {
            int index = m.indexOf("+");

            result = calculator.Addition(getLeft(m, index), getRight(m, index));
            m = completeOperation(m,index,result);
            System.out.println(m);
        }
        while (m.indexOf("-") != -1) {
            int index = m.indexOf("-");

            result = calculator.Subtraction(getLeft(m, index), getRight(m, index));
            m = completeOperation(m,index,result);
            System.out.println(m);
        }
        System.out.println(result);
            return result;
    }

    public static double getLeft (String s, int index) {
        String leftValue = "";
        String checkSymbol = "";
        while (index >= 1) {
            checkSymbol = String.valueOf(s.charAt(index - 1));
            if (checkSymbol.equals("+") || checkSymbol.equals("-") || checkSymbol.equals("/"))
                break;
            leftValue = String.valueOf(s.charAt(index - 1)) + leftValue;
            index--;
        }
        return Double.parseDouble(leftValue);
    }
    public static double getRight (String s, int index) {
        String rightValue = "";
        String checkSymbol = "";
        while (index < s.length()-1 ) {
            checkSymbol = String.valueOf(s.charAt(index + 1));
            if (checkSymbol.equals("+") || checkSymbol.equals("-") || checkSymbol.equals("/"))
                break;
            rightValue += String.valueOf(s.charAt(index + 1));
            index++;
        }
        return Double.parseDouble(rightValue);
    }

    public static int getLeftIndex (String t,int index) {
        int leftIndex = index -1;
        String checkSymbol = String.valueOf(t.charAt(leftIndex));
        while (!(checkSymbol.equals("+") || checkSymbol.equals("-") || checkSymbol.equals("/"))) {
            checkSymbol = String.valueOf(t.charAt(leftIndex));
            if (leftIndex == 0)
                break;
            leftIndex--;
        }
        return leftIndex;
    }

    public static int getRightIndex (String t,int index) {
        int rightIndex = index+1;
        String checkSymbol = String.valueOf(t.charAt(rightIndex));
        checkSymbol = String.valueOf(t.charAt(rightIndex));
        while (!(checkSymbol.equals("+") || checkSymbol.equals("-") || checkSymbol.equals("/"))) {
            if (rightIndex == t.length())
                break;
            rightIndex++;
        }
        return rightIndex;
    }

    public static String completeOperation (String m,int index,double result) {
        int leftIndex = getLeftIndex(m,index);
        int rightIndex = getRightIndex(m,index);
        return m = m.substring(0,leftIndex) + result + m.substring(rightIndex, m.length());
    }
}
