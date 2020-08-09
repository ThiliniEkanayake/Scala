object point extends App
{
	val p1 = point(7,5)
	val p2 = point(2,3)
	val p3 = p1.move(2,7)
	val p4 = p1.distance(p2)
	val p5 = p1.invert()

	println()
	println(p1)
	println(p2)
	println()

	println("Add pointer p1 and p2: ")
	println(p1+p2)
	println()

	println("Move pointer p1 by given dx=2 and dy=7: ")
	println(p3)
	println()

	println("Distance between pointer p1 and p2: ")
	println(p4)
	println()

	println("Switch x and y coordinates of pointer p1: ")
	println(p5)
	
}

case class point(a:Int,b:Int)
{
	def x:Int = a
	def y:Int = b

	//Add two given pointers
	def +(that:point) = point(this.x+that.x,this.y+that.y)

	//Move a point by given dx and dy
	def move(dx:Int,dy:Int) = point(this.x+dx,this.y+dy)

	//Return the distance between two given points 
	def distance(that:point) = point(this.x-that.x,this.y-that.y)

	//swith x and y coordinates
	def invert() = point(a=this.y,b=this.x)
	
	
}