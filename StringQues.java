import java.util.Scanner;

public class StringQues {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the string: ");
        String s = sc.nextLine();
        //String s = "abc";
        // int a =0;
        // int b = 0;
        // int c =0;
        // for(int i = 0 ; i<s.length(); i++){
        //     if(s.charAt(i)=='a'){
        //         a++;
        //     }else if(s.charAt(i)=='b'){
        //         b++;
        //     }else if(s.charAt(i)=='c'){
        //         c++;
        //     }
        // }
        // int max = Math.max(a, Math.max(b, c));
        // int result = max *3-s.length();
        // System.out.println("Result: " + result);
        int i = 0;
        char ch = 97;
        int count = 0;
        while(i<s.length()){
            if(s.charAt(i) != ch){
                count++;
                ch++;
            }else{
                i++;
                ch++;
            }
            if(ch == 100){
                ch =97;
            }
        }
        System.out.println("Result: " + count);
        
}
}
