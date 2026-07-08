class Anagrams
{
    public static void main(String []args)
    {
        String s1="anshge";
        String s2="ganesh";
        boolean ans=true;

        StringBuffer sb=new StringBuffer(s2);

        System.out.println(sb);
        
        char ch;

        for(int i=0;i<s1.length();i++)
        {
            ch=s1.charAt(i);
            for(int j=0;j<s2.length();j++)
            {
                if(sb.charAt(j)==ch)
                {
                    sb.setCharAt(j,'$');
                    j=s2.length();
                }
            
            }

        }

        for(int k=0;k<s2.length();k++)
        {
            if(sb.charAt(k)!='$')
            {
                ans= false;
            }
        }

        System.out.println(ans);


    }
}