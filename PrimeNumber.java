package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 13;
		boolean flag = false;

		for (int i = 2; i <= a / 2; i++) {

			int b = a % i;

			if (b == 0)
				flag = false;
			else
				flag = true;
		}
		if (flag= false)
		{
			System.out.println("Variable a is not a prime number");
			}
		else 
			System.out.println("variable a is a prime number");
		}

}
