package home_work_2.loops;

public class MultiplyItSelfOrd {
    public static String multiplyItSelf (String expression) {

        char[] expr = expression.toCharArray();


        if (isInteger(expr)) {
            long result = 1;
            String resultString = "";
            for (char n : expr) {
                result *= Character.getNumericValue(n);
            }
            for (int i = 0; i < expr.length; i++) {
                if (i != expr.length-1) {
                    resultString = resultString + expr[i] + " * ";
                } else {
                    resultString = resultString + expr[i] + " = " + result;
                }
            }
            return resultString;
        } else if (isDouble(expr)) {
            return "Введено не целое число";
        } else {
            return "Введено не число";
        }
    }

    public static boolean isDouble(char[] chars){
        if(chars.length == 0){
            return false;
        }
        boolean isSep = false;

        for (char c : chars) {
            if (c == ',' || c == '.') {
                if (isSep) {
                    return false;
                } else {
                    isSep = true;
                }
            } else {
                if (!Character.isDigit(c)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isInteger(char[] chars){
        if(chars.length == 0){
            return false;
        }
        for (char c : chars) {
            if(!Character.isDigit(c)){
                return false;
            }
        }
        return true;
    }
}
