import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 사용자로부터 N 값을 입력받습니다.
        int N = scanner.nextInt();

        // 1부터 N까지 반복하며 각 줄에 별을 출력합니다.
        for (int i = 1; i <= N; i++) {
            // i개의 별을 출력합니다.
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // 줄바꿈을 위해 새로운 줄로 이동합니다.
            System.out.println();
        }

        scanner.close();
    }
}