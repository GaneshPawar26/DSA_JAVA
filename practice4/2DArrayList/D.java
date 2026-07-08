//pair sum problem-check wheather sum of two numbers from a sorted array is equals to target number
//solved by optimized way O(n)


import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

class D
{

    public static boolean sol(ArrayList<Integer> list,int target)
    {
        int i=0;
        int j=list.size()-1;

        while(i<j)
        {
            if(list.get(i)+list.get(j)==target)
            {
                return true;
            }
            else
            {
                if(list.get(i)+list.get(j)<target)
                {
                    i++;
                }
                else{
                    j--;
                }
            }
        }


        return false;
    }
    public static void main(String []args)
    {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3,4,2,1,5,6));
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        boolean b=sol(list,8);

        System.out.println(b);

    }
}