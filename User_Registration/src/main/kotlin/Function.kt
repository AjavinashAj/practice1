fun main(){

    //Kotlin Functions
    //1.pre-defined functions ex- println()

    //2.user defined functions

    println("I just got bad!")
    fun myFunction() {
        println("I just got executed!")
    }

    //calling functions

    myFunction() // Call myFunction

    // Function Parameters

    fun myFunction1(fname: String) {
        println(fname + " Doe")
    }


        myFunction1("John")
        myFunction1("Jane")
        myFunction1("George")

     // Multiple Parameters

    fun myFunction2(fname: String, age: Int) {
        println(fname + " is " + age)
    }

    myFunction2("John", 35)
    myFunction2("Jane", 32)
    myFunction2("George", 15)


// Return Values(single parameter)

    fun myFunction3(x: Int): Int {
        return (x + 5)
    }

    var result = myFunction3(3)
    println(result)

    // // Return Values(double parameter)

    fun myFunction4(x: Int, y: Int): Int {
        return (x + y)
    }
    var result1= myFunction4(2,7)
    println(result1)

    //Shorter Syntax for Return Values
    fun myFunction5(x: Int, y: Int) = x + y

    var result2 = myFunction5(3, 5)
    println(result)

    fun myFunction6(x: Int, y: Int) = x + y
     var result3=myFunction6(5,7)
    println(result3)

}