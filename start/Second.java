
class A
{
    static class B
    {
        static void print()
        {
            System.out.println("Hii");
        }
    }
}
class Second
{
    public static void main(String args[])
    {
        String name="Ganesh";

        StringBuffer sb=new StringBuffer(name);

        System.out.println(sb);

        System.out.println(sb.reverse());

        String revName=sb.reverse().toString();
        System.out.println(revName);


        A a1=new A();

        A.B.print();
    }
}