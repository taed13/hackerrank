import java.util.Scanner;

public class javaSubstring {
    public static void main(String[] args) {
        // input Helloworld
        // 3 7
        // output: lowo
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();

        System.out.println(S.substring(start, end));
    }

}
