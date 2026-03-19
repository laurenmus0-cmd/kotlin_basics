fun main(){
    //strings
    val course="mit"
    val last_name:String="mark"
    println("I am learning $course")
    println("my last name is $last_name")

    //numbers:integers=whole numbers
    val age:Int=20
    println("age is $age")
    //long
    val mynum:Long=1000008998807678L
    println("my long integer is $mynum")
    println(mynum::class)
    println(age::class)
    //byte
    val newnum:Byte=10
    println(newnum)
    //short
    val x: Short=300
    println(x)
    //floating point numbers-float,double
    val tax: Double=10.6
    println(tax)
    val y:Float=20.96f
    println(y)

    //character type -used to store single character
    val grade:Char='A'
    println(grade)
    //Boolean-True or False
    val is_student=true
    println(is_student::class)
    //typeconversion toInt(),toFLoat(),toShort
    val z:Float=30.78f
    println(z)
    println(z.toInt())

}