//infine supply of coins/notes find min no to make value v


class C
{
    public static void main(String args[])
    {
        int count=0;

        int coins[]={1,2,5,10,20,50,100,500,2000};
        int v=90;

        int index=0;
        while(v!=0 )
        {
            if(index>=coins.length)
            {
                v-=coins[index-1];
                index=0;
                count++;
            }

           if(coins[index]<v)
           {
            index++;
           }
           else{
            if(coins[index]==v)
            {
                v=0;
                count++;
            }
            else
            {
                v-=coins[index-1];
                count++;
                index=0;
            }
            
           }
        }

        System.out.println(count);
    }
}
