import java.util.*;
import java.io.*;

public class P_1920 {
    static BufferedReader br;
    static int N, M;
    static int[] arr, inputs;

    static int check(int value) {
        int L = 0, R = N - 1;

        while (L <= R) {
            int mid = (L + R) / 2;
            if (value < arr[mid]) {
                R = mid - 1;
            } else if (value > arr[mid]) {
                L = mid + 1;
            } else {
                return 1;
            }
        }

        return 0;
    }

    public static void main(String[] args) throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        M = Integer.parseInt(br.readLine());
        inputs = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        Arrays.sort(arr);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            sb.append(check(inputs[i])).append("\n");
        }

        System.out.println(sb);
    }
}
