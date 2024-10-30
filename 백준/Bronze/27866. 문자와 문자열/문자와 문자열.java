import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String b = scanner.next();
        int a = scanner.nextInt();

        String[] c = b.split("");
        System.out.println(c[a-1]);

    }
}