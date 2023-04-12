import java.util.Scanner;

public class javaStringReverse {

    public static String compareStringReverse(String str) {
        StringBuilder reveredString = new StringBuilder(str).reverse();
        // System.out.println(str);
        // System.out.println(reveredString);
        boolean isEqual = true;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != reveredString.charAt(i)) {
                isEqual = false;
                break;
            }
        }

        if (isEqual) {
            return "Yes";
        } else {
            return "No";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(compareStringReverse(A));

    }

}
