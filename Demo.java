import java.lang.*;
import java.util.*;

class SString
{
	String rev(String str)
	{
		char arr[] = str.toCharArray();
		
		int i=0;
		
		while(i<arr.length)
		{
			if(i<arr.length && arr[i]==' ')
			{
				while(i<arr.length && arr[i]==' ')
				{
					i++;
				}
			}
			if(i<arr.length && arr[i]!=' ')
			{
				int j = i;
				while(i<arr.length && arr[i]!=' ')
				{
					i++;
				}
				int p = i-1;
				while(p>j)
				{
					char temp = arr[p];
					arr[p] = arr[j];
					arr[j] = temp;
					p--;
					j++;
				}
			}
		}
		String s = new String(arr);
		return s;
	}
}

class Demo
{
	public static void main(String args[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter string");
		String str = sobj.nextLine();
		
		SString obj = new SString();
		String ret = obj.rev(str);
		System.out.println("Reversed string is : "+ret);		
	}
}
