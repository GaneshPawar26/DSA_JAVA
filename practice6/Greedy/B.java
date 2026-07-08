// fractinal Knapsack

import java.util.Arrays;
import java.util.Collections;
class B
{
    public static void main(String []args)
    {
        int value[]={60,100,120};
        int weight[]={10,20,30};

        int bag=50;
        double profit=0;

        Double[][] a=new Double[value.length][2];

        for(int i=0;i<value.length;i++)
        {
            a[i][0]=(double)value[i]/weight[i];
            a[i][1]=(double)i;
        }


        System.out.println(" ....   ");
        // Arrays.sort(a,Collections.reverseOrder());
        Arrays.sort(a, (x, y) -> Double.compare(y[0], x[0]));


    

        for(int k=0;k<a.length;k++)
        {
            int index=a[k][1].intValue();
            if(weight[index]<=bag)
            {
                bag-=weight[index];
                profit+=value[index];
            }

            if(bag==0)
                break;

            if(weight[index]>bag)
            {
                
                profit+=value[index]*((double)bag/weight[index]);
                bag=0;
            }
        }

        System.out.println(bag+" "+ profit);





       

    }
}