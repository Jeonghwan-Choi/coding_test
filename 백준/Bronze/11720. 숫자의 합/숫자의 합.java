import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        String b = scanner.next();

        int answer = 0;
        for (int i = 0; i < a; i++) {
            char c = b.charAt(i);
            answer += c - '0';
        }

        System.out.println(answer);
        scanner.close();
    }
}