//arithmetic operators + - *,/,%
//operators are used to perform operations on variables and values
//+-addition
fun main() {
    var x = 10
    var y = 5
    //val+-addition
    println("The sum of $x and $y is $(x+y)")
    //- minus
    println("The difference of $x and $y is $(x-y)")
    //*-multiplication
    println("The product of $x and $y is $(x*y)")
    //division-/
    println("The division of $x and $y is $(x/y)")
    //modulus-%-the remainder of division
    println("The the remainder of division of $x and $y is $(x%y)")
    //increment-adds 1 to vaiable
    ++x //x=x+1
    println("the new value of x is $x")
    //decrement-decreases the value by 1
    --y
    println("the new value of y is $y")
    //assignment operators-used to asign values to variables =
    var a=30
    println("a is $a")
    //addition assignment operators +=
    a+=5 //x=x+5
    println("The new a is $a")
}