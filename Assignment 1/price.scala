object price
{
	def main(args:Array[String])
	{
		var P = Co_Prize(60);	
	}
	
	def Co_Prize(x:Int):Double=
	{
		var y = 24.95*140.00/100.00;	//Price for 1 book(y)

		var z = (y*x)+3+(x-50)*0.75;

		print("The wholesale cost for copies: Rs.");
		println(z);

		return z;
	}
}