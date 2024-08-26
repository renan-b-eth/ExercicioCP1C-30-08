import java.util.*

fun main() {
    calcularMediaWhile()
}
/*so funciona com numeros inteiros o resultado*/
fun calcularMediaWhile(){
    val scanner = Scanner(System.`in`)
    var lista = mutableListOf<Double>()
    var cont = 0
    var soma = 0

    while (true){
        var numero = scanner.nextDouble()
        if(numero!=0.0){
            lista.add(numero)
        } else {
            break
        }
    }

    for (numeros in lista){
        soma += numeros.toInt()/*sem o to int não funciona no calculo*/
    }
    print(soma/lista.size)
}