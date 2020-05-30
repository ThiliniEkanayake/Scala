//Print first fibonacci numbers of given n

object fibprint
{
	def main(args:Array[String])
	{
		print("Enter a positive number: ");
		var n = scala.io.StdIn.readInt();

		println("Fibonacci numbers are: ");

		for(i<-1 to n)
		{
			var value = fibonacci(i);

			println(value);
		}
	}

	def fibonacci(i:Int):Int=
	{
		if(i==1)
		{
			return 0;
		}

		else if(i==2)
		{
			return 1;
		}

		else
		{
			return fibonacci(i-1) + fibonacci(i-2);
		}
	}
}