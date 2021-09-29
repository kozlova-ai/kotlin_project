fun main() {
    println("Введите несколько слов")
    var line = readLine().toString()
    var lineArray = line.split(" ").toTypedArray().groupingBy { it }.eachCount()
    data class Word(
        val key: String,
        val count: Int
    )
    val words = mutableListOf<Word>()

    lineArray.forEach{
        words.add(Word(it.key, it.value))
    }

    var sortedByAlphabet: Boolean = true

    words.forEachIndexed{index, it ->
        if (index !== 0 && words[index].count !== words[index-1].count) {
            sortedByAlphabet = false
        }
    }

    if (sortedByAlphabet) {
        words.sortBy { it.key }
        words.forEach{
            println(it.key +" " +it.count)
        }
    } else {
        words.sortByDescending { it.count }
        words.forEach{
            println(it.key +" " +it.count)
        }
    }
}