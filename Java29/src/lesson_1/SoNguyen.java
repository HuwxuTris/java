package lesson_1;

public class SoNguyen {
    public static void main(String[] args) {
        int a = 10;
        double b = 12.22;
        String ketQuaA = (a == (int) a) ? "a là số nguyên" : "a không phải là số nguyên";

        String ketQuaB = (b == (int) b) ? "b là số nguyên" : "b không phải là số nguyên";

        System.out.println(ketQuaA);
        System.out.println(ketQuaB);
    }
}
