//Print prime numbers less than given n

object primenumberSeq
{
	def main(args:Array[String])
	{
		print("Enter a positive number: ");
		var n = scala.io.StdIn.readInt();

		println("Prime numbers are: ");
		
		for(x<-2 to n)
		{

			var i = x/2;

			var value = primeSeq(x, i);

			if(value==true)
			{
				println(x);
			}
		}
	}

	def primeSeq(x:Int, i:Int):Boolean=
	{
		if(i==1)
		{
			return true;
		}

		else if(x%i==0)
		{
			return false;
		}

		else
		{
			primeSeq(x, i-1);
		}
	}
}