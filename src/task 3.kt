fun main() {
    println("Введите слово")
    var i: Int =0
    var line = readLine().toString()
    var lineArray = line.split(" ").toTypedArray()
    val list = lineArray
    list.groupingBy { it }.eachCount().forEach{
        println(it.key)
    }
}