//Determine the given number n is an even or odd

object number
{
	def main(args:Array[String])
	{
		print("Enter a number: ");
		var n = scala.io.StdIn.readInt();

		var value = oddeven(n);

		if(value==0)
		{
			println("The number is an even number.");
		} 

		else
		{
			println("The number is an odd number.");
		}
	}

	def oddeven(n:Int):Int=
	{
		if(n==0)
		{
			return 0;
		}

		else if(n==1)
		{
			return 1;
		}

		else
		{
			oddeven(n-2);
		}
	}
}