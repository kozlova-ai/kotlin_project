fun main() {
    println("Введите слово")
    var line = readLine().toString()
    var lineArray = line.split(" ").toTypedArray()
    lineArray.groupingBy { it }.eachCount().forEach{
        println(it.key +" " +it.value)
    }
}