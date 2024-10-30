import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        String[] value = {
                "a", "b", "c", "d", "e", "f", "g", "h", "i", "j",
                "k", "l", "m", "n", "o", "p", "q", "r", "s", "t",
                "u", "v", "w", "x", "y", "z"
        };

        for (int i = 0; i < value.length; i++) {
            int position = S.indexOf(value[i]);
            if (position != -1) {
                System.out.print(position + " ");
            } else {
                System.out.print(-1 + " ");
            }
        }

    }
}