package Day1;

public class PrimeNumbers
{
	public static void main(String args[])
	{
		int num = 13;
		boolean output = false;
		int value = num/2;
		for (int i = 2; i < value; i++)
		{
			if (num % i == 0) {
				System.out.println(num + " is not a primenumber");
				output = true;
				break;
			} else 
			{
				System.out.println(num + " is a prime number ");
				output = false;
				break;
			}
		}

	}


}