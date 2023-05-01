package home_work_2.utils;
public class SortsUtils {

    /**
     * Метод выполняет пузырьковую сортироваку массива, данные в массиве распологаются от меньшего к большему
     * @param arr массив сортировку которого необходимо выполнить
     */
    public static void sort(int[] arr) {
        int right = arr.length-1;
        int currVal;
        int haveChanges;

        do {
            haveChanges = 0;
            for (int i = 0; i<right;i++) {
                if (arr[i] > arr[i+1]) {
                    currVal = arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=currVal;
                    haveChanges=1;
                }
            }
            right--;
        } while (haveChanges == 1);
    }

    /**
     * Метод выполняет шейкерную сортироваку массива , данные в массиве распологаются от меньшего к большему
     * @param arr массив сортировку которого необходимо выполнить
     */
    public static void shake(int[] arr) {
        int left = 0;
        int right = arr.length-1;
        int currVal;
        int haveChanges;

        do {
            haveChanges = 0;
            for (int i = left; i<right;i++) {
                if (arr[i] > arr[i+1]) {
                    currVal = arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=currVal;
                    haveChanges=1;
                }
            }
            right--;

            for (int i = right; i>left;i--) {
                if (arr[i-1] > arr[i]) {
                    currVal = arr[i];
                    arr[i]=arr[i-1];
                    arr[i-1]=currVal;
                    haveChanges=1;
                }
            }
            left++;
        } while ((left < right) && haveChanges == 1 );
    }
}
