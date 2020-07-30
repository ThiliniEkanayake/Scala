class account(id:String, acnum:Int, Balance:Double)
{
	var nic = id;
	var accnumber = acnum;
	var balance = Balance;

	def withdraw(amount:Double) = 
		if(balance>amount) balance = balance - amount
		else println("Your account balance is less than the amount");

	def deposit(amount:Double) = balance = balance + amount;

	def transfer(ac:List[account], amount:Double) =
	{
		if(balance>amount)
		{
			balance = balance - amount;

			ac.head.balance = ac.head.balance +amount;
		}

		else
		{
			println("Your account balance is less than the amount");
		}
	}
}

object Question3
{
	def main(args:Array[String])
	{
		var ac1 = new account("a111", 00001, 10000);
		var ac2 = new account("a112", 00002, 25000);
		val bank:List[account] = List(ac1, ac2);

		val search = (accnumber:Int, list:List[account])=>list.filter(x=>x.accnumber.equals(accnumber));

		val x = search(00002, bank);
		ac1.transfer(x, 5000);

		println("Transferred account balance: "+ac1.balance);
		println("Received account balance: "+x.head.balance);

		
	}
}