import java.util.*;


class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N, l, v;
        N = sc.nextInt();

        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < N; i++) {
            l = sc.nextInt();
            list.add(l);
        }

        v = sc.nextInt();
        System.out.println(Collections.frequency(list, v));
    }
}
