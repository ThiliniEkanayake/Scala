//Determine given number n is a prime number or not

object primenumber
{
	def main(args:Array[String])
	{
		print("Enter a positive number: ");
		var n = scala.io.StdIn.readInt();

		var i = n/2;

		var value = prime(n, i);

		if(value == true)
		{
			println("True");
		}

		else
		{
			println("False");
		}
	}

	def prime(n:Int, i:Int):Boolean=
	{
		if(i==1)
		{
			return true;
		}

		else if(n%i==0)
		{
			return false;
		}

		else
		{
			prime(n, i-1);
		}
	}
}