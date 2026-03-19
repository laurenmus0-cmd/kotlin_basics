fun main(){
    print("Enter your name: ")
    var user_name=readLine()
    print("how old are you? ")
    var age=readLine()
    println("hello good afternoon $user_name you are $age years old")
    //ask user for two number and display the sum
    print("Enter first number: ")
    var num1=readLine()!!.toInt()
    print("Enter second name: ")
    var num2=readLine()!!.toInt()
    var sum=num1 + num2
    println("sum is $sum")
}