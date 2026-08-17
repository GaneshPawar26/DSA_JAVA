
class Two
{
    public static void main(String args[])
    {
        String name="rahul";

        String name1=name;
        System.out.println(name);


        System.out.println(name==name1);

        name1+=" Jarate";

        System.out.println(name==name1);


        System.out.println(name1.charAt(4));




        StringBuffer sb=new StringBuffer();


        sb.append("Ganesh");
        System.out.println(sb);

    }

}