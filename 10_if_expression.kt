
/*
* IF as Expression
* */
fun main(args: Array<String>) {

    val a = 2

    val b = 5
 
// if(a>2){
//     print("A greater than B")
// }else{ 
//     print ("B greater than A")
// }
var newData : Int = if(a>b)   a else b

println (newData)
    var maxValue: Int = if (a > b) {
                            print("a is greater")
                            a
                        } else {
                            print("b is greater")
                            b
                        }

    println(maxValue)
}
