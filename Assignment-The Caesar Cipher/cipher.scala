object cipher
{
	def main(args:Array[String])
	{
		val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

		val s = "HELLO WORLD"

		val E = (c:Char, shift:Int, a:String)=>
		{
			if(a.indexOf(c.toUpper) == -1)
			{
				c
			}
			else
			{
				a((a.indexOf(c.toUpper)+shift)%a.size)
			}
		}

		val D = (c:Char, shift:Int, a:String)=>
		{
			if(a.indexOf(c.toUpper) == -1)
			{
				c
			}
			else
			{
				if((a.indexOf(c.toUpper)-shift)>=0)
				{
					a((a.indexOf(c.toUpper)-shift)%a.size)
				}
				else
				{
					a((a.indexOf(c.toUpper)-shift)%a.size+26)
				}
			}
		}

		val cipher = (algo: (Char, Int, String)=>
		Char, s:String, shift:Int, a:String)=>
		s.map(algo(_, shift, a))

		val ct = cipher(E, s, 5, alphabet)
		val pt = cipher(D, ct, 5, alphabet)

		println(ct);
		println(pt);
	}
}