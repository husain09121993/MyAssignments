package week1.day2;

public class IsPrime 
{
	public static void main(String[] args) 
	{
		int num = 11;
		int count = 0;

		for (int i=1; i<=num; i++) 
		{
			if (num % i == 0)
			{
				count++;
			}
		}

		if (count == 2)
		{
			System.out.println("The Number is Prime");
		}
		else
		{
			System.out.println("The Number is Not Prime");
		}
	}

}
