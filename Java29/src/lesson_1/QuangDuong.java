package lesson_1;

public class QuangDuong {
    public static void main(String[] args) {
        double t = 2.25;
        int carV = 54;
        int motorV = 38;
        double S = carV * t + motorV * t;
        System.out.println(S + "km");

        double Sbike = 4.2 *2.5;
        double Vbike = 4.2 * 5/2;
        double TBike = Sbike / Vbike;
        System.out.println(TBike + "h");
    }
}
