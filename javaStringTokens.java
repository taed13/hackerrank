import java.util.Scanner;

public class javaStringTokens {

    public static void stringTokens(String str) {

        String[] words = str.trim().split("\\s+");

        System.out.println(words.length);
        for (String word : words) {
            System.out.println(word);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        stringTokens(s);
        // Write your code here.
        scan.close();

    }
}