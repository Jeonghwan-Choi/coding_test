import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = 9;
        List<Integer> list = new ArrayList<Integer>();
        int max = Integer.MIN_VALUE;
        int maxIndex = -1;

        for (int i = 0; i < N; i++) {
            int l = sc.nextInt();
            list.add(l);
            if (l > max) {
                max = l;
                maxIndex = i + 1;
            }
        }

        System.out.println(max);
        System.out.println(maxIndex);
    }
}