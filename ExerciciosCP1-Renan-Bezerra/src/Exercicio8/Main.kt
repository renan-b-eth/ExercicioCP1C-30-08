//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    val coruja_1 = Coruja("Coruja_1", "Alpina")
    val coruja_2 = Coruja("Coruja_2", "Alpina_2")
    val coruja_3 = Coruja("Coruja_3", "Alpina_3")

    println(coruja_1.nome + " " + coruja_1.raca)
    println(coruja_2.nome + " " + coruja_1.raca)
    println(coruja_3.nome + " " + coruja_1.raca)

    val leao_1 = Leao("Simba", "pantera leo melanocaita")
    val leao_2 = Leao("Sarabi", "pantera leo melanocaita")
    val leao_3 = Leao("Mufasa", "pantera leo melanocaita")

    println(leao_1.nome + " " + leao_1.raca)
    println(leao_2.nome + " " + leao_2.raca)
    println(leao_3.nome + " " + leao_3.raca)

    // Demonstrando o polimorfismo
    val animais = listOf<Animal>(coruja_1, leao_1, leao_3, coruja_2)
    animais.forEach { animal ->
        animal.emitirSom()
    }

}