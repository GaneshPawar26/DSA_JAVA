import java.util.Scanner;



class Pallendrome
{

    public static boolean solution(int num)
    {
        String s=String.valueOf(num);
        StringBuffer sb=new StringBuffer(s);
        System.out.println(sb);

        sb.reverse();

        String srev= sb.toString();
        StringBuffer sbrev=new StringBuffer(srev);


        System.out.println(sbrev);

        if(s.equals(srev))
        {
            return true;
        }
        



        return false;


    }


    public static void main(String []args)
    {
        int num;
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        
        boolean b=solution(num);
        System.out.println(b);

    }
}