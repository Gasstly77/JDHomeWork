package home_work_1;

public class SleepIn {
    public static void main(String[] args) {
        if (sleepIn(true,false)) {
            System.out.println("Спим дальше");
        } else {
            System.out.println("Встаем!");
        }
    }

    /**
     * Отвечает на вопрос, можно ли дальше спать, на основании переданных параметров.
     * @param weekday - у вас рабочий день?
     * @param vacation - у вас сейчас отпуск?
     * @return true - можно спать, false - нужно вставать
     */
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        return vacation || !weekday;
    }
}
