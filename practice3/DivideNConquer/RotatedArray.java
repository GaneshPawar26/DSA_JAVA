//search element and return index of if from rotated sorted array



class RotatedArray
{

    public static int searchRotated(int arr[], int num,int start,int end)
    {
        
        while(start<=end)
        {


            int mid=(end+start)/2;

            if(arr[mid]==num)
            {
                return mid;
            }
            else
            {
                if(arr[mid]>num)
                    {
                        return searchRotated(arr,num,start,mid-1);
                    }
                    else
                    {
                        return searchRotated(arr,num,mid+1,end);

                    }
            }
        }

        return -1;
        
    }




    public static void main(String []args)
    {
        int arr[]={4,5,6,7,0,1,2};

        int num=6;
        int pivot;
        int ans;
        int i;

        for(i=0;i<arr.length-1;i++)
        {
            if(arr[i]>arr[i+1])
            {
                break;
            }
        }

        pivot=i;
        
        if(arr[0]<num)
        {
            ans=searchRotated(arr,num,0,pivot);
        }
        else
        {
            if(arr[pivot+1]<num)
            ans=searchRotated(arr,num,pivot+1,(arr.length-1));
            else
                {
                    if(arr[pivot+1]==num)
                        ans=pivot+1;
                    else
                        ans=0;
                }
        }
        

        System.out.println(pivot);
        System.out.println(ans);



    }
}