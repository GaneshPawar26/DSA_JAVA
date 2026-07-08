import java.util.Arrays;
import java.util.Collections;

class InbuildSort
{
    public static void main(String []args)
    {
        Integer a[]={3,1,7,4,9,3,6,77};
        Arrays.sort(a);
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        char ch[]={'a','g','c','f','d','o','l','x'};

        Arrays.sort(ch);

        for(int j=0;j<ch.length;j++)
        {
            System.out.print(ch[j]+" ");
        }

        Arrays.sort(a, Collections.reverseOrder());
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}