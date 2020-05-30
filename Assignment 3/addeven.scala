//Addition of even numbers less than given n

object addeven
{
	def main(args:Array[String])
	{
		print("Enter a number: ");
		var n = scala.io.StdIn.readInt();

		var i = n-1;

		var value = addition(i);

		print("The addition of the even numbers: ");
		println(value);
	}

	def addition(i:Int):Int=
	{
		if(i==0)
		{
			return 0;
		}
		
		else if(i%2==0)
		{
			return i + addition(i-1);
		}

		else
		{
			return addition(i-1);
		}
	}
}