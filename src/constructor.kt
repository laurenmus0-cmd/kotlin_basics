class Student(var name: String, var age: Int, var course:String) {
    fun info() {
        println("Student name is $name and age is $age, course: $course")
    }
}
fun main(){
    //create an object
    val student1=Student(name="jane", age=18, course="MIT")
    student1.info()
    //create another object
    val student2=Student(name="Maggie kim", age=18, course="cooking")
    student2.info()
}