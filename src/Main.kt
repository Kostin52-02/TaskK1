fun main() {
    println("Vvedite stroky:")
    val input = readlnOrNull() ?: return
    val result = StringBuilder()

    if (input.isNotEmpty()) {
        var count = 1
        for (i in 1..<input.length) {
            if (input[i] == input[i - 1]) {
                count++
            } else {
                result.append(input[i - 1])
                if (count > 1) result.append(count)
                count = 1
            }
        }
        result.append(input[input.length - 1])
        if (count > 1) result.append(count)

        println(result.toString())
    } else {
        println("Stroka ne pustaya.")
    }
}
