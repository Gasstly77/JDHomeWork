package home_work_2.loops;

public class Degree {
    public static String degreeResult (double num, int deg) {
        return num + " ^ " + deg + " = " + degree(num,deg);
    }
    public static double degree (double num, int deg) {
        double result = 1;

        int i = 0;

        while (i < deg) {
            result = result * num;
            i++;
        }
        return result;
    }
}
