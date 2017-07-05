import java.io.*;
import java.util.*;
class ss
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		StringBuffer a=new StringBuffer(s);
		a.reverse();
		String str=s.replaceAll("[aeiouAEIOU]","");
		System.out.println(str);
	}
	}
