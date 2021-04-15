
/*
*   Default Functions
* */
fun main(args: Array<String>) {
var values = calculateData(16,4,6)
print(values)
    var result = findVolume(2, 3)
    print(result)
}

fun findVolume(length: Int, breadth: Int, height: Int = 10): Int {

    return length * breadth * height
}

fun calculateData(param1:Int, param2:Int, param3:Int):Int{

return param1/ param2 * param3
}