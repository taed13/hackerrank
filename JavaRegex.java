import java.util.Scanner;

public class JavaRegex {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            String IP = scan.next();
            if (IP.matches(new MyRegex().pattern)) {
                System.out.println(IP);
            }
        }
        scan.close();

    }

}

class MyRegex {

    public String pattern;

    MyRegex() {
        String zeroTo255 = "(\\d{1,2}|(0|1)\\" + "d{2}|2[0-4]\\d|25[0-5])";
        pattern = zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255;
    }
}