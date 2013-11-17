/* 
 * 
 * A program to reverse multiple strings
 *
 *@ author ramesh
 */

public class ReverseString
{
	public static void main(String[] args)
	{	
		for(int i=0;i<args.length;i++)
		{
		String str=args[i];
		String reverse=new StringBuffer(str).reverse().toString();
	        System.out.println("****The reverse string is****"+reverse);
	        }
         
 
	}
}
