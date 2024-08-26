package Exercicio9

import java.util.Scanner

class Livro(
    val titulo: String,
    val autor: String,
    val anoPublicacao: Int,
    val editora: String
) {
    override fun toString(): String {
        return "Titulo = '$titulo', \nAutor = '$autor', \nAno Publicacao = $anoPublicacao \nEditora = '$editora'"
    }
}

fun main() {
    val scanner = Scanner(System.`in`)
    val livro1 = Livro(scanner.next(), scanner.next(), scanner.nextInt(), scanner.next())
    println(livro1)
}