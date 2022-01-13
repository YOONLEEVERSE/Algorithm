import java.util.*;
import java.io.*;

public class P_2548 {
    static BufferedReader br;
    static int N;
    static int[] arr;

    public static void main(String[] args) throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        Arrays.sort(arr);

        int minSum = Integer.MAX_VALUE;
        int answer = 0;
        for (int i = 0; i < N; i++) {
            int curValue = arr[i];
            int sum = 0;
            for (int j = 0; j < N; j++) {
                sum += Math.abs(arr[j] - curValue);
            }
            if (sum < minSum) {
                minSum = sum;
                answer = arr[i];
            }
        }

        System.out.println(answer);
    }
}
