

public class StringQues {
    public static void main(String[] args) {
        String s = "abc";
        int a =0;
        int b = 0;
        int c =0;
        for(int i = 0 ; i<s.length(); i++){
            if(s.charAt(i)=='a'){
                a++;
            }else if(s.charAt(i)=='b'){
                b++;
            }else if(s.charAt(i)=='c'){
                c++;
            }
        }
        int max = Math.max(a, Math.max(b, c));
        int result = max *3-s.length();
        System.out.println("Result: " + result);
}
}
