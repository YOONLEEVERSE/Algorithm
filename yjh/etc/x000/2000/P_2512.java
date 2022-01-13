import java.util.*;
import java.io.*;

public class P_2512 {
    static BufferedReader br;
    static int N, M;
    static int[] arr;

    static boolean check(int limit) {
        long total = 0;

        for (int i = 0; i < N; i++) {
            total += Math.min(limit, arr[i]);
        }

        return total <= M;
    }

    public static void main(String[] args) throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        M = Integer.parseInt(br.readLine());

        Arrays.sort(arr);

        int L = 0, R = arr[N - 1], answer = 0;
        while (L <= R) {
            int mid = (L + R) / 2;
            if (check(mid)) {
                answer = mid;
                L = mid + 1;
            } else {
                R = mid - 1;
            }
        }

        System.out.println(answer);
    }
}
