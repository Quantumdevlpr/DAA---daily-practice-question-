public class StringMatching{
    public static void main(String[] args) {
        String str1 = "amitsingh";
        String str2 = "mit";
        System.out.println("Does \"" + str1 + "\" contain \"" + str2 + "\"? " + contains(str1, str2));
    }

    //naive algorithm
    public static boolean contains(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();
        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (str1.charAt(i + j) != str2.charAt(j)) {
                    break;
                }
            }
            if (j == m) {
                return true; // found
            }
        }
        return false; // not found
    }
}