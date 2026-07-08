import java.util.Arrays;
import java.util.ArrayList;

class A
{
    public static void main(String []args)
    {
        ArrayList<Integer> arr=new ArrayList<>(Arrays.asList(1,4,2,5,6));


        StringBuffer sb=new StringBuffer("Ganesh");

        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(arr);
        System.out.println(arr.size());
    }
}