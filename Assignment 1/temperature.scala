object temperature
{
	def main(args:Array[String])
	{
		var temp = convert(35);	
	}

	def convert(x:Double):Double=
	{
		var y = x*1.8+32;
		print("The temperature in Farenheit: ");
		println(y);
		return y;
	}
}