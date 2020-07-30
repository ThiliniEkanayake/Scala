class account(id:String, acnum:Int, Balance:Double)
{
	var nic = id;
	var acnumber = acnum;
	var balance = Balance;
}

object Question4
{
	def main(args:Array[String])
	{
		var ac1 = new account("a111", 00001, 10000);
		var ac2 = new account("a112", 00002, 25000);
		var ac3 = new account("a113", 00003, -5000);
		var ac4 = new account("a114", 00004, 0);
		var ac5 = new account("a115", 00005, -10000);

		val bank:List[account] = List(ac1, ac2, ac3, ac4, ac5);

		//Account numbers of negative balances
		print("Negative balance account no: ");
		var NBlist = negativeB(bank);
		NBlist.foreach(x=>print(x.acnumber+" "));

		//Total account balance
		var TotalB = Balance(bank);
		print("\nTotal account balance: "+TotalB.balance);

		//Final account balance
		print("\nFinal account balance: ");
		var FBlist = finalB(bank);
		FBlist.foreach(x=>print(x+" "));
	}

	val negativeB = (list:List[account])=>list.filter(x=>x.balance<=0);
	val Balance = (list:List[account])=>list.reduce((x,y)=>new account("a110", 00000, x.balance + y.balance));
	val finalB = (list:List[account])=>list.map(x=>(if(x.balance>0) x.balance*1.05d else x.balance*1.1d));
}