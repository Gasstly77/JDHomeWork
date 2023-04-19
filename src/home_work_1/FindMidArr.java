package home_work_1;

public class FindMidArr {
    public static void main(String[] args) {
        int a = 9;
        int b = 5;
        int c = 2;
        int[] arr = {a, b, c};

        int max = arr[0];

        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }

        int min = arr[0];

        for (int u : arr) {
            if (u < min) {
                min = u;
            }
        }

        for (int j : arr) {
            if (j != max && j != min) {
                System.out.println("среднее значение - "+j);
            }
        }


    }
}

