package home_work_3.calcs.additional;

import java.util.Arrays;

public class CalculatorStringExpression {
    public static void main(String[] args) {
        String testTask = "4.1+15 * 7 + (28 / 5) ^ 2";
        String [] ab = new String[2];
        for (int i = 0; i < testTask.length(); i++) {
            testTask.indexOf("+");
        }

        FindOperations brackets = new FindOperations();

        brackets.brackets(testTask);

        System.out.println(brackets);

        String newTask = testTask.replaceAll(" +","");

        System.out.println(newTask);
//        System.out.println(testTask.indexOf("("));
//        System.out.println(testTask.indexOf(")"));
//        System.out.println(testTask.substring(15,23));

//
        char[] a = newTask.toCharArray();

        System.out.println(Arrays.toString(a));
    }
    public static class FindOperations {
        public String brackets (String task) {
            String newTask = task;
            int a = newTask.indexOf("(");
            int b = newTask.indexOf(")")+1;
            String replacement = newTask.substring(a,b);
            System.out.println(replacement);

            return newTask;
        }
    }
}
