package date2;

public class P233
{

	public static void main(String[] args)
	{
		int n = 5;
		
		for(int j = 1;j <= n;j++)
		{
			for (int i = 1; i<=n; i++)
			{
				if(i>=j)
				{
					System.out.print("x");
				}
				else
				{
					System.out.print("-");
				}
			}
			System.out.println();
		}

	}

}
