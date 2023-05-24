package home_work_2.loops;

public class MultiplyA {
    public static String multiplyString (long num) {

        SaveResults culcResults = checkFull(num);

        if (num == 1 || num == 0) {
            return  "Операция не имеет смысла, ответ останется - " + num;
        } else {
            return "результат умножения на " + num + " выполнений до переполнения = " + culcResults.oldResult + " результат выполнений после переполнения = " + culcResults.overflow;
        }

    }

    /**
     *метод для вычисления предельного значения и следующего после него при умножении переменной на передаваймый множитель
     * @param arg множитель на который умножается переменная  long a
     * @return возвращает массив чисел в котором хранится результат умножения до переолнения и после переполнения
     */

    public static SaveResults checkFull(long arg) {
        long a = 1;
        long isFull = 0; // 0 - means arg is ok, 1 - arg is full, stop
        long oldResult = 1;

        if (arg > 0) {
            do {
                oldResult = a;
                a = a * arg;
            }  while (oldResult < a || a == 0);
        } else if (arg < 0) {
            do {
                oldResult = a;
                a = a * arg;
            } while ((!(oldResult < 0 && a < 0)) || Math.abs(oldResult) < Math.abs(a));
        }

        return new SaveResults(oldResult,a);
    }

    private static class SaveResults {

        public long oldResult;
        public long overflow;

        SaveResults (long oldResult, long overflow) {

            this.oldResult = oldResult;
            this.overflow = overflow;
        }
    }
}