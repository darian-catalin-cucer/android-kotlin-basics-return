// Examples of return in Kotlin
fun main() {
    println("The maximum of 1 and 2 is ${max(1, 2)}")
    println("The sum of 1 to 10 is ${sum(1, 10)}")
}

fun max(a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}

fun sum(start: Int, end: Int): Int {
    var total = 0
    for (i in start..end) {
        total += i
        if (total > 50) {
            return total // exit early if total exceeds 50
        }
    }
    return total
}
