package home_work_2.loops;

public class MultiplyA {
    public static void main(String[] args) {

         long a = 3;
         long b = 188;
         long c = -19;
         long d = 21;

        System.out.println("результат умножения на "+a+" выполнения до переполнения - "+checkFull(a)[0]+" результат выполнения после переполнения = "+checkFull(a)[1]);
        System.out.println("результат умножения на "+b+" выполнения до переполнения - "+checkFull(b)[0]+" результат выполнения после переполнения = "+checkFull(b)[1]);
        System.out.println("результат умножения на "+c+" выполнения до переполнения - "+checkFull(c)[0]+" результат выполнения после переполнения = "+checkFull(c)[1]);
        System.out.println("результат умножения на "+d+" выполнения до переполнения - "+checkFull(d)[0]+" результат выполнения после переполнения = "+checkFull(d)[1]);
    }

    /**
     *метод для вычисления предельного значения и следующего после него при умножении переменной на передаваймый множитель
     * @param arg множитель на который умножается переменная  long a
     * @return возвращает массив чисел в котором хранится результат умножения до переолнения и после переполнения
     */

    public static long[] checkFull(long arg) {
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

        return new long[]{oldResult,a};
    }
}