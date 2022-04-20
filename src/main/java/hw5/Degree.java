package hw5;

public class Degree {

    public static int degreeOf(int base, int degree) {
        if (degree == 1) {
            return base;
        }
        return base * degreeOf(base, degree - 1);
    }

    public static void main(String[] args) {
        System.out.println(degreeOf(2, 3));
    }
}
