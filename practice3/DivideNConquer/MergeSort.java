class MergeSort
{

    public static void merge_sort(int arr[],int start,int end)
    {
        if(start<end)
        {
            int mid=(start+end)/2;
            merge_sort(arr,start,mid);
            merge_sort(arr,mid+1,end);
        }
        else
        {
            merge(arr,start,mid,end);
        }

        return;
    }

    public static void merge(int arr,int start,int mid,int end)
    {
        int temp[]=new int[(end-start)+1];

        for(int i=start;i<=mid;i++)
        {
            
        }
    }
    public static void main(String []args)
    {
        int arr[]={4,9,5,7,2,3,1,6};

        // for( int n : arr)
        // {
        //     System.out.print(n+" ");
        // }
            int start=0;
            int end=arr.length-1;
            int mid=(start+end)/2;



        merge_sort(arr,start,mid);
        merge_sort(arr,mid+1,end);
    }
}