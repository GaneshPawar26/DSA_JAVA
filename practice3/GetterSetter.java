class A
{
    public void print()

    {
        System.out.println("Hii from A");
    }


    String pass="Ganesh";

    private int age=10;


    public int getAge()
    {
        int a=age;
        System.out.println(a);
        return 0;

    }

    public void setAge(int age,A a)
    {
        
        a.age=age;
        System.out.println("New Age set is "+ age);
    }

}

class GetterSetter
{
    public static void main(String []args)
    {
        A a1=new A();
        a1.print();
        System.out.println(a1.pass);

        a1.pass="Pawar";
        System.out.println(a1.pass);
        // System.out.println(a1.age);  error sice age is private variable

        a1.getAge();
        a1.setAge(89,a1);
        a1.getAge();

    }
}