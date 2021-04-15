

/*
* FOR Loop
* */
fun main(args: Array<String>) {

    // val passData :Array<String> = ["Kenzo", "Arwy", "Syahputra", "Siregar"]
    // println(passData)
  val arrayname2 = arrayOf<Int>(10, 20, 30, 40, 50) // declare array
println(arrayname2)
    for (i in arrayname2) {

        if (i % 2 == 0) {
            println(i)
        }
    }

    // println()

    for (i in 10 downTo 0) {

        if (i % 2 == 0) {
            println(i)
        }
    }
}

