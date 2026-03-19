fun main(){
    /*
    if-used to specify a block of code to be executed if a given condition is true
    if (condition){
    //block of code to be executed if condition is true
    }
     */
    val x=5
    if (x>=3){
        println("$x is greater than 3")
    }
    //if..else
    /*
    if (condition){
    //block of code to be executed if condition is true
    }else{
    //block of code to be executed if condition is false
    }
     */
    //program that asks user for age.if age>18 they can vote
    print("enter your age: ")
    var age=readLine()!!.toInt()
    if(age>=18){
        println("you can vote")
    }else{
        println("you can't vote")
    }
}