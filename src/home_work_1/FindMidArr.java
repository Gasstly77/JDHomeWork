package home_work_1;

public class FindMidArr {
    public static void main(String[] args) {
        int a = 9;
        int b = 5;
        int c = 2;
        int[] arr = {a, b, c};
        findMidInArr(arr);
    }

    public static int findMidInArr (int[] arr) {
        int max = arr[0];
        int mid=0;

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

        if (max == min) {
            System.out.println("среднее значение - " + max);
            mid = max;
        } else {
            for (int j : arr) {
                if (j != max && j != min) {
                    System.out.println("среднее значение - " + j);
                    mid = j;
                }
            }
        }
        return mid;
    }
}

