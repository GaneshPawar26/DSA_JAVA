class ShortestPath

{
    public static void main(String []args)
    {
        String direction="WNEENESENNN";

        System.out.println(direction);

        int x=0;
        int y=0;
        for (int i=0;i<direction.length();i++)
        {
            char ch= direction.charAt(i);
            switch(ch)
                {
                    case 'E':
                        x++;
                        break;

                    case 'W':
                        x--;
                        break;
                    case 'N':
                        y++;
                        break;
                    case 'S':
                        y--;
                        break;
                }
                
        }

        double ans;
        int k=(x*x)+(y*y);
        ans=Math.sqrt(k);
        System.out.println(x + ""+ y);

        System.out.println(ans);

    }
    
}