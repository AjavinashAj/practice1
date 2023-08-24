import java.time.Year

class Kotlin_Class_Function (var brand:String, var model:String, var year: Int){
    //class function

    fun drive(){
        println("Start")
    }
    //Class Function Parameters
    fun speed(maxSpeed: Int) {
        println("Max speed is: " + maxSpeed)
    }


}
fun main(){
    val c1=Kotlin_Class_Function("ford","mustang",1969)
    c1.drive()
    println(c1.brand+" "+c1.model+" "+c1.year)

    c1.speed(120)
}