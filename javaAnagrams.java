import java.util.Scanner;

public class javaAnagrams {
    public static boolean checkAnagrams(String str1, String str2) {
        // xoá khoảng trắng và chuyển đổi kí tự về chữ thường
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // tạo mảng đếm tần suất xuất hiện của các ký tự trong hai chuỗi
        int[] countStr1 = new int[26];
        int[] countStr2 = new int[26];

        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            countStr1[ch - 'a']++;
        }

        for (int i = 0; i < str2.length(); i++) {
            char ch = str2.charAt(i);
            countStr2[ch - 'a']++;
        }

        // so sánh hai mảng đếm tần số này
        for (int i = 0; i < 26; i++) {
            if (countStr1[i] != countStr2[i]) {
                return false;
            }
        }

        return true;

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = checkAnagrams(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }

}
