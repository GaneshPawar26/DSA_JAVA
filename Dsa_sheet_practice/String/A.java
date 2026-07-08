import java.util.Scanner;

class A
{

    public static int printVowels(String s)
    {
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);

            if(ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u')
            {
                count++;
            }
        }

        return count;
    }

    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        String name;
        System.out.println("Enter the string name");
        name=sc.next();

        System.out.println(name);

        int ans=printVowels(name);

        System.out.println(ans);
    }
    
}