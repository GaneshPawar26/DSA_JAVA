import java.util.Arrays;
import java.util.ArrayList;


class A
{
    public static void main(String []args)
    {
        ArrayList<ArrayList<Integer>> mainlist=new ArrayList<>();

        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(2,4,6,8,10));
        ArrayList<Integer> list1=new ArrayList<>(Arrays.asList(3,6,9));
        ArrayList<Integer> list2=new ArrayList<>(Arrays.asList(5,10,15,20,25));      

        mainlist.add(0,list);
        mainlist.add(1,list1);
        mainlist.add(2,list2);

        System.out.println(mainlist);
    }
}