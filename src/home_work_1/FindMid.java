package home_work_1;

public class FindMid {
    public static void main(String[] args) {
        int a = 6;
        int b = 4;
        int c = 7;
        if ((a - b) * (c - a) >=0) {
            System.out.println("среднее значение - "+a);
        }else if ((b - a) * (c - b) >=0) {
            System.out.println("среднее значение - "+b);
        }else{
            System.out.println("среднее значение - "+c);
            }
        }

    }
