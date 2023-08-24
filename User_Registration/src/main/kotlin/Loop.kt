fun main(){
    var name= arrayOf("india","russia","china","australia","usa")
    for(x in name){
        println(x)
    }

    val nums = arrayOf(1, 5, 10, 15, 20)
    for (x in nums) {
        println(x)
    }
    println("==========Range================")

    for (chars in 'a'..'x') {
        println(chars)
    }

    for (nums in 5..15) {
        println(nums)
    }

    //Check if a Value Exists
    
    val nums1 = arrayOf(2, 4, 6, 8)
    if (2 in nums1) {
        println("It exists!")
    } else {
        println("It does not exist.")
    }

    val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
    if ("skoda" in cars) {
        println("It exists!")
    } else {
        println("It does not exist.")
    }

    // Break or Continue a Range

    for (nums in 5..15) {
        if (nums == 10) {
            break
        }
        println(nums)
    }

    for (nums in 5..15) {
        if (nums == 10) {
            continue
        }
        println(nums)
    }

}