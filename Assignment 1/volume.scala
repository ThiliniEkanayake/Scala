object volume
{
	def main(args:Array[String])
	{
		var x = vol(5);
	}

	def vol(r:Double):Double=
	{
		var V = (4.0/3.0)*math.Pi*r*r*r
		print("The volume of the sphere is ");
		println(V);
		return V;
	}
}