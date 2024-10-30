import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int i = 0; i < T; i++) {
            int R = scanner.nextInt();
            String S = scanner.next();

            StringBuilder P = new StringBuilder();
            for (int j = 0; j < S.length(); j++) {
                char c = S.charAt(j);
                for (int k = 0; k < R; k++) {
                    P.append(c);
                }
            }
            System.out.println(P.toString());
        }

        scanner.close();
    }
}