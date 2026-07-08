//checking well parenthethis
//make a program for {[()]} type not only()

import java.util.Scanner;


import java.util.Stack;

class Sol
{
    public boolean checkSol(String s)
    {
        Stack<Character> st=new Stack<>();

        // char first=s.charAt(0);
        // if(first==')')
        //     return false;

        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='(')
                st.push('(');
            else
            {
                if(st.isEmpty())
                    return false;
                else
                    st.pop();

            }
                
        }

        if(st.isEmpty())
        {
            return true;

        }
        
        return false;

    }
}

class D
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        Sol a=new Sol();

        System.out.println("Enter the parenthesis");

        String s=sc.nextLine();

        System.out.println(a.checkSol(s));

       

    }
}