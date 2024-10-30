import java.util.Scanner;

public class Main {
    private static Integer[] zeroCount = new Integer[41];
    private static Integer[] oneCount = new Integer[41];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        zeroCount[0] = 1;
        oneCount[0] = 0;

        zeroCount[1] = 0;
        oneCount[1] = 1;

        int T = scanner.nextInt();
        for (int i = 0; i < T; i++) {
            int n = scanner.nextInt();
            fibonacci(n);

            System.out.println(zeroCount[n] + " " + oneCount[n]);
        }

        scanner.close();
    }

    private static void fibonacci(int n) {
        for (int i = 2; i <= n; i++) {
            if (zeroCount[i] == null || oneCount[i] == null) {
                zeroCount[i] = zeroCount[i - 1] + zeroCount[i - 2];
                oneCount[i] = oneCount[i - 1] + oneCount[i - 2];
            }
        }
    }
}