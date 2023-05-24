package home_work_2.loops;

import java.util.Random;

public class PTasks {
    /**
     * Поиск наибольшей цифры натурального числа
     * @param n число которое необхоимо проанализировать
     * @return наибольшую цифру указанного числа
     */
    public static long maxDig(long n) {
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

    /**
     * Возвращается количество четных и нечетных цифр числа
     * @param n число которое необхоимо проанализировать
     * @return класс в котором хранится количество четных и нечетных цифр переданного числа
     */
    public static long returnEven (long n) {
        StorageEvenOdd evenOddCount = evenOdd(n);
        return evenOddCount.even;
    }
    public static long returnOdd (long n) {
        StorageEvenOdd evenOddCount = evenOdd(n);
        return evenOddCount.odd;
    }
    public static StorageEvenOdd evenOdd(long n) {
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
        return new StorageEvenOdd(evenCount,oddCount);
    }

    /**
     * Класс для хранения результатов вычисления метода StorageEvenOdd, принимает и хранит количесто чяетных и нечетных цифр переданного числа
     */
    public static class StorageEvenOdd {
        private long odd;
        private long even;

        StorageEvenOdd (long evenCount, long oddCount) {
            this.even = evenCount;
            this.odd = oddCount;
        }
    }

    /**
     * Строит Ряд Фибоначчи
     * @param n количество цифр ряда Фибоначчи до которого будет расчет
     * @return возвращает строку в которой прописаны элементы ряда Фибоначчи до указанного элемнта
     */
    public static String feb(long n) {
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
        return febNum.toString();
    }

    /**
     * Формирует ряд чисел в указанной длины с  указанным шагом
     * @param l длинна ряда числел
     * @param s шаг с котороым будет строится ряд чисел
     * @return Возвращает строку указанной длины с рядом чисел через указанный шаг
     */
    public static String stepNumber(long l, long s) {
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
        return stepNum.toString();
    }

    /**
     * Выполняет переворот числа
     * @param n число которое необходимо перевернуть
     * @return возвращает перевернутое число
     */
    public static long reverse(long n) {
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

    /**
     *  Проверяет процент четных числел в 1000 генераций рандомного числа
     * @return Возвращает процент выпадения четных чисел
     */
    public static int randomPos () {

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

    public static boolean randomTrue () {
        if (randomPos() >= 40 && randomPos() <= 60) {
            return true;
        } else {
            return false;
        }
    }
}