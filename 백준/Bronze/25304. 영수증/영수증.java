import java.util.Scanner;


class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int X, N, a, b,sum;
        X = sc.nextInt();
        N = sc.nextInt();
        sum = 0;
        for (int i = 0; i < N; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            sum += a * b;
        }

        System.out.println(X == sum ? "Yes" : "No");
    }
}
