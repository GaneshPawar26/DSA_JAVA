//count sort algo  for +ve no only

class CountSort
{
    public static void main(String []args)
    {
        int arr[]={7,5,3,4,7,1,4,1};
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)   //taking largest element from the array
        {
            largest=Math.max(largest,arr[i]);
        }



        int count[]=new int[largest+1];  // 0 to largest element size


        for(int j=0;j<=largest;j++)
        {
            count[arr[j]]++;            // frequesncy of each element from arr array
        }

        int k=0;
            for(int m=0;m<count.length;m++)
            {
                while(count[m]>0)
                {
                    arr[k]=m;                           //put back in original arr[k] array
                    k++;
                    count[m]--;
                }
            }
        
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}