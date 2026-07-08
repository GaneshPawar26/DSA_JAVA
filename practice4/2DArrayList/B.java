//maximum water in a container -brute force way O(n^2)
import java.util.Arrays;
import java.util.ArrayList;



class B
{

    public static int sol(ArrayList<Integer> list)
    {
        int maxwater=0;
        int area=0;
        int height=0;

        for(int i=0;i<list.size();i++)
        {
            for(int j=i+1;j<list.size();j++)
            {
                height=Math.min(list.get(j),list.get(i));
                area=(j-i)*height;

                if(area>maxwater)
                {
                    maxwater=area;
                }
            }
        }
        return maxwater;
    }
    public static void main(String []args)
    {
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1,8,6,2,5,4,8,3,7));

        int ans=sol(list);
        System.out.println(ans);
    }
}