import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Main {
    static int[] dx = {0, 1, 0, -1}; // 상하좌우 방향 배열
    static int[] dy = {1, 0, -1, 0};
    static boolean[][] visited; // 방문 여부 배열
    static int[][] A, B; // 입력 배열, 거리 배열
    static int N, M; // 세로 크기, 가로 크기

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken()); // 세로 크기
        M = Integer.parseInt(st.nextToken()); // 가로 크기

        A = new int[N][M]; // 크기가 N x M인 배열 선언
        B = new int[N][M]; // 거리 기록용 배열
        visited = new boolean[N][M]; // 방문 여부 배열 초기화

        int targetX = -1, targetY = -1; // 목표 지점의 좌표

        // 입력을 받아 A 배열 초기화 및 목표 지점 좌표 설정
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                A[i][j] = Integer.parseInt(st.nextToken());
                B[i][j] = -1; // 기본적으로 모든 지점의 거리를 -1로 설정 (도달 불가 표시)
                if (A[i][j] == 2) { // 목표 지점이면
                    targetX = i;
                    targetY = j;
                    B[i][j] = 0; // 목표 지점은 거리 0
                }
                if (A[i][j] == 0) { // 갈 수 없는 땅인 경우
                    B[i][j] = 0; // 갈 수 없는 땅은 거리 0으로 설정
                }
            }
        }

        bfs(targetX, targetY); // BFS 탐색

        StringBuilder sb = new StringBuilder();
        // BFS 결과 출력
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                sb.append(B[i][j]).append(' ');
            }
            sb.append('\n');
        }
        System.out.print(sb);
    }

    // BFS 탐색
    static void bfs(int startX, int startY) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{startX, startY});
        visited[startX][startY] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                // 유효한 범위 내에서, 방문하지 않았고, 갈 수 있는 땅이면
                if (nx >= 0 && ny >= 0 && nx < N && ny < M && !visited[nx][ny] && A[nx][ny] == 1) {
                    visited[nx][ny] = true;
                    B[nx][ny] = B[x][y] + 1; // 거리 갱신
                    queue.add(new int[]{nx, ny});
                }
            }
        }
    }
}
