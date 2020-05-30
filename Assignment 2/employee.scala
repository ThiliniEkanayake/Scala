//Find the salary of an employee per week

object employee
{
	def main(args:Array[String])
	{
		var x = salary(40, 20);
	}

	def salary(n:Int,OT:Int):Double=
	{
		//Salary for normal hours
		var N_salary = n*150;
		
		//Salary for OT hours
		var OT_salary = OT*75;

		//Total salary
		var T = N_salary+OT_salary;

		var Tax = T*10/100;

		//Take home salary
		var salary = T-Tax;

		print("Take home salary is: Rs. ");
		println(salary);
		
		return salary;
	}
}