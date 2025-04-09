public class PigLatin {
    public static Boolean check(char a)
    {
        if(a=='a' ||a=='e' ||a=='i' ||a=='o' ||a=='u' )
        {
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) 
    {
        String str="switch";
        if(check(str.charAt(0))==true)
        {
            System.out.println(str+"-yay");                
        }
        else{
            for(int i=0;i<str.length();i++)
            {
                if(check(str.charAt(i))==true)
                {
                    System.out.print(str.substring(i)+"-");
                    System.out.print(str.substring(0,i));
                    System.out.println("ay");
                    break;
                }
            }
        }
    }
}