import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 사용자로부터 N 값을 입력받습니다.
        int N = scanner.nextInt();

        // 1부터 N까지 반복하며 각 줄에 별을 출력합니다.
        for (int i = 1; i <= N; i++) {
            System.out.println(i);
        }

    }
}