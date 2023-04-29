package home_work_2.loops;

import java.util.Random;

public class PTasks {

    public static void main(String[] args) {
        System.out.println("Наибольшая цифра числа - "+maxDig(123));
        System.out.println("Вероятность четных чисел - "+randomPos()+"%");
        System.out.println("Количество четных - " + evenOdd(34560)[0] + " количество нечетных - " + evenOdd(34560)[1]);
        System.out.println("Ряд Фибоначчи, первые n элементов - "+feb(6));
        System.out.println("Числово ряд из l чисел с s шагом - "+stepNumber(10,2));
        System.out.println("Перевернутое число - "+reverse(654321));
    }


    private static long maxDig(long n) {
        long max = 0;
        long num;
        while (n > 0) {
            num = n % 10;
            if (num > max) {
                max = num;
            }
            if (max == 9) {
                break;
            }

            n /= 10;
        }
        return max;
    }

    private static long[] evenOdd(long n) {
        long oddCount = 0;
        long evenCount = 0;
        long num;

        while (n > 0) {
            num = n % 10;
            if (num % 2 == 0) {
                ++evenCount;
            } else {
                ++oddCount;
            }
            n /= 10;
        }
        return new long[]{evenCount, oddCount};
    }

    private static StringBuilder feb(long n) {
        StringBuilder febNum = new StringBuilder();
        long nextNum = 0;
        long currNum = 0;
        long prevNum = 0;

        for (int i = 0; i <= n; i++) {

            nextNum = currNum + prevNum;

            if (i != n) {
                febNum.insert(febNum.length(), (nextNum + ","));
            } else {
                febNum.insert(febNum.length(), (nextNum));
            }

            prevNum = currNum;
            currNum = nextNum;

            if (currNum == 0) {
                prevNum = 1;
            }
        }
        return febNum;
    }

    private static StringBuilder stepNumber(long l, long s) {
        StringBuilder stepNum = new StringBuilder();
        long step = s;
        long len = l;
        long nextNum = 0;

        for (int i = 0; i <= len; i++) {

            nextNum = nextNum + step;

            if (i != len && i != 0) {
                stepNum.insert(stepNum.length(), (nextNum + ","));
            } else if ( i == 0) {
                stepNum.insert(stepNum.length(), ("0,"+nextNum + ","));
            }else {
                stepNum.insert(stepNum.length(), nextNum);
            }

        }
        return stepNum;
    }

    private static long reverse(long n) {
        long num = n;
        long result = 0;
        long next;

        while (num > 0) {

            next = num % 10;

            result = result * 10 + next;

            num /= 10;
        }
        return result;
    }

    private static int randomPos () {

        int checkNum;
        int even = 0;
        int numOper = 1000;
        Random randNumber = new Random();

        for (int i = 0; i <=numOper; i++) {
            checkNum = randNumber.nextInt(numOper) + 1;
            if (checkNum % 2 == 0) {
                ++even;
            }
        }

        return (int) (even*100) / numOper;

    }
}