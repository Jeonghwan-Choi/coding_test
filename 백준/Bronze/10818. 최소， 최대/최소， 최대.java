import java.util.*;


class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N, l;
        N = Integer.parseInt(sc.next());
        List<Integer> list = new ArrayList<Integer>();


        for (int i = 0; i < N; i++) {
            l = sc.nextInt();
            list.add(l);
        }
        System.out.print(Collections.min(list) + " ");
        System.out.print(Collections.max(list) + " ");

    }
}
