import java.util.Scanner;

public class StringCompression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        if (s == null || s.length() == 0) {
            System.out.println(s);
            return;
        }

        StringBuilder compressed = new StringBuilder();

        int count = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                compressed.append(s.charAt(i - 1)).append(count);
                count = 1;
            }
        }
        compressed.append(s.charAt(s.length() - 1)).append(count);
        if (compressed.length() < s.length()) {
            System.out.println(compressed.toString());
        } else {
            System.out.println(s);
        }

        sc.close();
    }
}
