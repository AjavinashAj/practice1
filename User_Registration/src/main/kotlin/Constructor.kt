class Bike(var brand:String,var model:String,var year:Int)
fun main(){
    val c1=Bike("hero","splender+",2022)
    println(c1.brand+" "+c1.model+" "+c1.year)

    val c2=Bike(brand = "TVS","apache-160",2021)
    val c3=Bike("royal enfield","classic-360",2018)
    println(c2.brand+" "+c2.model+" "+c2.year)
    println(c3.brand+" "+c3.model+" "+c3.year)
}