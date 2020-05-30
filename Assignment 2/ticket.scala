//Find the best ticket price

object ticket
{
	def main(args:Array[String])
	{
		print("Enter a ticket price: ");
		var x = scala.io.StdIn.readInt();

		val y = t_price(x);
	}

	def t_price(x:Int):Double=
	{
		//Number of attendies increases
		val m = (x-15)*20/5;

		//Total number of attendies
		val n = 120-m;

		//Profit
		val p = n*x-(500+n*3);
		print("The profit is: Rs.");
		println(p);
		
		return p;
	}
}