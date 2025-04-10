public class AddBinary {
    public static void main(String[] args) 
    {   StringBuilder sb=new StringBuilder();
        String a="10010";
        String b="10101";
        int a1=a.length()-1;
        int b1=b.length()-1;
        int c=0;
        while(a1>=0 ||b1>=0||c>0)
        {
            int bita = (a1 >= 0) ? (a.charAt(a1) - '0') : 0;
            int bitb = (b1 >= 0) ? (b.charAt(b1) - '0') : 0;
            int sum =bita+bitb+c;
            c=sum/2;
            sum=sum%2;
            sb.append(sum);
            a1--;
            b1--;
            
        }
        sb.reverse();
        String st=sb.toString();
        System.out.println(st);
    }
}