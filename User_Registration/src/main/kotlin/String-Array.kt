fun main() {
    //var name1            during declaration of variable must assign data type otherwise assign directly variable
    var name: String
    name = "jhon"
    // name1="avi"
    var name2 = "avi"
    var txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    println("The length of the txt string is: " + txt.length)
    println(name)
    println(name2)

    var txt1 = "Hello World"
    println(txt1.toUpperCase())   // Outputs "HELLO WORLD"
    println(txt1.toLowerCase())   // Outputs "hello world"

    var txt2 = "Hello World"
    var txt3 = "Hello Worl dost"
    println(txt2.compareTo(txt3))  // Outputs 0 (they are equal)

    var txt4 = "Please locate where 'locate' occurs!"
    println(txt4.indexOf("locate"))  // Outputs 7

    // concatination using '+' operator
    var firstName = "John"
    var lastName = "Doe"
    println(firstName + " " + lastName)

    // concatination using plus() function

    println(firstName.plus(lastName))
    //Boolean

    val isKotlinFun: Boolean = true
    val isFishTasty: Boolean = false
    println(isKotlinFun)   // Outputs true
    println(isFishTasty)   // Outputs false

    //Boolean Expression
    val x = 10
    val y = 9
    println(x > y)
    val x1 = 10;
    println(x1 == 1); // Returns true, because the value of x is equal to 10

    // if -condition
    val x2 = 20
    val y2 = 18
    if (x2 > y2) {
        println("x is greater than y")
    }

    //if-else condition

    val time = 20
    if (time < 18) {
        println("Good day.")
    } else {
        println("Good evening.")
    }

    //Kotlin else if
    val time1 = 22
    if (time1 < 10) {
        println("Good morning.")
    } else if (time1 < 20) {
        println("Good day.")
    } else {
        println("Good evening.")
    }
// Outputs "Good evening."

    // else-if

    val time3 = 20
    val greeting = if (time3 < 18) {
        "Good day."
    } else {
        "Good evening."
    }
    println(greeting)

    fun main() {
        val time = 20
        val greeting = if (time < 18) "Good day." else "Good evening."
        println(greeting)
    }

    // use when
    val day = 4

    val result = when (day) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid day."
    }
    println(result)

// for while-loop
    var i = 0
    while (i < 5) {
        println(i)
        i++
    }
// do-while loop
    var i1 = 0
    do {
        println(i1)
        i1++
    }
    while (i1 < 5)

    // break statement
    println("========================for break===================")
    var i2 = 0
    while (i2 < 10) {
        println(i)
        i2++
        if (i2 == 4) {
            break
        }
    }
//for continue
    println("======for continue============")
    var i3 = 0
    while (i3 < 10) {
        if (i3 == 4) {
            i3++
            break
        }
        println(i3)
        i3++
    }

    // for Arrays
    println("=======================================Arrays=================================")
    val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
    cars[0] = "Opel"
    println(cars[0])
     var l=0
    while(l<4)
    {
        println(cars[l])
        l++
    }
    println("===========array -size=========================")
    println(cars.size)
    println("====================check element exist or not====================================")
    if ("Volvo" in cars) {
        println("It exists!")
    } else {
        println("It does not exist.")
    }
    println("=======================array============================")
    var num = arrayOf(1,3,4,5,6,7,8)
    if(5 in num)
    {
        println("it exist")
    }
    else{
        println("not exist")
    }
}