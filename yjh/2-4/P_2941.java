import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class P_2941 {
    static BufferedReader br;
    static String input;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        input = br.readLine();

        System.out.println(Pattern.compile("c-|c=|dz=|d-|lj|nj|s=|z=")
                .matcher(input)
                .replaceAll("!")
                .length());

    }
}
