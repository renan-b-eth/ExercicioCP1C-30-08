package Exercicio7

import java.util.Scanner

fun main() {
    fazerLoop()
}

fun fazerLoop(){
    val carrinho: MutableMap<String, Double> = mutableMapOf()
    var soma = 0.0
    println("Vai adicinando os produtos: para finalizar digite 0 para imprimir a lista.")
    val scanner = Scanner(System.`in`)
    while(true){
        println("deseja continuar? 0 - não 1 - sim")
        val continuar = scanner.nextInt()
        if(continuar == 0){ /*se não for verdadeiro sai do loop*/
            break
        } else {
            carrinho[scanner.next()] = scanner.nextDouble() /*isso aqui faz  a adc dos itens no carrinho*/
        }

    }

    for ((produto, preco) in carrinho) {
        soma += preco
        println("$produto - R$ $preco")
        println("Média = "+ soma / carrinho.size)
    }

    while(true){
        val comparator = compareBy<Map.Entry<String, Double>> { it.value }
        val carrinhoOrdenado = carrinho.entries.sortedWith(comparator)
        println("Carrinho ordernado: ")
        println(carrinhoOrdenado)
        break
    }
}