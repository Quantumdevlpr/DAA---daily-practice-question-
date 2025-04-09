import java.util.Scanner;

public class StringQues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = sc.nextLine();

        int i = 0;
        char ch = 'a'; // 97 in ASCII
        int count = 0;

        while (i < s.length()) {
            if (s.charAt(i) != ch) {
                count++;
            } else {
                i++;
            }
            ch++;
            if (ch == 'd') { // reset after 'c'
                ch = 'a';
            }
        }

        System.out.println("Result: " + count);
    }
}
