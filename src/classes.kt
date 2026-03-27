//a class is a blueprint of creating objects
//object is an instance of a class
//class-has properties and methods
class Person{
    //properties
    var name:String =""
    var age:Int=0
    var gender:String=""

    fun display_info(){
        println("Name is $name and age is $age while gender is $gender")
    }
}
fun main(){
    //create an object
    val person1 = Person()
    person1.name="lauren"
    person1.gender="male"
    person1.age= 30
    //call the sidplayinfo
    person1.display_info()

    //create another object
    val person2 = Person()
    person2.name="Maggie kim"
    person2.gender="female"
    person2.age = 17
    //call the isplayinfo
    person2.display_info()

}

class Car{
    //properties
    var name:String =""
    var price:Int=0
    var color:String=""

    fun display_info(){
        println("Name is $name and price is $price")
    }

}