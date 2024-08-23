import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    println(avaliaResultadoIf(scanner.nextInt()))
}

fun avaliaResultadoIf(nota: Int){

    if(nota <= 0){
        println("Nota invalida")
    } else if(nota == 1){
        println("pessimo")
    } else if(nota == 2){
        println("ruim")
    } else if(nota == 3){
        println("Satisfatório")
    } else if(nota == 4){
        println("Bom")
    } else if(nota == 5){
        println("Ótimo")
    }
}

