//Kotlin Inheritance (Subclass and Superclass)
//In Kotlin, it is possible to inherit class properties and functions from one class to another. We group the "inheritance concept" into two categories:
//
//subclass (child) - the class that inherits from another class
//superclass (parent) - the class being inherited from
//In the example below, MyChildClass (subclass) inherits the properties from the MyParentClass class (superclass):
//superclass
open class MyParentClass {
    val x = 5
}

//subclass
class mychildClass:MyParentClass(){
    fun myFunction(){
        println(x)
    }
}
fun main(){
    var c1=mychildClass()
    c1.myFunction()
}