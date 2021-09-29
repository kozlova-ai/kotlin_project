fun main() {
    println("Введите несколько слов")
    var line = readLine().toString()
    var lineArray = line.split(" ").toTypedArray()
    lineArray.forEach {
        println("$it")
    }
}

