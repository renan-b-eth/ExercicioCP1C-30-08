import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    var soma = 0
    var numero = -1

    while (true){
        numero = scanner.nextInt()
        if(numero!=0){
            soma += numero
        } else {
           break
        }
    }
    println(soma)

}

fun loop(){
/*nao foi necessario usar*/
}