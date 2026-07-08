class One
{
    public static void main(String args[])
    {
        String name="Ganesh";
        StringBuffer sb=new StringBuffer(name);

        System.out.println(sb);
        System.out.println(sb.indexOf("a"));

        StringBuffer sb1=new StringBuffer();

        for(int i=(sb.length()-1);i>=0;i--)
        {
            char c=sb.charAt(i);
            sb1.append(c);
        }

        System.out.println(sb1);

        String revName=sb1.toString();
        System.out.println(revName);
    }
}
