import java.util.Scanner

fun main() {
    var scanner = Scanner(System.`in`)
    fazerLoop(scanner.nextInt())
}

fun fazerLoop(numero: Int) {
    for (i in 1..numero step 2) {
        println(i)
    }
}