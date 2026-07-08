import java.util.ArrayList;

class A
{
    public static void main(String []args)
    {
        ArrayList<Integer> arr=new ArrayList<>();

        arr.add(10);
        arr.add(12);
        arr.add(14);
        arr.add(16);
        arr.add(18);
        System.out.println(arr);
        System.out.println(arr.get(2));


        // operations on ArrayList
        // add--can have 1 or 2 parameters according to need
        // get
        // remove
        // set-takes two parameters index and number we want to set
        // contains

        System.out.println(arr.size());

    }
}