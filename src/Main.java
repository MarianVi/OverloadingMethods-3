import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // TODO
        int numar1 = scanner.nextInt();
        int numar2 = scanner.nextInt();
        System.out.println(multiplyWithSumI(numar1, numar2));
    }
    public static int multiplyWithSumI(int a, int b) {
        int result = 0;
        if (b > 0) {
            for (int i = 0; i < b; i++) {
                result += a;
            }
        } else if (b < 0) {
            for (int i = 0; i < -b; i++) {
                result -= a;
            }
        }
        return result;
    }
}