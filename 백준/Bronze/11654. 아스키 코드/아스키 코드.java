import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        byte[] bytes = S.getBytes(StandardCharsets.US_ASCII);
        System.out.println(bytes[0]);
    }
}