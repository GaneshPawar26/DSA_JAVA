//swap 2 numbers and then sort arraylist
import java.util.Collections;
import java.util.Arrays;
import java.util.ArrayList;


class D
{
    public static void main(String []args)
    {
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(2,5,9,7,3));

        System.out.println(list);
        int k=list.get(1);
        list.set(1,list.get(2));
        list.set(2,k);
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);


    }
}