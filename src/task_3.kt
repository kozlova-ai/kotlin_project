fun main() {
    println("Введите несколько слов")
    var line = readLine().toString()
    var lineArray = line.split(" ").toTypedArray()
    lineArray.groupingBy { it }.eachCount().forEach{
        println(it.key)
    }
}