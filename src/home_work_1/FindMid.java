package home_work_1;

public class FindMid {
    public static void main(String[] args) {
        int a = 6;
        int b = 4;
        int c = 7;
        findMid(a,b,c);
        }

        public static int findMid (int a, int b, int c) {
            if ((a - b) * (c - a) >=0) {
                System.out.println("среднее значение - "+a);
                return a;
            }else if ((b - a) * (c - b) >=0) {
                System.out.println("среднее значение - "+b);
                return b;
            }else{
                System.out.println("среднее значение - "+c);
                return c;
            }
        }
    }
