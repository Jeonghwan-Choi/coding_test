import java.util.*;


class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N, l, v;
        N = Integer.parseInt(sc.next());
        v = Integer.parseInt(sc.next());


        for (int i = 0; i < N; i++) {
            l = sc.nextInt();
            if (v > l) {
                    System.out.print(l + " ");
            }
        }

    }
}