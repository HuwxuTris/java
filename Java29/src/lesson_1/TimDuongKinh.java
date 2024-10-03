package lesson_1;

public class TimDuongKinh {
    public static void main(String[] args) {
        int DT = 113;
        final double PI = 3.14;
        double r2 = DT / PI;
        double r = Math.sqrt(r2);
        System.out.println("duong kinh = " + r);

        double C = 2 *r * PI;
        System.out.println("Chu vi hinh tron = " + C);
    }
}
