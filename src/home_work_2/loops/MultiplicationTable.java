package home_work_2.loops;

public class MultiplicationTable {
    public static void main(String[] args) {

        int[] numArr = {2,3,4,5,6,7,8,9};

        String delimiter1 = "";
        String delimiter2 = "";
        String delimiter3 = "";

        for (int i = 1; i <=10; i++) {

            delimiter1 = delLength(numArr[0],i);
            delimiter2 = delLength(numArr[1],i);
            delimiter3 = delLength(numArr[2],i);

            System.out.println(numArr[0]+" x "+i+" = "+numArr[0]*i+delimiter1+numArr[1]+" x "+i+" = "+numArr[1]*i+delimiter2+numArr[2]+" x "+i+" = "+numArr[2]*i+delimiter3+numArr[3]+" x "+i+" = "+numArr[3]*i);
        }

        for (int x = 0; x < 65; x++) {
            System.out.print("_");
        }

        System.out.println("");

        for (int i = 1; i <=10; i++) {

            delimiter1 = delLength(numArr[4],i);
            delimiter2 = delLength(numArr[5],i);
            delimiter3 = delLength(numArr[6],i);

            System.out.println(numArr[4]+" x "+i+" = "+numArr[4]*i+delimiter1+numArr[5]+" x "+i+" = "+numArr[5]*i+delimiter2+numArr[6]+" x "+i+" = "+numArr[6]*i+delimiter3+numArr[7]+" x "+i+" = "+numArr[7]*i);
        }


    }

    /**
     * Метод рассчитвает размер разделителя в каждой строке для формирования ровных столбцов
     * @param num значение таблицы умножения который умножают
     * @param i множитель для значения таблицы умножения
     * @return возвращает строку которая содержит разделитель столбцов
     */
    static public String delLength (int num, int i) {

        String delimiter = "";

        if (num * i / 10 == 0 && i != 10) {
            delimiter = "     |   ";
        } else if (i == 10) {
            delimiter = "   |   ";
        } else {
            delimiter = "    |   ";
        }

        return delimiter;
    }

}
