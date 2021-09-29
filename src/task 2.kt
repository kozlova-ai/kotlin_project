fun main() {
    println("Введите слово")
    var i: Int =0
    var line = readLine().toString()
    var lineArray = line.split(" ").toTypedArray()
    lineArray = lineArray.sortedArray()
    lineArray.forEach {
        println("$it")
    }
}
