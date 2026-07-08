//maximum water in a container -optimized way O(n)
//2 pointer approach -can solve lot of questions 


import java.util.Arrays;
import java.util.ArrayList;


class C
{
    public static int sol(ArrayList<Integer> list)
    {
        int height=0;
        int currwater=0;
        int finalwater=0;
        int i=0;
        int j=list.size()-1;
        while(i<j)
        {
            height=Math.min(list.get(i),list.get(j));
            currwater=(j-i)*height;

            if(currwater>finalwater)
            {
                finalwater=currwater;
            }

            if(list.get(i)<list.get(j))
            {
                i++;
            }
            else
                j--;
        }

        return finalwater;
    }
    public static void main(String []args)
    {
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1,8,6,2,5,4,8,3,7,9));  
        list.add(3);
        System.out.println(list);

        int ans=sol(list);
        System.out.println(ans);

    }
}