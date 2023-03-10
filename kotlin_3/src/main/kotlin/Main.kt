fun main(args: Array<String>) {
    print("Введите число (целое): ")
    val num = readln().toIntOrNull()
    if (num == null) {
        print("Введите корректное число..")
    } else {
        val b = num.toString(2)
        println(b)
    }
}