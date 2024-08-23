import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    /*digite a sua nota*/
    println(avaliaResultadoWhen(scanner.nextInt()))
}
fun avaliaResultadoWhen(nota: Int){
    when (nota){
        1 -> println("Pessimo")
        2 -> println("Ruim")
        3 -> println("Satisfatório")
        4 -> println("Bom")
        5 -> println("Ótimo")
    }
    /*parte a mais - para validar erro -*/
    if(nota <= 0){
        println("Nota invalida")
    }
}