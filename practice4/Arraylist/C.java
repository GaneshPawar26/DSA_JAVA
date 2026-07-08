// find max no from arraylist

import java.util.ArrayList;
import java.util.Arrays;


class C
{
    public static void main(String []args)
    {

        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(2,5,9,3,6));
        int max=list.get(0);

        for(int i=1;i<list.size();i++)
        {
            if(list.get(i)>max)
            {
                max=list.get(i);
            }
        }

        System.out.println(max);

    }
}