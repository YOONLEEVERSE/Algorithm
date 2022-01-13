import java.util.*;
import java.io.*;

public class P_1931 {
    static BufferedReader br;
    static int N;
    static Elem[] arr;
    static String[] time;

    static class Elem implements Comparable<Elem> {
        int start, end, diff;

        @Override
        public int compareTo(Elem o) {
            if (end == o.end) {
                return start - o.start;
            }
            return end - o.end;
        }

    }

    public static void main(String[] args) throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new Elem[N];
        for (int i = 0; i < N; i++) {
            time = br.readLine().split(" ");
            arr[i] = new Elem();
            arr[i].start = Integer.parseInt(time[0]);
            arr[i].end = Integer.parseInt(time[1]);
            arr[i].diff = arr[i].end - arr[i].start;
        }

        Arrays.sort(arr);

        int end = 0, answer = 0;
        for (int i = 0; i < N; i++) {
            if (arr[i].start >= end) {
                answer++;
                end = arr[i].end;
            }
        }

        System.out.println(answer);
    }
}
