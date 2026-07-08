//print binary string of size N without consecutive ones


class BinaryString
{

public static void printBinary(int n,int k,String s)
 {
   if(n==0)
   {
        System.out.println(s);
        return ;

   }
        
   if(k==0)
   {
    
    printBinary(n-1,0,s+'0');
    printBinary(n-1,1,s+'1');
    
   }
   else
   {
    printBinary(n-1,0,s+'0');
   }
    


 }


    public static void main(String []args)
    {
        String str="";
        printBinary(4,0,str);
    }
}