//String reverse using a stack 
import java.util.Stack;

class StrRev
{

    public static String sol(StringBuffer s)
    {
        // String ans="";

        // for(int i=s.length()-1;i>=0;i--)            //normal logic
        // {
        //     ans+=s.charAt(i);
        // }

        // return ans;

        Stack<Character> ch=new Stack<>();

        for(int i=0;i<s.length();i++)
        {
            ch.push(s.charAt(i));
        }
        String ans="";

        while(!ch.isEmpty())
        {
            ans+=ch.pop();
        }
        


        return ans;




    }


    public static void main(String []args)
    {
        StringBuffer sb=new StringBuffer("Ganesh");
        System.out.println(sb);


        String ans =sol(sb);
        System.out.println(ans);

    }
}