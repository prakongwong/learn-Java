package date2;

import java.util.Scanner;

public class P24_1
{

	public static void main(String[] args)
	{
		int a,b,c ;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Pleuse input a,b,c ");
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		if( a > 3 )
		{
			System.out.println("Red");
		}
		else
		{
			if( b <= 2 )
			{
				if( c != 5 )
				{
					System.out.println("Green");
				}
				else
				{
					System.out.println("Blue");
				}
			}
			else
			{
				System.out.println("Pink");
			}
		}

	}

}
