import java.util.Scanner;


class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int A, B;

        A = sc.nextInt();
        B = sc.nextInt();

        if (A < 0 && B > 0) {
            System.out.println("2");
        } else if (A > 0 && B > 0) {
            System.out.println("1");
        } else if (A < 0 && B < 0) {
            System.out.println("3");
        } else if (A > 0 && B < 0) {
            System.out.println("4");
        }

    }
}