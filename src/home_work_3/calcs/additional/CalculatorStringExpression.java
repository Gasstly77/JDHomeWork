package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorStringExpression {
    public static void main(String[] args) {
        String testTask = "4.1 + 15 * 7 + (28 / 5) ^ 2";
        testTask = testTask.replaceAll(" +","");

        testTask = replaceConstant(testTask);

        if (!checkString(testTask)) {
            while (testTask.indexOf("|") != -1) {
                testTask = resolveModule(testTask);
            }
            do {
                testTask = FindBrackets(testTask);
            } while (testTask.indexOf("(") != -1);

            System.out.println(mathFromString(testTask));
        } else {
            System.out.println("Неверное выражение, вы можете использовать только цифры и переменные PI и E.");
        }
    }

    public static String replaceConstant (String testTask) {
        while (testTask.indexOf("PI") != -1) {
            int index = testTask.indexOf("PI");
            double result = Math.PI;
            testTask = completeOperation(testTask,index,result);
        }
        while (testTask.indexOf("E") != -1) {
            int index = testTask.indexOf("PI");
            double result = Math.E;
            testTask = completeOperation(testTask,index,result);
        }
        return testTask;
    }

    public static String resolveModule (String testTask) {

        String module = "";
        int startModul;
        int endModul;
        String newS = "";

        startModul = testTask.indexOf("|");

        endModul = startModul +1;
        while (!String. valueOf(testTask.charAt(endModul)).equals("|")) {
            ++endModul;
        }
        module = testTask.substring(startModul, endModul+1);
        newS = testTask.substring(0,startModul) + calculateModule(module) + testTask.substring(endModul+1,testTask.length());

        return newS;
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
        }
        return newS;
    }

    public static double calculateModule (String m) {
        double result = 0;
        CalculatorWithMathCopy calculator = new CalculatorWithMathCopy();

        int index = 0;
        double calculate = 0;
        if (String.valueOf(m.charAt(1)).equals("-")) {
            index = 1;
        }
        if (String.valueOf(m.charAt(1)).equals("-")) {
            for (int i = index + 1; i < m.length(); i++) {
                String checkSymbol = String.valueOf(m.charAt(i));
                if (!(checkSymbol.equals("+") || checkSymbol.equals("-") || checkSymbol.equals("/") || checkSymbol.equals("*") || checkSymbol.equals("^"))) {
                    calculate = Double.parseDouble(m.substring(index, m.length() - 1));
                } else {
                    calculate = mathFromString(m.substring(index + 1, m.length() - 1));
                }
            }
        } else {
            for (int i = index + 1; i < m.length(); i++) {
                String checkSymbol = String.valueOf(m.charAt(i));
                if (!(checkSymbol.equals("+") || checkSymbol.equals("-") || checkSymbol.equals("/") || checkSymbol.equals("*") || checkSymbol.equals("^"))) {
                    calculate = Double.parseDouble(m.substring(index + 1, m.length() - 1));
                } else {
                    calculate = mathFromString(m.substring(index + 1, m.length() - 1));
                }
            }
        }
        result = calculator.Module(calculate);
        return result;
    }

    public static double mathFromString (String m) {
        double result = 0;
        CalculatorWithMathCopy calculator = new CalculatorWithMathCopy();

        if (m.indexOf("|") != -1) {
            int index = 0;
            double calculate = 0;
            if (String. valueOf(m.charAt(1)).equals("-")) {
                index = 1;
            }if (String. valueOf(m.charAt(1)).equals("-")) {
                for (int i = index+1; i < m.length() ; i++) {
                    String checkSymbol = String.valueOf(m.charAt(i));
                    if (!(checkSymbol.equals("+") || checkSymbol.equals("-") || checkSymbol.equals("/") || checkSymbol.equals("*") || checkSymbol.equals("^"))) {
                        calculate = Double.parseDouble(m.substring(index, m.length()-1));
                    } else {
                        calculate = mathFromString(m.substring(index+1,m.length()-1));
                    }
                }
            } else {
                for (int i = index+1; i < m.length() ; i++) {
                    String checkSymbol = String.valueOf(m.charAt(i));
                    if (!(checkSymbol.equals("+") || checkSymbol.equals("-") || checkSymbol.equals("/") || checkSymbol.equals("*") || checkSymbol.equals("^"))) {
                        calculate = Double.parseDouble(m.substring(index+1, m.length()-1));
                    } else {
                        calculate = mathFromString(m.substring(index+1,m.length()-1));
                    }
                }
            }
            result = calculator.Module(calculate);
            m = Double.toString(result);
        }

        while (m.indexOf("^") != -1) {
            int index = m.indexOf("^");
            result = calculator.Exponentiation(getLeft(m, index), (int) getRight(m, index));
            m = completeOperation(m,index,result);
        }

        while (m.indexOf("/") != -1) {
            int index = m.indexOf("/");

            result = calculator.Division(getLeft(m, index), getRight(m, index));
            m = completeOperation(m,index,result);
        }
        while (m.indexOf("*") != -1) {
            int index = m.indexOf("*");

            result = calculator.Multiplication(getLeft(m, index), getRight(m, index));
            m = completeOperation(m,index,result);
        }
        while (m.indexOf("+") != -1) {
            int index = m.indexOf("+");

            result = calculator.Addition(getLeft(m, index), getRight(m, index));
            m = completeOperation(m,index,result);
        }
        while (m.indexOf("-") != -1 && m.indexOf("-") != 0) {
            int index = m.indexOf("-");

            result = calculator.Subtraction(getLeft(m, index), getRight(m, index));
            m = completeOperation(m,index,result);
        }
            return result;
    }

    public static double getLeft (String s, int index) {
        String leftValue = "";
        String checkSymbol = "";
        while (index >= 1) {
            checkSymbol = String.valueOf(s.charAt(index - 1));
            if (checkSymbol.equals("+") || checkSymbol.equals("-") || checkSymbol.equals("/") || checkSymbol.equals("*") || checkSymbol.equals("^"))
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
            if (checkSymbol.equals("+") || checkSymbol.equals("-") || checkSymbol.equals("/") || checkSymbol.equals("*") || checkSymbol.equals("^") )
                break;
            rightValue += String.valueOf(s.charAt(index + 1));
            index++;
        }
        return Double.parseDouble(rightValue);
    }

    public static int getLeftIndex (String t,int index) {
        int leftIndex = index -1;
        String checkSymbol;
        for (int i = leftIndex; i >=0 ; i--) {
            leftIndex = i;
            checkSymbol = String.valueOf(t.charAt(leftIndex));
            if ((checkSymbol.equals("+") || checkSymbol.equals("-") || checkSymbol.equals("/") || checkSymbol.equals("*") || checkSymbol.equals("^")))
                break;
        }
        if (leftIndex == 0 ) {
            return  leftIndex;
        } else {
            return leftIndex +1;
        }
    }

    public static int getRightIndex (String t,int index) {
        int rightIndex = index+1;
        String checkSymbol;
        for (int i = rightIndex; i < t.length() ; i++) {
            rightIndex = i;
            checkSymbol = String.valueOf(t.charAt(rightIndex));
            if ((checkSymbol.equals("+") || checkSymbol.equals("-") || checkSymbol.equals("/") || checkSymbol.equals("*") || checkSymbol.equals("^")))
                break;
        }
        return  rightIndex;
    }

    public static String completeOperation (String m,int index,double result) {
        int leftIndex = getLeftIndex(m,index);
        int rightIndex = getRightIndex(m,index);
        return m = m.substring(0,leftIndex) + result + m.substring(rightIndex, m.length());
    }

    public static boolean checkString (String text) {
        boolean hasLetters = false;
        char[] checkLetters = text.toCharArray();
        for (int i = 0; i < checkLetters.length; i++) {
            if (Character.isDigit(checkLetters[i])) {
            } else if ((checkLetters[i] != '+') && (checkLetters[i] != '-')
                        && (checkLetters[i] != '/') && (checkLetters[i] != '*')
                        && (checkLetters[i] != '^') && (checkLetters[i] != '|')
                        && (checkLetters[i] != '(') && (checkLetters[i] != ')')
                        && (checkLetters[i] != '.')) {
                hasLetters = true;
            } else if ((checkLetters[0] == '+') || (checkLetters[0] == '-') || (checkLetters[0] == '/')
                    || (checkLetters[0] == '*') || (checkLetters[0] == '^') || (checkLetters[0] == '.')) {
                hasLetters = true;
            } else if (!Character.isDigit(checkLetters[i]) && !Character.isDigit(checkLetters[i+1])) {
                if (((checkLetters[i] != '|') && (checkLetters[i] != '(') && (checkLetters[i] != ')'))
                && (checkLetters[i+1] != '|') && (checkLetters[i+1] != '(') && (checkLetters[i+1] != ')')) {
                    hasLetters = true;
                }
            }
        }
        return hasLetters;
    }
}
