data class User (val name:String, val age:Int,val email:String){
    fun info(){
        println("USername is $name, age is $age and email is $email")
    }
}
fun manin(){
    //create an object
    val user1=User(name = "lyon", age = 17, email = "lyon@gmail.com")
    println(user1)
    user1.info()
    //copy
    val user2=user1.copy(name="cate",email="cate@gmail.com")
    println(user2)
    user2.info()
}