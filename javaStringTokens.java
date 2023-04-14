import java.util.Scanner;

public class javaStringTokens {

    public static void stringTokens(String str) {
        str = str.trim().replaceAll("\\s+", " ");
        String[] tokens = str.split("[ !,?._'@]+");
        int count = tokens.length;
        System.out.println(count);
        for (String token : tokens) {
            System.out.println(token);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        if (s.trim().isEmpty()) {
            System.out.println(0);
        } else {
            stringTokens(s);
        }
        // Write your code here.
        scan.close();

    }
}