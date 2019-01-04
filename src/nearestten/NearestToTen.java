package nearestten;

public class NearestToTen {
    public static void main(String[] args) {
        displayClosestToTen(8, 11);
        displayClosestToTen(7, 14);
    }

    public static void displayClosestToTen(int a, int b) {
        int x = 10 - a;
        int y = 10 - b;

        if (NearestToTen.abs(x) < NearestToTen.abs(y)) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }

    public static int abs(int a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }
}
