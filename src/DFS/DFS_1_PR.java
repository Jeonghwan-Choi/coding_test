package DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @TITLE: 스스로 이해해보면서
 * */
public class DFS_1_PR {
    static boolean visited[];
    static ArrayList<Integer>[] A;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        visited = new boolean[n + 1];
        A = new ArrayList[n + 1];

        for (int i = 1; i < n + 1; i++) {
            A[i] = new ArrayList<Integer>();
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            A[s].add(e);
            A[e].add(s);
        }

        System.out.println("Adjacency List: " + Arrays.stream(A).toList());
        System.out.println("Visited Array1: " + convertBooleanArrayToList(visited));
        System.out.println("");

        int count = 0;
        for (int i = 1; i < n + 1; i++) {
            if (!visited[i]) {
                count++;
                DFS(i);
            }
            System.out.println("Visited Array2: " + convertBooleanArrayToList(visited));
            System.out.println("");
        }
        System.out.println("Visited Array3: " + convertBooleanArrayToList(visited));
        System.out.println(count);
    }

    private static void DFS(int v) {
        if (visited[v]) {
            return;
        }
        visited[v] = true;
        System.out.println("Visited Array4: " + convertBooleanArrayToList(visited));
        System.out.println("");

        for (int i : A[v]) {
            System.out.println("##DFS##:" + i);
            System.out.println("##VISIT##:" + visited[i]);
            if (!visited[i]) {
                DFS(i);
            }
            System.out.println("Visited Array5: " + convertBooleanArrayToList(visited));
            System.out.println("");
        }

    }

    private static List<Boolean> convertBooleanArrayToList(boolean[] array) {
        return IntStream.range(0, array.length)
                .mapToObj(i -> array[i])
                .collect(Collectors.toList());
    }
}
