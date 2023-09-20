// Enunciado: Crie uma função que gere os primeiros n números da sequência de Fibonacci.
fun fibonacci(n: Int): List<Int> {
    val sequencia = mutableListOf(0, 1)
    while (sequencia.size < n) {
        val proximo = sequencia[sequencia.size - 1] + sequencia[sequencia.size - 2]
        sequencia.add(proximo)
    }
    return sequencia
}
