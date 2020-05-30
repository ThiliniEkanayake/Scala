//Addition of given n numbers

object addition
{
	def main(args:Array[String])
	{
		print("Enter a number: ");
		var n = scala.io.StdIn.readInt();

		var value = sum(n);

		print("The addition of numbers is: ");
		println(value);
	}

	def sum(n:Int):Int=
	{
		if(n==0)
		{
			return 0;
		}

		else
		{
			return n + sum(n-1);
		}
	}
}