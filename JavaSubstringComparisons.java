import java.util.Scanner;

public class JavaSubstringComparisons {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);

        for (int i = 0; i <= s.length() - k; i++) {
            String subString = s.substring(i, i + k);
            if (subString.compareTo(smallest) < 0) {
                smallest = subString;
            }
            if (subString.compareTo(largest) > 0) {
                largest = subString;
            }
        }

        return smallest + "\n" + largest;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = sc.nextInt();

        System.out.println(getSmallestAndLargest(str, n));
    }

}
