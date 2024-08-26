import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    /*Pode ser feito tanto assim */
    val valor = scanner.nextDouble()
    val desconto = scanner.nextDouble()
    println(calculoPercentual(valor, desconto))

    /*tanto assim que eu acho mais prático*/
    println(calculoPercentual(scanner.nextDouble(), scanner.nextDouble()))
}

fun calculoPercentual(valor: Double, percentual: Double): Double {
    val valorDesconto = valor - ((valor * percentual) / 100)
    return valorDesconto
}