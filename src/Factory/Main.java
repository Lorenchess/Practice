package Factory;

public class Main {
    public static void main(String[] args) {
        System.out.println(solve(150, 30, 20, 15)); //SPECIAL
        System.out.println(solve(80, 50, 100, 25)); //SPECIAL
        System.out.println(solve(110, 80, 90, 15)); //STANDARD
        System.out.println(solve(150, 80, 90, 30)); //REJECTED
    }

    public static String solve(int width, int height, int length, int mass) {
        boolean bulky = false;
        boolean heavy = false;

        int maxVolume = 1000000;

        if (width * height * length >= maxVolume || width >= 150 || height >= 150 || length >= 150) {
            bulky = true;
        }
        if (mass >= 20) {
            heavy = true;
        }

        return (!bulky && !heavy ? "STANDARD" : bulky && heavy ? "REJECTED" : "SPECIAL");
    }
}
