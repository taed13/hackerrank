import java.util.Scanner;

public class javaStringIntroduction {

    public static boolean lexiLarger(String str1, String str2) {
        for (int i = 0; i < str1.length() && i < str2.length(); i++) {
            if ((int) str1.charAt(i) == (int) str2.charAt(i)) {
                continue;
            } else {
                return ((int) str1.charAt(i) - (int) str2.charAt(i)) > 0 ? false : true;
            }
        }
        return true;
    }

    public static String subStringFirstLetter(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

    public static String remakeTwoString(String str1, String str2) {
        return subStringFirstLetter(str1) + " " + subStringFirstLetter(str2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length() + B.length());
        System.out.println(lexiLarger(A, B) ? "No" : "Yes");
        System.out.println(remakeTwoString(A, B));

    }

}
