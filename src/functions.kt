//function-block of code that does a specific task
fun main(){
    println("hello from main function")
    firefox()
    firefox()
    greetings(name ="marvin",age = 17)
    greetings(name ="mary", age = 18)
    greetings(name ="luke")
    //store the returned value in a variable
    var result=addtwoNumbers(x=65, y=34)
    println(result)
    //print the returned value
    println(addtwoNumbers(x=82, y=45))
    multiply(a = 45, b = 90)
    //calculate area of a rectangle
    val length = 10
    val width = 5
    val area = rectangleArea(length, width)
    println("The area of the rectangle is $area")
    //calculate the area of a circle
    //calculate area of a circle
    val radius = 7.0
    val areaCircle = circleArea(radius)
    println("The area of the circle is $areaCircle")
}
//another function
fun firefox(){
    println("hello this is a kotlin function")
}
//function with parameters
fun greetings(name: String,age:Int=10){
    println("hi $name you are $age years old")
}
//function with return keyword
fun addtwoNumbers(x:Int, y:Int): Int{
    return x+y
}

//function that multiplys two numbers
//short hand function
fun multiply(a:Int, b:Int)=a*b

//function that calculates area of a rectangle(length*width)
fun rectangleArea(length: Int, width: Int): Int {
    return length * width
}
//function that calculates area of a circle(3.14*r*r)
fun circleArea(radius: Double): Double {
    return 3.14 * radius * radius
}

